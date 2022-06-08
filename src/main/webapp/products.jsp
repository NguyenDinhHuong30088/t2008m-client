<%@ page import="java.util.List" %>
<%@ page import="com.example.t2008mclientt.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2022
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>
</head>
<body>
    <h1>Hello product</h1>
    <ul>
        <%for (Product product :
                    products){%>
            <li><%=product.getId()%> <%=product.getName()%></li>
        <%
            }
        %>
    </ul>
</body>
</html>
