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
	<script>
	  
	    

	</script>
</head>
<body>
 <div>
<!--tab-->
<ul class="nav nav-pills nav-justified" style="border-bottom:solid 3px rgb(66, 139, 202);">
	<li  class="active" role="presentation" style="width:120px;">
		<a href="javascript:void(0)" id="tabTitle" >组织机构信息</a>
	</li>
</ul>
 	<input type="hidden" value="<%=basePath %>" id="path">
			<!--toolsbar-->
			<div class="panel panel-default">
	        <div class="panel-body">

			<form class="form-inline" id="searchform" method="post">
			   
				  <div class="form-group">
					<label for="organName">名称</label>
					<input type="text" class="form-control input-sm" name="organName" value="${organName}" id="organName" placeholder="组织机构名称">
				  </div>
				  <div class="form-group">
					<label for="inuse">启用/禁用</label>
					  <input type="hidden" value="${inuse}" id="inuse_show">
					 <select class="form-control input-sm" name="inuse" id="inuse">
  							   <option value="">--全部--</option>
  							   <option value="1">启用</option>
							   <option value="0"> 禁用</option>
					</select>
					<script type="text/javascript">
					   $("#inuse").val($("#inuse_show").val());
					</script>
				  </div>
				  <div class="form-group">
					<label for="modDate">日期</label>
					<input type="text"  onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="起始日期">-
					<input type="text" onFocus="WdatePicker()" value="${modDateMax}"  class="Wdate form-control input-sm" name="modDateMax"  id="modDateMax" placeholder="截止日期">
				  </div>
					<button type="button" class="btn btn-primary" onclick="mainPage()">查询</button>
					<button type="button" class="btn btn-primary" onclick="addPtOrgan()">添加</button>
		   </form>
		   </div>
		   </div>
            <!--datagrid-->
            <div class="table-responsive" style="overflow-y:hidden">
               <table class="table table-striped" >
                   <tbody>
						<tr>
							 <th>姓名</th><th>Hiredate</th><th>部门</th> <th>操作</th>
						</tr>
						<c:forEach items="${rows}" var="e">
						<tr>
							<td>${e.ename}</td><td>${e.hiredate}</td><td>${e.dname}</td> <td>操作</td>
						</tr>
						</c:forEach>
				   </tbody>
              </table>
			     <!--分页-->
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
        
      </div>
    </div>
</div>

<!--xxx-->
 <div>
	 <!--tab-->
	 <ul class="nav nav-pills nav-justified" style="border-bottom:solid 3px rgb(66, 139, 202);">
		 <li  class="active" role="presentation" style="width:120px;">
			 <a href="javascript:void(0)" id="tabTitle" >组织机构信息</a>
		 </li>
	 </ul>
	 <input type="hidden" value="<%=basePath %>" id="path">
	 <!--toolsbar-->
	 <div class="panel panel-default">
		 <div class="panel-body">

			 <form class="form-inline" id="searchform" method="post">

				 <div class="form-group">
					 <label for="organName">名称</label>
					 <input type="text" class="form-control input-sm" name="organName" value="${organName}" id="organName" placeholder="组织机构名称">
				 </div>
				 <div class="form-group">
					 <label for="inuse">启用/禁用</label>
					 <input type="hidden" value="${inuse}" id="inuse_show">
					 <select class="form-control input-sm" name="inuse" id="inuse">
						 <option value="">--全部--</option>
						 <option value="1">启用</option>
						 <option value="0"> 禁用</option>
					 </select>
					 <script type="text/javascript">
						 $("#inuse").val($("#inuse_show").val());
					 </script>
				 </div>
				 <div class="form-group">
					 <label for="modDate">日期</label>
					 <input type="text"  onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="起始日期">-
					 <input type="text" onFocus="WdatePicker()" value="${modDateMax}"  class="Wdate form-control input-sm" name="modDateMax"  id="modDateMax" placeholder="截止日期">
				 </div>
				 <button type="button" class="btn btn-primary" onclick="mainPage()">查询</button>
				 <button type="button" class="btn btn-primary" onclick="addPtOrgan()">添加</button>
			 </form>
		 </div>
	 </div>
	 <!--datagrid-->
	 <div class="table-responsive" style="overflow-y:hidden">
		 <table class="table table-striped" >
			 <tbody>
			 <tr>
				 <th>姓名</th><th>Hiredate</th><th>部门</th> <th>操作</th>
			 </tr>
			 <c:forEach items="${rows}" var="e">
				 <tr>
					 <td>${e.ename}</td><td>${e.hiredate}</td><td>${e.dname}</td> <td>操作</td>
				 </tr>
			 </c:forEach>
			 </tbody>
		 </table>
		 <!--分页-->
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

 </div>
 </div>
 </div>
  </body>



</html>
