<%-- 
    Document   : viewnote
    Created on : Mar 2, 2022, 9:46:41 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <form action="note" method="get">
        <h2>View Note</h2>
        <p>Title: ${note.titleNote}</p><br> 
        <p>Contents: ${note.contentNote}</p><br>
        <p></p>
        
        <a action="edit" href="note?editnote">Edit</a>
        
        </form>
    </body>
</html>
