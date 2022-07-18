<%--
  Created by IntelliJ IDEA.
  User: 24395
  Date: 2022/6/11
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有的账户</h2>
<c:forEach items="${ssmList}" var="ssm">
    ${ssm.name}
</c:forEach>
</body>
</html>
