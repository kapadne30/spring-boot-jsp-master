<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS - Book Registration</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>

</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Book <c:out value="${book.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="book" action="/home" name="book">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>Book Name :</td>
        <td><form:input path="bookName" id="fname" /></td>
    </tr>
    <tr>
        <td>Author :</td>
        <td><form:input path="author" id="lname"/></td>
    </tr>
    <tr>
        <td>Price :</td>
        <td><form:input path="price" id="userName"/></td>
    </tr>
    
   
    <tr>
        <td colspan="2"><input type="submit" value="<c:out value="${book.id != null ? 'Update' : 'Save' }" />"
         onclick="return validate();">&nbsp;&nbsp; <a href="/list">Book List</a>&nbsp;
         <c:if test="${book.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>