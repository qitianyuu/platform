<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daijiankun laptop
  Date: 7/7/2019
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>采购需求查询</title>
    <%@include file="/include.jsp"%>
    <script type="text/javascript" src="<%=basePath %>js/My97DatePicker/WdatePicker.js"></script>
    <style>
        body{font-family:"微软雅黑";padding-top:10px;margin:0px;}
        .labelField{width:130px;}
        .form-group{padding-bottom:15px;padding-left:20px;}
        .dropul li{float:left; width:460px;}
        .dropul{width:460px;height:200px;overflow:auto;}
        .dropDown_title span{display:block;width:150px;float:left;border-bottom:solid 1px #ccc; text-align:center;font-weight:bold;}
        .dropDown_rows span{display:block;width:150px;float:left;border-bottom:solid 1px #ccc;}

    </style>
</head>
<body>

<div class="panel panel-info">

    <div class="panel-heading">
        <h1 class="panel-title">采购申请列表</h1>
    </div>
    <div class="panel-body">
        <div class="input-group">
            <form class="form-inline" method="post">
                <div class="form-group">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">采购单状态</button>
                    </span>
                </div>

                <div class="form-group">
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 全部
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 草稿
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 审核中
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 已发布
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 已驳回
                    </label>
                </div>


                <div class="table-responsive" style="overflow-y:hidden">
                    <table class="table table-striped" >
                        <tbody>
                            <tr>
                                <th>序号</th><th>单据编号</th><th>创建日期</th><th>煤种</th><th>数量(万吨)</th><th>结算方式</th><th>发起人</th><th>状态</th><th>操作</th>
                            </tr>

                            <c:forEach items="${applyList}" var="e">
                                <tr>
                                    <td>${e.purchapplyid}</td><td>${e.templateid}</td><td>${e.createdate}</td><td>${e.coaltype}</td><td>${e.billnumber}</td><td>${e.paymode}</td><td>${e.createuser}</td><td>${e.applystate}</td><td></td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>

                    <nav  >
                        <ul class="pagination"  >
                            <li class="disabled" ><a  href="javascript:void(0)" onmouseout="pageOut(this)" onmouseover="pageOver(this)"  >首页 <span class="sr-only">首页</span></a></li>
                            <li class="disabled"><a href="javascript:void(0)"  onmouseout="pageOut(this)" onmouseover="pageOver(this)" aria-label="Previous"  ><span aria-hidden="true">上一页&laquo;</span></a></li>
                            <li class="disabled"><a href="javascript:void(0)" onmouseout="pageOut(this)" onmouseover="pageOver(this)" aria-label="Previous"  ><span aria-hidden="true">下一页&raquo;</span></a></li>
                            <li class="disabled"><a href="javascript:void(0)" onmouseout="pageOut(this)" onmouseover="pageOver(this)"  >尾页 <span class="sr-only" >尾页</span></a></li>
                            <li class="disabled"><a href="javascript:void(0)" > &nbsp; &nbsp; &nbsp;当前第xx页
                                &nbsp; &nbsp; &nbsp; 总页数：xx页  &nbsp;&nbsp;总记录数：xx</a></li>

                        </ul>
                    </nav>
                </div>



            </form>
        </div>

    </div>
</div>

</body>
</html>
