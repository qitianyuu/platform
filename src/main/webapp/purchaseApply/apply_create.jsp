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
	   body{font-family:"微软雅黑";padding-top:10px;margin:10px;}
	   .row {
		   margin-top: 10px;
		   margin-bottom: 10px;
	   }
	   .center-block {
		   display: block;
		   margin-left: 200px;
		   margin-right: auto;
	   }


	</style>

	<script>
	  
	    

	</script>
</head>
<body>

<div class="container-fluid">

	<form class="needs-validation " novalidate>

		<div class="panel panel-info">
			<div class="panel-heading">
				<h1 class="panel-title">基本情况</h1>
			</div>
			<div class="panel-body">
				<div class="row form-inline">
					<div class="col-md-4">
						<label for="modDate">报价截止时间</label>
						<input type="text"  onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="截止时间">
					</div>
				</div>
				<h1></h1>


				<div class="row form-inline">
					<div class="col-sm-3">
						<label for="firstName">申请单位：</label>
						<input type="text"size="10" class="form-control" id="firstName" placeholder="" value="" required>
					</div>
					<div class="col-sm-3">
						<label for="lastName">单据编号：</label>
						<input type="text" size="10" class="form-control" id="lastName" placeholder="" value="" required>
					</div>
					<div class="col-sm-3">
						<label for="lastName">申请人：</label>
						<input type="text" size="10" class="form-control" id="lastName" placeholder="" value="" required>
					</div>
				</div>

				<div class="row form-inline">
					<div class="col-md-3">
						<label for="firstName">签发人：</label>
						<input type="text"  size="10" class="form-control" id="firstName" placeholder="" value="" required>

					</div>

					<div class="col-md-3">
						<label for="modDate">申请日期</label>
						<input type="text"  size="10" onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="">
					</div>

					<div class="col-md-5 row form-inline">
						<label for="modDate">交货时间</label>
						<div class="form-inline">
							<input type="text" size="10" onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="">至
							<input type="text" size="10"  onFocus="WdatePicker()"  value="${modDateMin}" class="Wdate form-control input-sm"  name="modDateMin" id="modDateMin" placeholder="">
						</div>
					</div>

				</div>

				<div class="row form-inline">

					<div class="col-md-2">
						<label for="firstName">煤种：</label>

						<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							选择..
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="#">原煤</a></li>
							<li><a href="#">烟煤</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>

					<div class="col-md-3">
						<label for="lastName">采购数量：<input type="text" size="10" class="form-control" id="lastName" placeholder="" value="" required>（万吨）</label>
					</div>

					<div class="col-md-4">
						<label for="lastName">运输方式：</label>
						<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							选择..
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="#">火车</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>

				</div>


				<div class="row form-inline">
					<div class="col-md-2">
						<label for="firstName">交货地点：</label>
						<input type="text" class="form-control" size="5" id="delivery_location" placeholder="" value="" required>
					</div>

					<div class="col-md-2">
						<label for="firstName">结算方式：</label>

						<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							选择..
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="#">一票结算</a></li>
							<li><a href="#">分期付款</a></li>
							<li><a href="#">永远不给钱</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>

					<div class="col-md-2 mb-3">
						<label for="lastName">验收方式：</label>

						<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							选择..
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="#">到厂第三方验收</a></li>
							<li><a href="#">送货上门验收</a></li>
							<li><a href="#">验收个毛线</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>

				</div>

				<div class="row form-inline">
					<div class="col-md-5 mb-3">
						<label for="lastName">最高限价：<input type="text" size="10" class="form-control" id="lastName" placeholder="" value="" required>（元/卡.吨）</label>
					</div>
					<div class="col-md-5 mb-3">
						<label for="lastName">最低限价：<input type="text" size="10" class="form-control" id="lastName" placeholder="" value="" required>（元/卡.吨）</label>
					</div>
				</div>

				<div class="row form-inline">
					<div class="col-md-9">
						<label for="firstName">限价说明：</label>
						<textarea class="form-control" rows="2" cols="80"></textarea>
					</div>
				</div>

				<div class="row form-inline">
					<div class="col-md-9">
						<label for="firstName">结算付款方式：</label>
						<textarea class="form-control" rows="2" cols="80"></textarea>
					</div>
				</div>

				<div class="row">
					<div class="col-md-5 form-inline">
						<label for="firstName">报价保证金缴纳：</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 不要求
						</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 要求 <input type="text" size="7" class="form-control" id="lastName" placeholder="" value="" required> 元/吨
						</label>
					</div>

					<div class="col-md-5 mb-3 form-inline">
						<label for="firstName">报价保证金缴纳：</label>

						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 不要求
						</label>
						<label class="radio-inline">
							<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 要求 <input type="text" size="7" class="form-control" id="lastName" placeholder="" value="" required> 元/吨
						</label>
					</div>
				</div>
			</div>
		</div>



		<div class="panel panel-info">
			<div class="panel-heading">
				<h2 class="panel-title">煤质要求</h2>
			</div>
			<div class="panel-body">
				<div class="panel-success">
					<div class="panel-heading">
						<h2 class="panel-title">收到基基准</h2>
					</div>
					<div class="panel-body">
						<div class="row form-inline">
							<div class="col-md-5">
								<label>收到基低位发热量Qnet,ar≥</label><input type="text" size="10" class="form-control"><label>(KCal/kg)</label>
							</div>

							<div class="col-md-3">
								<label>收到基全硫St,ar≤</label><input type="text" size="7" class="form-control"><label>(%)</label>
							</div>

							<div class="col-md-3">
								<label>全水份M≤<input type="text" size="7" class="form-control"></label><label>(%)</label>
							</div>

						</div>

						<div class="row form-inline">
							<div class="col-md-3">
								<label>收到基灰分Aar≤</label><input type="text" size="7" class="form-control"><label>(%)</label>
							</div>

							<div class="col-md-6">
								<label>收到基挥发分Var≤</label><input type="text" size="7" class="form-control">至<input type="text" size="7" class="form-control"><label>(%)</label>
							</div>

						</div>
					</div>
				</div>


				<div class="panel-success">
					<div class="panel-heading">
						<h2 class="panel-title">空气干燥基基准</h2>
					</div>
					<div class="panel-body">
						<div class="row form-inline">
							<div class="col-md-3">
								<label>空干基水分Mad≤</label><input type="text" size="7" class="form-control"><label>(%)</label>
							</div>

							<div class="col-md-3">
								<label>空干基全硫St,ad≤</label><input type="text" size="7" class="form-control"><label>(%)</label>
							</div>
						</div>

						<div class="row form-inline">
							<div class="col-md-6">
								<label>空干基挥发分Var≤</label><input type="text" size="7" class="form-control"><label>(%)</label>至<input type="text" size="7" class="form-control"><label>(%)</label>
							</div>
						</div>
					</div>
				</div>


				<div class="panel-success">
					<div class="panel-heading">
						<h2 class="panel-title">干基基准</h2>
					</div>
					<div class="panel-body center-block">

						<div class="row form-inline">
							<div class="col-md-4">
								<label>干基高位发热量Qgr,d≤</label><input type="text" size="7" class="form-control"><label>(KCal/kg)</label>
							</div>

							<div class="col-md-3">
								<label>干基全硫St,d≤</label><input type="text" size="7" class="form-control"><label>(%)</label>
							</div>
						</div>

						<div class="row form-inline">
							<div class="col-md-8">
								<label>干燥无灰基挥发分Var≤</label><input type="text" size="7" class="form-control"><label>(%)</label>至<input type="text" size="7" class="form-control"><label>(%)</label>
							</div>

						</div>

						<div class="row form-inline">
							<div class="col-md-3">
								<label>粒度(mm)≤</label><input type="text" size="7" class="form-control">
							</div>

							<div class="col-md-3">
								<label>灰熔点ST(°C)≥</label><input type="text" size="7" class="form-control">
							</div>

							<div class="col-md-3">
								<label>哈氏可磨系数(HGI)</label><input type="text" size="7" class="form-control">
							</div>
						</div>


						<div class="row col-md-9 form-inline">
							<div>
								<label for="firstName">备注：</label>
							</div>
							<div>
								<textarea rows="3" cols="80"></textarea>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>


		<div class="center-block">
			<div class="col-md-4"><button class="btn btn-primary btn-lg btn-block" type="submit">保存</button></div>
			<div class="col-md-4"><button class="btn btn-primary btn-lg btn-block" type="submit">提交</button></div>
		</div>

	</form>
</div>

</body>

</html>
