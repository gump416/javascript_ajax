<%@page import="ezen.ajax.User"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page contentType="application/json; charset=UTF-8" %> <%-- 바디가 html로 되있으면 text/html, 텍스트면 plain.. --%>
<%
request.setCharacterEncoding("utf-8");
BufferedReader in = request.getReader();
Gson gson = new Gson();
//JSON -> User 객체로 역직렬화
User user = gson.fromJson(in, User.class);
//System.out.println(user);

//DB에 추가 했다고 가정..
Gson gson2 = new Gson();

//User 객체 -> JSON
String jsonUser = gson2.toJson(user);
out.println(jsonUser);
%>