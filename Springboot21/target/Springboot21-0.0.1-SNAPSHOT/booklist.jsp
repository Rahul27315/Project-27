<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JTC Bookstore</title>
<link href="webjars/bootstrap/5.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="card-header">
<h2 class="text-center">Welcome to JTC Bookstore</h2>
<h4 class="text-center">Best Books and Best Videos</h4>
</div>
<div class="container">
<table class="table table-striped table-bordered" style="font-size:20px;font-weight: bold">
<tr>
<th>Book ID</th>
<th>Book Name</th>
<th>Author</th>
<th>Price</th>
<th>Category</th>
<th>Publication</th>
<th colspan="2"align="center">
<form:form action="addEditBookForm">
<input type="hidden" name="bookId" value="0">
<input type="submit" value="AddNewBook" class="btn btn-successbtn-lg">
</form:form>
</th>
</tr>
<c:forEach var="mybook" items="${MyBookList}" >
<tr>
<td><a href="viewBook?bookId=${mybook.bid}">${mybook.bid}</a></td>
<td>${mybook.bname}</td>
<td>${mybook.author}</td>
<td>${mybook.price}</td>
<td>${mybook.category}</td>
<td>${mybook.publication}</td>
<td>
<form:form action="addEditBookForm">
<input type="hidden" name="bookId" value="${mybook.bid}">
<input type="submit" value="Edit" class="btn btn-primary btn-lg">
</form:form>
</td>
<td>
<form:form action="deleteBook">
<input type="hidden" name="bookId" value="${mybook.bid}">
<input type="submit" value="Delete" class="btn btn-danger btn-lg">
</form:form>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>