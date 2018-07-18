<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Home</title>
  </head>
  <body>
  <p>
      <c:choose>
        <c:when test="${nome==''}">
        <spring:url value="/login" var="url" htmlEscape="true"/>
        <a href="${url}">Login</a>
        </c:when>
        <c:otherwise>
            Welcome user: ${nome}
        </c:otherwise>
      </c:choose>
  </p>
  </body>
</html>
