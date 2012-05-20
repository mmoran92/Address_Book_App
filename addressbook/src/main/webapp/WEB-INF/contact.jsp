<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="addressbook.*"%>

<jsp:useBean id="contactDao" type="addressbook.ContactDao"
	scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<link rel="stylesheet" href="styles/style.css">
<head>
<title>Address Book Application</title>
</head>

<body>
	<p>
		<strong>Address Book Application</strong>
	</p>
	<p>Please Enter new Conact</p>
	<p>&nbsp;</p>
	<form method="POST" action="contact.html">
		Name: <input type="text" name="name" /> Phone Number: <input
			type="text" name="phonenumber" /> Address:<input type="text"
			name="address" /> <input type="submit" value="Add" />
	</form>

	<hr>
	<ol>
		<%
			for (Contact contact : contactDao.getAllContacts()) {
		%>
		<li><%=contact%></li>
		<%
			}
		%>
	</ol>
	<hr>


</body>
</html>