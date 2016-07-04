<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee to Database</title>
<script>
	function addnewemployee() {
		if(document.add.baseLocation.selected != "-") {
			false;
		}
		return true;
	}
</script>
</head>
<body>
	<div>
		<form action="addEmployee" name="add" onsubmit="return addnewemployee()" method="post">
		<table>
			<tr><td><label>First Name:</label></td>
			<td><input type="text" id ="firstName" name="firstName" maxlength="20" required/></td></tr>

			<tr><td><label>Last Name:</label></td>
			<td><input type="text" name="lastName" maxlength="20" required/></td></tr>
			
			
			<tr><td><label>Designation:</label></td>
			<td><input type="text" name="designation" maxlength="20" required/></td></tr>
			
			<tr><td><label>Salary:</label></td>
			<td><input type="number" name="salary" min="20000" required/></td></tr>
			
			<tr><td><label>Base Location:</label></td>
			<td><select name="baseLocation">
				<option value="-" selected>Employee Location</option>
				<option value="BLR">Bengaluru</option>
				<option value="BSR">Bhuvaneswar</option>
				<option value="Mysore">Mysore</option>
				<option value="Manglore">Mangalore</option>
			</select></td></tr>
			
			<tr><td><label>User Name:</label></td>
			<td><input type="text" name="userName" maxlength="20" required/></td></tr>
			
			<tr><td><label>Password:</label></td>
			<td><input type="password" name="password" maxlength="20" required/></td></tr>
			<tr><td><input type="submit" value="Add employee">&emsp;</td><td><input type="reset" value="Reset"/></td></tr>
			</table>
		</form>
	</div>
</body>
</html>