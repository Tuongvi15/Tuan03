<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt"  prefix="fmt" %>

<%-- Lấy mã ngôn ngữ từ session và set cho fmt --%>
<fmt:setLocale value="${sessionScope.languageCode != null ? sessionScope.languageCode : 'en'}" scope="session" />
<fmt:setBundle basename="resource" scope="session" />

<!DOCTYPE html>
<html>
<head>
    <title><fmt:message key="title"/></title>
    <style>
        body { font-family: Arial, sans-serif; }
        form { width: 360px; margin: 24px auto; }
        input, select, button { width: 100%; padding: 8px; margin: 6px 0; }
        .lang { width: 360px; margin: 12px auto; text-align: center; }
        .lang a { margin: 0 8px; }
    </style>
</head>
<body>

<div class="lang">
    <a href="${pageContext.request.contextPath}/lang?lang=vi"><fmt:message key="switch.vi"/></a> |
    <a href="${pageContext.request.contextPath}/lang?lang=en"><fmt:message key="switch.en"/></a>
</div>

<form>
    <h2 style="text-align:center;"><fmt:message key="title"/></h2>
    <input type="text" placeholder="<fmt:message key='firstName'/>" />
    <input type="text" placeholder="<fmt:message key='lastName'/>" />
    <input type="email" placeholder="<fmt:message key='email'/>" />
    <input type="password" placeholder="<fmt:message key='password'/>" />

    <label><fmt:message key="birthday"/></label>
    <select><option>Month</option></select>
    <select><option>Day</option></select>
    <select><option>Year</option></select>

    <label><fmt:message key="gender"/></label>
    <div>
        <label><input type="radio" name="g"/> <fmt:message key="male"/></label>
        <label><input type="radio" name="g"/> <fmt:message key="female"/></label>
    </div>

    <button type="button"><fmt:message key="signup"/></button>
</form>

</body>
</html>
