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
<h4 class="test-center">Best Books and Best Videos </h4>
</div>
<br/><br/>
<div class="container" align="center">
<form:form action="saveUpdateBook" modelAttribute="mybook" method="POST">

<table class="table table-striped table-bordered" style="font-size: 20px;font-weight: bold;">
<tr>
<c:if test="${OpType eq 'ADD'}">
<td align="center" colspan="3"> <h2>Add New Book</h2>  </td>
</c:if>

<c:if test="${OpType eq 'UPDATE'}">
<td align="center" colspan="3"> <h2>Update New Book</h2>  </td>
</c:if>
</tr>

<tr>
<td>Book Name</td>
<td> <form:input path="bname" class="from-control form-control-lg"/> </td>
<td> <font color=red size=4>   <form:errors path="bname"></form:errors>   </font> </td>
</tr>

<tr>
<td>Author</td>
<td> <form:input path="author" class="from-control form-control-lg"/> </td>
<td> <font color=red size=4>   <form:errors path="author"></form:errors>   </font> </td>
</tr>

<tr>
<td>Price</td>
<td> <form:input path="price" class="from-control form-control-lg"/> </td>
<td> <font color=red size=4>   <form:errors path="price"></form:errors>   </font> </td>
</tr>

<tr>
<td>Category</td>
<td> <form:input path="category" class="from-control form-control-lg"/> </td>
<td> <font color=red size=4>   <form:errors path="category"></form:errors>   </font> </td>
</tr>

<tr>
<td>Publications</td>
<td> <form:input path="pub" class="from-control form-control-lg"/> </td>
<td> <font color=red size=4>   <form:errors path="pub"></form:errors>   </font> </td>
</tr>

<tr>
<td align="center" colspan="3">
<input type="hidden" name="OpType" value="${OpType}"/>
<c:if test="${OpType eq 'ADD'}">
<input type="submit" value="Add New Book" class="btn btn-primary btn-lg"/>
</c:if>

<c:if test="${OpType eq 'UPDATE'}">
<input type="submit" value="Update New Book" class="btn btn-primary btn-lg"/>
<form:hidden path="bid"/>
</c:if>

</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>