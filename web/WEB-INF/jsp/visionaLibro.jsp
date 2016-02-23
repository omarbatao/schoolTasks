<%-- 
    Document   : visonaLibro
    Created on : 16-feb-2016, 8.43.30
    Author     : FSEVERI\ceretta2991
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="./include.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libro ${libro.id}</title>
    </head>
    <body>
        <h1>${libro.titolo}</h1>
        <p>${libro.desc}</p>
        <p>${libro.autore}</p>
    </body>
</html>
