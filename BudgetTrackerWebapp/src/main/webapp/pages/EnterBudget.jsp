<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Budget page</title>
</head>
<body>
	
	<form action = "addBudget">
		<input type = "text" name = "budget_name"><br>
		<input type = "text" name = "amount"><br>
		<input type = "submit"><br>
	</form>

	<form action = "getBudget">
		<input type = "text" name = "budget_name"><br>
		<input type = "submit"><br>
	</form>
</body>
</html>