<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration Form</title>
    <style>
        body { font-family: Arial, sans-serif; }
        form { width: 400px; margin: auto; }
        input, select { width: 100%; padding: 8px; margin: 6px 0; }
        button { width: 100%; padding: 10px; background: #1877f2; color: white; border: none; }
        button:hover { background: #145dbf; }
    </style>
</head>
<body>
<h2 style="text-align:center;">User Registration Form</h2>

<form action="<%= request.getContextPath() %>/register" method="post">
    <input type="text" name="firstName" placeholder="First Name"/>
    <input type="text" name="lastName" placeholder="Last Name"/>
    <input type="email" name="email" placeholder="Your Email"/>
    <input type="email" name="reEmail" placeholder="Re-enter Email"/>
    <input type="password" name="password" placeholder="New Password"/>

    <label>Birthday</label><br/>
    <select name="month">
        <option>Month</option>
        <c:forEach var="m" begin="1" end="12">
            <option value="${m}">${m}</option>
        </c:forEach>
    </select>
    <select name="day">
        <option>Day</option>
        <c:forEach var="d" begin="1" end="31">
            <option value="${d}">${d}</option>
        </c:forEach>
    </select>
    <select name="year">
        <option>Year</option>
        <c:forEach var="y" begin="1970" end="2024">
            <option value="${y}">${y}</option>
        </c:forEach>
    </select><br/><br/>

    <label><input type="radio" name="gender" value="Female"/> Female</label>
    <label><input type="radio" name="gender" value="Male"/> Male</label><br/><br/>

    <button type="submit">Sign Up</button>
</form>
</body>
</html>
