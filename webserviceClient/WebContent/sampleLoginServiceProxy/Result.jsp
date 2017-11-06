<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
	<H1>Result</H1>

	<jsp:useBean id="sampleLoginServiceProxyid" scope="session"
		class="com.by.service.LoginServiceProxy" />
	<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleLoginServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

	<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleLoginServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
	<%=getEndpoint2mtemp %>
	<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
	<%= tempResultreturnp3 %>
	<%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleLoginServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.by.service.LoginService getLoginService10mtemp = sampleLoginServiceProxyid.getLoginService();
if(getLoginService10mtemp == null){
%>
	<%=getLoginService10mtemp %>
	<%
}else{
        if(getLoginService10mtemp!= null){
        String tempreturnp11 = getLoginService10mtemp.toString();
        %>
	<%=tempreturnp11%>
	<%
        }}
break;
case 13:
        gotMethod = true;
        String userId_1id=  request.getParameter("userId16");
            java.lang.String userId_1idTemp = null;
        if(!userId_1id.equals("")){
         userId_1idTemp  = userId_1id;
        }
        String password_2id=  request.getParameter("password18");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        int checkUserRight13mtemp = sampleLoginServiceProxyid.checkUserRight(userId_1idTemp,password_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(checkUserRight13mtemp));
        %>
	<%= tempResultreturnp14 %>
	<%
break;
}
} catch (Exception e) { 
%>
	Exception:
	<%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
	Message:
	<%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
	<%
return;
}
if(!gotMethod){
%>
	result: N/A
	<%
}
%>
</BODY>
</HTML>