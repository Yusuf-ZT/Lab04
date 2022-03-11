<%-- 
    Document   : editnote
    Created on : Mar 2, 2022, 9:46:52 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
            <label>Title:</label><input type="text" name="title" value="New Title"><br>
            <label>Contents:</label><textarea id="" name="content" rows="6" cols="">Update the contents of the note</textarea>
            <br> 
           <input type="submit" name="action" value="save"/></a>
        </form>
        
        
    </body>
</html>
