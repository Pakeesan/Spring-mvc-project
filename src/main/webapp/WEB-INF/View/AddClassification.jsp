<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST"
          action="/mvc/save" modelAttribute="classification">
             <table>
                <tr>
                    <td><form:label path="ClassificationName">Name</form:label></td>
                    <td><form:input path="ClassificationName"/></td>
                </tr>
                <tr>
                    <td><form:label path="ClassificationId">Id</form:label></td>
                    <td><form:input path="ClassificationId"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>