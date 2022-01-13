
<!DOCTYPE html>
<%@page import="controller.LibroCtrl"%>
<%@page import="model.Libro"%>
<html>
<head>
<meta charset="utf-8">
<title>Libreria</title>
<style type="text/css">
h1 {color:yellow;}
h2 {color:red;}
</style>
</head>
<body>
<h1>Libreria</h1>

<form action="" >
<input type="text" name = "titolo" placeholder="titolo">
<input type="text" name = "prezzo" placeholder="prezzo">
<input type ="submit" value ="aggiungi libro">
</form>



<% LibroCtrl controller = new LibroCtrl(); %>
<% 

if(request.getParameter("titolo")!=null){
	
	String titolo =request.getParameter("titolo");
	
	//Libro libro = new Libro(titolo,10);
	
	controller.addlibro(titolo, 10);
}
%>
<% for (Libro l: controller.getLibro()){ %>

	<h2><%=l.getTitolo() %></h2>
	
<%  } %>


</body>
</html>