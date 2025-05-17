<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to JTC Bookstore</title>
<link href="webjars/bootstrap/5.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<table class="table table-striped table-bordered" style="font-size:20px;font-weight:bold">
<tr>
<td align="center" colspan="2">Book Details</td>
</tr>
<tr>
<td>Book Id</td>
<td>${MyBook.bid}</td>
</tr>
<tr>
<td>Book Name</td>
<td> ${MyBook.bname}</td>
</tr>
<tr>
<td>Author</td>
<td>${MyBook.author}</td>
</tr>
<tr>
<td>Price</td>
<td>${MyBook.price}</td>
</tr>
<tr>
<td>Category</td>
<td>${MyBook.category}</td>
</tr>
<tr>
<td>Publication</td>
<td>${MyBook.publication}</td>
</tr>
</table>
</div>
<div align="center">
<h2><a href="showAllBooks">Goto Book Home</a></h2>
</div>
</body>
</html>