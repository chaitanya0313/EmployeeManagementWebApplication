<%
String id = request.getParameter("id");

if(id == null){
    id = "";
}
%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Update Salary</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body class="container mt-5">

<h2 class="mb-4">Update Employee Salary</h2>

<form action="update" method="post">

<div class="mb-3">

<label class="form-label">
Employee ID
</label>

<input
type="number"
name="id"
value="<%=id%>"
class="form-control"
required>

</div>

<div class="mb-3">

<label class="form-label">
New Salary
</label>

<input
type="number"
name="salary"
class="form-control"
placeholder="Enter New Salary"
required>

</div>

<button type="submit"
class="btn btn-warning">

Update Salary

</button>

<a href="display"
class="btn btn-secondary">

Back

</a>

</form>

</body>
</html>