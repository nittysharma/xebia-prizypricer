<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<sb:head />
<style type="text/css">
#form {
	padding-top: 100px;
}
</style>
</head>
<body>
	<div class="page-header" style="padding-left: 50px;">
		<h1 style="color: #900;">Prizy Pricer</h1>
	</div>
	<div id="form" class="row">
		<div class="col-lg-12"></div>
	</div>
	<div class="row">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<s:if test="hasActionErrors()">
				<s:actionerror theme="bootstrap" />
			</s:if>


			<s:form action="login" theme="bootstrap"
				cssClass="well form-vertical">
				<s:textfield name="username" label="Username"
					placeholder="Enter Username Here" />

				<s:password name="password" label="Password"
					placeholder="Enter Password Here" />

				<s:select name="role" label="Role" list="{'admin','worker'}" />

				<s:submit cssClass="btn btn-primary" />
				<s:reset cssClass="btn btn-danger" />
			</s:form>
		</div>
		<div class="col-lg-4"></div>
	</div>


</body>
</html>
