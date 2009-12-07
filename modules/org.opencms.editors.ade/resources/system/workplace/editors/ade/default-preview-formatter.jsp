<%@ page import="org.opencms.workplace.galleries.*"%>
<%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<% 
org.opencms.workplace.galleries.CmsDefaultFormatterHelper cms = new org.opencms.workplace.galleries.CmsDefaultFormatterHelper(pageContext, request, response);
pageContext.setAttribute("cms", cms);
%>
<fmt:setLocale value="${cms:vfs(pageContext).requestContext.locale}" />
<div>
	<h3>${cms.title}</h3>
	<div>
		<c:set var="dateModified" value="<%=new java.util.Date(cms.getResource().getDateLastModified()) %>" />
		<b>Last modified:</b>&nbsp;<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${dateModified}" /><br />
		<b>Path:</b>&nbsp;${cms.path}<br />
	</div>
</div>