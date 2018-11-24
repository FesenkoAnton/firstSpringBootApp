<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<table>
<c:forEach var="client" items="${requestScope.list}">
  <tr>
      <td>
          Hello, ${client}
      </td>
  </tr>
 </c:forEach>
</table>
</body>
</html>
