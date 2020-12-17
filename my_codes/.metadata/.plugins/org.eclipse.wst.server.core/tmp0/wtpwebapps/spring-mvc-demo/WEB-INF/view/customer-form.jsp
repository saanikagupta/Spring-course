<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Customer Registration Form</title>
	<style>
		.error {
			color: red
		}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First name: <form:input path="firstName" />
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>