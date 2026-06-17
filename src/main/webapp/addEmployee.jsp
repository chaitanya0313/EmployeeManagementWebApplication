<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Add Employee</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body class="container mt-5">

<h2>Add Employee</h2>

<form action="add" method="post">

<input type="number"
name="id"
placeholder="Enter ID"
class="form-control mb-3">

<input type="text"
name="name"
placeholder="Enter Name"
class="form-control mb-3">

<input type="text"
name="department"
placeholder="Department"
class="form-control mb-3">

<input type="number"
name="salary"
placeholder="Salary"
class="form-control mb-3">

<button class="btn btn-primary">
Save Employee
</button>

</form>

</body>
</html>