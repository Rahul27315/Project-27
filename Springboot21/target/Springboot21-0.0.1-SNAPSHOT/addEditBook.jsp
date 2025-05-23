<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JTC Bookstore</title>
<link href="webjars/bootstrap/5.3.5/css/bootstrap.min.css"rel="stylesheet">
</head>
<body>
<div class="card-header">
<h2 class="text-center">Welcome to JTC Bookstore</h2>
<h4 class="text-center">Best Books and Best Videos</h4>
</div>
<br>
<div align="center" class="container">
<form:form action="saveUpdateBook" method="post" modelAttribute="mybook">
<table class="table" style="font-size:20px;font-weight:bold">
<tr>
<c:if test="${OpType eq 'ADD' }">
<td align="center" colspan="2"><h2>Add New Book</h2></td>
</c:if>
<c:if test="${OpType eq 'UPDATE' }">
<td align="center" colspan="2"><h2>Update Book</h2></td>
</c:if>
</tr>
<tr>
<td>Book Name</td>
<td><form:input path="bname" class="form-control form-control-lg"/></td>
<td><font color="red" size="4"><form:errors path="bname"></form:errors></font></td>
</tr>
<tr>
<td>Author</td>
<td><form:input path="author" class="form-control form-control-lg"/></td>
<td><font color="red" size="4"><form:errors path="author"></form:errors></font></td>
</tr>
<tr>
<td>Price</td>
<td><form:input path="price" class="form-control form-control-lg"/></td>
<td><font color="red" size="4"><form:errors path="price"></form:errors></font></td>
</tr>
<tr>
<td>Category</td>
<td><form:input path="category" class="form-control form-control-lg"/></td>
<td><font color="red" size="4"><form:errors path="category"></form:errors></font></td>
</tr>
<tr>
<td>Publication</td>
<td><form:input path="publication" class="form-control form-control-lg"/></td>
<td><font color="red" size="4"><form:errors path="publication"></form:errors></font></td>
</tr>
<tr>
<td align="center" colspan="3">
<input type="hidden" name="OpType"value="${OpType}">
<c:if test="${OpType eq 'ADD'}">
<input type="submit" value="AddNewBook" class="btn btn-primary btn-lg">
</c:if>
<c:if test="${OpType eq 'UPDATE'}">
<input type="submit" value="UpdateBook" class="btn btn-primary btn-lg">
<form:hidden path="bid"/>
</c:if>
</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>