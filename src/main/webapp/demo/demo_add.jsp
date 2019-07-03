<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

  <%@include file="/include.jsp" %>
   <script type="text/javascript" src="<%=basePath %>js/My97DatePicker/WdatePicker.js"></script>
<style>
	   body{font-family:"微软雅黑";padding-top:10px;margin:0px;}
	   .labelField{width:130px;}
	   .form-group{padding-bottom:15px;padding-left:20px;}
	   .dropul li{float:left; width:460px;}
	   .dropul{width:460px;height:200px;overflow:auto;}
	   .dropDown_title span{display:block;width:150px;float:left;border-bottom:solid 1px #ccc; text-align:center;font-weight:bold;}
	   .dropDown_rows span{display:block;width:150px;float:left;border-bottom:solid 1px #ccc;   }
	</style>

	  

</head>
<body>

			<!--toolsbar-->
			<div class="panel panel-default">
			
	        <div class="panel-body container">
               <form class="form-inline" id="organAddForm" action="<%=basePath %>orgin/organControl?action=organAdd" method="post">
				  <div class="form-group">
				    <label for="organName" class="labelField">组织机构名称：</label>
				    <input type="text" class="form-control"    name="organName" id="organName"placeholder="请输入名称" >
				  </div>
				  <div class="form-group">
				    <label for="organShortName" class="labelField">英文简称：</label>
				    <input type="text" class="form-control" name="organShortName" id="organShortName" placeholder="请输入四位英文简称">
				  </div>
				  <br>
				  <div class="form-group">
				    <label for="account" class="labelField">银行账户：</label>
				    <input type="text" class="form-control" name="account" id="account"placeholder="请输入组织机构账户" >
				  </div>
				  <div class="form-group">
				    <label for="organType" class="labelField">组织机构类型：</label>
				    <input type="text" class="form-control" name="organType" id="organType" placeholder="请输入类型">
				  </div>
				  <br>
				  <div class="form-group">
				    <label for="inuse" class="labelField">启用/禁用：</label>
				    <select class="form-control input-sm" name="inuse" id="inuse">
  							   <option value="1">启用</option>
							   <option value="0"> 禁用</option>
					</select>
				  </div>
				   
				 
				   <input type="hidden" id="hideParentOrgan"  name="hideParentOrgan"> <!-- 存向后台传的上级组织机构编号 -->
				  <div class="form-group">
				        <label for="inuse" class="labelField">上级组织机构：</label>
				     <div class="btn-group">
						 	<button class="btn btn-default btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						    <span id="dropdownOrgan">选择类型
						    
						    </span> <span class="caret"></span>
						  </button>
						   <ul class="dropdown-menu dropul" >
						       <li class="dropDown_title"  id="dorpDown_title">
						          <span>编号</span><span>名称</span><span>类型</span>
						       </li> 

						  </ul>
					</div>
				  </div>
				  <br>
				  <div class="form-group">
				    <label for="desc" class="labelField">描述：</label>
				    <textarea class="form-control" id="desc" name="desc" rows="3" cols="40"></textarea>
				  </div> 
				  <div style="clear:both;padding-left:260px;padding-top:30px;">
				  <button type="button" class="btn btn-primary"  id="saveBtn" >保存</button><!-- data-toggle="modal" data-target="#myModal" -->
				   <button type="button" class="btn btn-primary"  id="resetBtn" >取消</button><!-- data-toggle="modal" data-target="#myModal" -->
				  </div>
			</form>
			 
		    </div>
		   </div>
             
        
      

  </body>

</html>
