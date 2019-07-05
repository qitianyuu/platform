<%--
  Created by IntelliJ IDEA.
  User: qi
  Date: 2019/7/4
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <%@include file="/include.jsp" %>
    <script type="text/javascript" src="<%=basePath %>js/My97DatePicker/WdatePicker.js"></script>
    <style>
        body{font-family:"微软雅黑";padding-top:10px;margin:0px;}
    </style>
    <script >
        function addPtOrgan(obj) {
            var url= $(obj).attr("url");
            $("#tabTitle").html($(obj).html());
            window.location="";

        }


    </script>
    <script>
        function createHttpRequest()
        {
            var xmlHttp=null;
            try{
                // Firefox, Opera 8.0+, Safari
                xmlHttp=new XMLHttpRequest();
            }catch (e){
                // Internet Explorer
                try{
                    xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
                }catch (e){
                    try{
                        xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                    }catch (e){
                        alert("您的浏览器不支持AJAX！");
                    }
                }
            }
            return xmlHttp;
        }

        function uploadFileToServer(){
            var uploadFile = document.getElementById("upload_file_id");
            var uploadTip = document.getElementById("upload_tip_id");
            var uploadProgress = document.getElementById("upload_progress_id");

            if(uploadFile.value==""){
                uploadTip.innerText="请选择一个文件";
            }else if(uploadFile.files[0].size>1024 &&uploadFile.files[0].size<(40*1024*1024)){
                try{
                    if(window.FileReader){
                        var fReader = new FileReader();
                        var xhreq=createHttpRequest();
                        xhreq.onreadystatechange=function(){
                            if(xhreq.readyState==4){
                                if(xhreq.status==200){
                                    uploadTip.innerText="文件上传成功";
                                    setTimeout(function(){
                                        hideUploadDialog()
                                    },2000);	//2秒后隐藏
                                }else{
                                    uploadTip.innerText="文件上传失败了";
                                }
                            }
                        }
                        fReader.onload=function(e){
                            xhreq.open("POST","/upload/file",true);
                            xhreq.setRequestHeader("Content-type", "application/octet-stream"); //流类型
                            xhreq.setRequestHeader("Content-length", fwFile.files[0].size);     //文件大小
                            xhreq.setRequestHeader("uploadfile_name", encodeURI(fwFile.files[0].name)); //兼容中文
                            xhreq.send(fReader.result);
                        }
                        fReader.onprogress = function(e){
                            uploadProgress.value = e.loaded*100/e.total;
                        }
                        fReader.readAsArrayBuffer(uploadFile.files[0]);
                        uploadProgress.style.visibility="visible";
                        uploadProgress.value = 0;
                    }else{
                        uploadTip.innerText="浏览器不支持上传文件";
                    }
                }catch(e){
                    uploadTip.innerText="文件上传失败";
                }
            }else{
                uploadTip.innerText="文件不符合要求";
            }
        }
        function showUploadDialog(){
            var up_dialog=document.getElementById("upload_dialog");
            document.getElementById("upload_tip_id").innerText="请选择要上传的文件";
            document.getElementById("upload_progress_id").style.visibility="hidden";
            up_dialog.style.visibility="visible";

        }
        function hideUploadDialog(){
            var up_dialog=document.getElementById("upload_dialog");
            document.getElementById("upload_progress_id").style.visibility="hidden";
            up_dialog.style.visibility="hidden";
        }
    </script>
    <script type="text/javascript">
        function setURL(obj){
            var url= $(obj).attr("url");
            $("#tabTitle").html($(obj).html());
            $("#mainFrame").attr("src",url);
        }
        function testform() {

        }
    </script>
</head>
<body>
    <div>
        <ul class="nav nav-pills nav-justified" style="border-bottom:solid 3px rgb(66, 139, 202);">
            <li  class="active" role="presentation" style="width:120px;">
                <a href="javascript:void(0)" id="tabTitle" >基本信息</a>
            </li>
        </ul>
    </div>
    <form class="form-inline" id="treaty1" method="post" action="/treaty/submit" >
    <div class="panel panel-default">
        <div class="panel-body">

                <div class="form-group">
                    <label >交易合同编号</label>
                    <input type="text" class="form-control input-sm" name="treatyid" value="" id="treatyid" placeholder="交易合同编号">
                </div>
                <div class="form-group">
                    <label >签署日期</label>
                    <input type="text"  onFocus="WdatePicker()"  value="" class="Wdate form-control input-sm"  name="signaturedate" id="signaturedate" placeholder="签署日期">
                </div>
                <div class="form-group">
                    <label >采购方名称（甲方）</label>
                    <input type="text" class="form-control input-sm" name="name1" value="" id="name1" placeholder="采购方名称（甲方）">
                </div>
                <div class="form-group">
                    <label >供应商名称（乙方）</label>
                    <input type="text" class="form-control input-sm" name="name2" value="" id="name2" placeholder="供应商名称（乙方）">
                </div>
                <div class="form-group">
                    <label >运输方式</label>
                    <select class="form-control input-sm" name="inuse" id="transType">
                        <option value="">请选择</option>
                        <option value="1">火车</option>
                        <option value="0">汽车</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="inuse">验收方式</label>
                    <select class="form-control input-sm" name="inuse" id="inuse">
                        <option value="">请选择</option>
                        <option value="1">到场验收</option>
                        <option value="0">其他</option>
                    </select>
                </div>
                <div class="form-group">
                    <label >交货开始时间</label>
                    <input type="text"  onFocus="WdatePicker()"  value="" class="Wdate form-control input-sm"  name="deliveryBegin" id="deliveryBegin" placeholder="交货开始时间">
                </div>
                <div class="form-group">
                    <label >交货结束时间</label>
                    <input type="text"  onFocus="WdatePicker()"  value="" class="Wdate form-control input-sm"  name="deliveryEnd" id="deliveryEnd" placeholder="交货结束时间">
                </div>
        </div>
    </div>
    <div class="alert alert-info" role="alert">
        <strong>序号 煤种 采购数量（万吨）热卡值 操作</strong>
    </div>


    <%--下面是上传模块，还没调试
    <div id="upload_dialog" class="upload_dialog_div">
        <div class="style_content_div">
            <div class="style_content_upper_div">
                <div class="style_content_file_div">
                    <span class="style_file_span"> 文件路径：</span>
                    <input class="style_file_content" type="file" id="upload_file_id"/>
                </div>
                <div class="style_content_prog_div">
                    <span class="style_prog_span_hit" id="upload_tip_id"> 请选择要上传的文件 </span>
                    <progress class="style_prog_content" id="upload_progress_id" value="0" max="100"></progress>
                </div>
            </div>
            <div class="style_content_lower_div">
                <span class="style_content_span" onmouseover="this.style.background='#cccccc'" onmouseout="this.style.background=''" onclick="hideUploadDialog()">取消</span>
                <span class="style_content_span" onmouseover="this.style.background='#F5CCDC'" onmouseout="this.style.background=''" onclick="uploadFileToServer()">确定</span>
            </div>
        </div>
    </div>--%>
        <div class="form-group">
            <label >备注</label>
            <textarea  class="form-control" name="remarks" id="remarks" rows="3"></textarea>
        </div>
        <input type="submit"  class="btn btn-primary" value="保存" >
        <button type="button" class="btn btn-primary" >提交</button>
        <button type="button" class="btn btn-primary" >返回</button>
    </form>
</body>
</html>
