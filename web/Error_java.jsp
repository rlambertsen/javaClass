<%-- 
    Document   : Error_java
    Author     : rylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Errors</title>
    </head>
    <body>
        <h1>ERRORS</h1>
        <p>Type: {pageContext.exception["class"]}</p>
        <p>Message: {pageContext.exception.message}</p>
    </body>
</html>
