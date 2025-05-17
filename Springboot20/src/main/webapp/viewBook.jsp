<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Bookstore</title>
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="card-header">
<h2 class="text-center">Welcome to My Bookstore ! </h2>
<h4 class="text-center">Best Books and Best Videos </h4>
</div>
<br>
<div class="container">
<table class="table table-striped table-bordered" style="font-size: 20px;font-weight: bold;">
<tr>

<td align="center" colspan="3">Book Details</td>
</tr>

<tr> 
<td>BookId</td>
<td>${MyBook.bid}</td>
</tr>

<tr> 
<td>Book Name</td>
<td>${MyBook.bname}</td>
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
<td>Publications</td>
<td>${MyBook.pub}</td>
</tr>
</table>
</div>
<div align="center">
<h2> <a href="showAllBooks"> Goto Book Home </a>  </h2>
<%-- <a href="${pageContext.request.contextPath}/viewBook?bookId=${mybook.bid}">View</a> --%>

</div>
</body>
</html>