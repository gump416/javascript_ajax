<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page contentType="text/json; charset=UTF-8" %> <%-- 바디가 html로 되있으면 text/html, 텍스트면 plain.. --%>
<%
request.setCharacterEncoding("utf-8");
 BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
String txt = null;
StringBuilder sb = new StringBuilder();
while((txt=in.readLine()) != null){
  sb.append(txt);
}
System.out.println(sb.toString());
out.println(sb.toString());
%>
<%-- 비권장 GSON 방식 -> loginAction3 확인--%>