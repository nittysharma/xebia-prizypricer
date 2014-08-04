<%@page import="com.xebia.prizypricer.daoimpl.ProductSurvayDaoImpl"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<s:if test="#session.login == 'true'">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>PrizyPrice| Survayr</title>
<script
	src="/PrizyPricer/js/jquery.min.js"></script>
<script type="text/javascript" src="/PrizyPricer/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/PrizyPricer/js/validator.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.col-lg-offset-1').hide();
		$('#savesurvaydata').hide();
		$('#logoutbtn').click(function() {
			window.location = "PrizyPricer/logout.action";
		});

		$('.list-group-item-success').click(function() {
			var array = this.id.split(',');
			$("#barcode").html(array[0]);
			$("#productimage").html(array[1] + " Image");
			$("#productname").html(array[1]);
			$("#category").html(array[2])
			$("#productdes").html(array[3]);
			$("#productid").html(array[4]);
			$('.col-lg-offset-1').show();
		});
	});
	
function submitsurvay(){

		var barcode=$("#barcode").html();
	var productname=$("#productname").html();
	var category=$("#category").html();
	var productdes=$("#productdes").html();
	var productid=$("#productid").html();
	var storeid='sass';
	var username=$("#username").html();
	var suggestedprice=$("#suggestedprice").val();
	var notedes=$("#notedes").val();
	
	$("#hproductid").val(productid);
$("#hproductname").val(productname);
$("#hproductdes").val(productdes);	
$("#hcategory").val(category);	
$("#hstoreid").val(storeid);
$("#husername").val(username);
$("#hbarcode").val(barcode);
$("#hsuggestedprice").val(suggestedprice);
$("#hnotedes").val(notedes);

$("#savesurvaydata").submit();
}
function searchproduct()
{
	alert('Serach functionality not implemented yet');
}

</script>

<style type="text/css">
#form {
	padding-top: 100px;
}
</style>
<sb:head />
</head>
<body style="background-color: #F1D8D1;">
<form id="savesurvaydata" style="display:none" action="savesurvay.action" method="POST">
<input type="text" id="hproductid" name="productid" value=""/>
<input type="text" id="hproductname" name="productname" value=""/>
<input type="text" id="hproductdes" name="productdes" value=""/>
<input type="text" id="hcategory" name="category" value=""/>
<input type="text" id="hstoreid" name="storeid" value=""/>
<input type="text" id="husername" name="username" value=""/>
<input type="text" id="hbarcode" name="barcode" value=""/>
<input type="text" id="hnotedes" name="notedes" value=""/>
<input type="text" id="hsuggestedprice" name="suggestedprice" value=""/>
</form>
	<div class="page-header" style="padding-left: 40px;">
		<div class="row">
			<div class="col-lg-3">
				<h1 style="color: #900;">Prizy Pricer</h1>
			</div>
			<div class="col-lg-3"></div>
			<div class="col-lg-4 pull-right">
				<div class="col-lg-8">
					<h5 style="color: #00F;">
						Hi ! <span id="username"><s:property
								value="#session.username" /></span>
					</h5>
					<h6>
						Last Logout Time
						<s:property value="#session.lastlogouttime" />
					</h6>
				</div>
				<div class="col-lg-4">
					<button class="btn btn-danger" id="logoutbtn">Logout</button>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<div class="row">
		<!-- left container start-->
		<div class="col-lg-2" style="height: 435px; overflow: auto;">
			<label>Product List</label>

			<ul class="list-group">
				<s:iterator value="%{productlist}" var="plist">
					<li class="list-group-item list-group-item-success"
						id="<s:property value="#plist.barcode"/>,<s:property value="#plist.productname"/>,<s:property value="#plist.category"/>,<s:property value="#plist.productdes"/>,<s:property value="#plist.id"/>"><s:property
							value="#plist.productname" /></li>
				</s:iterator>

			</ul>

		</div>
		<!-- left container end-->

		<!-- main container start-->
		<div class="col-lg-10">


			<div class="row">
				<div class=" col-lg-4 col-lg-offset-4">
					<div class="input-group">
						<input type="text" class="form-control" id="search" name="search"
							placeholder="Search by Barcode(not implemented)" data-validation-required-message="Please enter barcode" required/><span onclick="searchproduct();"
							class="input-group-addon">Search</span>
					</div>
				</div>
								<div class="col-lg-4 col-lg-offset-2">
					<div class="dropdown">
						<button class="btn btn-info dropdown-toggle" type="button"
							id="formula" data-toggle="dropdown">
							Total SurvayCount : <%=ProductSurvayDaoImpl.getcount()%><span class="caret"></span>
						</button>
					</div>
				</div>
				<div class="col-lg-2 col-lg-offset-2">
					<div class="dropdown">
						<button class="btn btn-info dropdown-toggle" type="button"
							id="formula" data-toggle="dropdown">
							formula :2highest,2lowwest,avg%20<span class="caret"></span>
						</button>
					</div>
				</div>





				<div class="row">

					<!-- product details -->
					<div class=" col-lg-10 col-lg-offset-1">
						<div class="col-lg-3">
							<div class="panel panel-info">
								<div class=" panel-body bg-info" style="padding: 40px;">
									<h3 id="productimage" align="center">Product Image</h3>
								</div>
							</div>
							<div class="panel panel-danger">
								<div class=" panel-body bg-danger">
									<h4 id="barcode" align="center">Barcode</h4>
								</div>
							</div>
						</div>
						
						
						
						
						


						<div class="col-lg-9">

							<h4 align="center">
								Product : <span id="productname">Abc</span>
							</h4>

							<h5 align="left">
								Category : <span id="category">Cat</span>
							</h5>
							<h5 align="left">
								Store : <span id="storeid">L10234</span>
							</h5>
							<h5 align="left">
								Description : <span id="productdes">productdes</span> <span
									id="productid" style="display: none">productid</span>
							</h5>
							<br /> <br /> <br />
							<br />
  <h5 align="left">
   Average Price : Not implemeted
  </h5>
  <h5 align="left">
   Lowest Price	 : 999
  </h5>
 <h5 align="left">
    Highest Price :999
  </h5>
  <h5 align="left">
    Ideal Price :999
  </h5>

						</div>

					</div>

				</div>


			</div>
			<!-- main container end-->
		</div>

	</div>


	</div>



</body>
</html>
</s:if>
<s:else>
<jsp:forward page="/index.jsp"></jsp:forward>
Session expire please login
</s:else>