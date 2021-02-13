<%--
  Created by IntelliJ IDEA.
  User: songhk
  Date: 2021/1/23
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="com.atguigu.jprofiler.*" language="java" %>
<html>
<head>
    <title>测试JProfiler - 1</title>
</head>
<body><%

    for (int i = 0; i < 10000; i++) {

        BeanTest b = new BeanTest();

        MainTest.list.add(b);

    }

%>

SIZE:<%=MainTest.list.size()%><br/>

counter:<%=MainTest.counter++%>

</body>
</html>
