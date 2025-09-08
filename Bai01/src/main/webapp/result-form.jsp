<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Student" %>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
<h2>Registration Result</h2>
<jsp:useBean id="student" scope="request" type="model.Student"/>
<p>First Name: <jsp:getProperty name="student" property="firstName"/></p>
<p>Last Name: <jsp:getProperty name="student" property="lastName"/></p>
<p>Date of Birth: <jsp:getProperty name="student" property="dob"/></p>
<p>Email: <jsp:getProperty name="student" property="email"/></p>
<p>Mobile: <jsp:getProperty name="student" property="mobile"/></p>
<p>Gender: <jsp:getProperty name="student" property="gender"/></p>
<p>Address: <jsp:getProperty name="student" property="address"/></p>
<p>City: <jsp:getProperty name="student" property="city"/></p>
<p>Pin: <jsp:getProperty name="student" property="pin"/></p>
<p>State: <jsp:getProperty name="student" property="state"/></p>
<p>Country: <jsp:getProperty name="student" property="country"/></p>
<p>Hobbies: <jsp:getProperty name="student" property="hobbies"/></p>
<p>Qualification: <jsp:getProperty name="student" property="qualification"/></p>
<p>Course: <jsp:getProperty name="student" property="course"/></p>
</body>
</html>
