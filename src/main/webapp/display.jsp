<%@page import="java.util.ArrayList"%>
<%@page import="model.Employee"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Employees</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body class="container mt-5">

<h2>Employee List</h2>

<table class="table table-bordered">

<tr>
<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Salary</th>
<th>Delete</th>
</tr>

<%
ArrayList<Employee> list =
(ArrayList<Employee>)request.getAttribute("list");

for(Employee e : list){
%>

<tr>

<td><%= e.getId()%></td>
<td><%= e.getName()%></td>
<td><%= e.getDepartment()%></td>
<td><%= e.getSalary()%></td>

<td>

<a href="updateEmployee.jsp?id=<%=e.getId()%>"
class="btn btn-warning">

Edit

</a>

<a href="delete?id=<%=e.getId()%>"
class="btn btn-danger">

Delete

</a>

</td>

</tr>

<%
}
%>

</table>

<a href="index.jsp"
class="btn btn-secondary">

Home

</a>

</body>
</html>