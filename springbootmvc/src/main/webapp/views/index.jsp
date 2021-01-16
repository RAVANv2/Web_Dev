<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title> Insert Title Here</title>
    </head>

    <body>
        Welcome To Homepage!!
        <br>
        <br>
        <form action="add" method="post">
            Enter 1st Number: <input type="text" name="num1"> <br>
            Enter 2nd Number: <input type="text" name="num2"> <br>
            <input type="submit">
        </form>

        <br>
        <br>

        <form action="addAlien" method="post">
            Enter User ID: <input type="text" name="id"> <br>
            Enter User Name: <input type="text" name="name"> <br>
            <input type="submit">
        </form>
    </body>

</html>