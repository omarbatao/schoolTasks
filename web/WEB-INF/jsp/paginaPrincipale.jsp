<%-- 
    Document   : paginaPrincipale
    Created on : 13-feb-2016, 11.29.01
    Author     : FSEVERI\ceretta2991
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="./include.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titpag}</title>
    </head>
    <body>
        <h1>${titolo}</h1>
        <h1> Questo è il progetto di Omar pesce da lenza uhahah </h1>
        <table>
            
        
        <c:forEach items="${libri}" var="libro">
            <tr><td><a href="./visionaLibro?id=${libro.id}"> ${libro.titolo}</a></td></tr>
        </c:forEach>
        </table>

    </body>
</html>
