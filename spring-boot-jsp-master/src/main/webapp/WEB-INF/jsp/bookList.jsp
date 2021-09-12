<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookCRUDApp - Book List</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>Book List</h2></div>
	<table style="margin-top: 0px;margin-left: 100px; ">
		<tr>
			<th>Book Id</th>
			<th>Book Name</th>
			<th>Author</th>			
			<th>Price</th>
			<th>Action</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.bookName}</td>				
				<td>${book.author}</td>				
				<td>${book.price}</td>
				
				<td>
					<a href="/edit?id=${book.id}" >Edit</a>
				</td>
				<td>
					<form action="/delete?id=${book.id}" method="post">
						<input type="submit" value="Delete" style="background:none;border:0px;cursor: pointer;"/>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>