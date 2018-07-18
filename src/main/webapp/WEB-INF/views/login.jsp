<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
  </head>
  <body>
    <form action='<spring:url value="/loginAction"/>' method="post">
        <div>
          <input id="username" type="text" name="username"/>
          <label for="username">Username</label>
        </div>
        <div>
          <input id="password" type="password" name="password"/>
          <label for="password">Password</label>
        </div>
        <div>
          <td><button type="submit">Login</button></td>
        </div>
    </form>
  </body>
</html>
