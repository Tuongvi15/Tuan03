<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration</title>
</head>
<body style="background-color: #b3e6ff;">
<h2>Student Registration Form</h2>
<form action="registration-form" method="post">

    First name: <input type="text" name="firstName"><br>
    Last name: <input type="text" name="lastName"><br>

    Date of birth:
    <select name="day">
        <option>1</option><option>2</option><option>3</option>
    </select>
    <select name="month">
        <option>Jan</option><option>Feb</option><option>Mar</option>
    </select>
    <select name="year">
        <option>2000</option><option>2001</option><option>2002</option>
    </select><br>

    Email: <input type="email" name="email"><br>
    Mobile number: <input type="text" name="mobile"><br>

    Gender:
    <input type="radio" name="gender" value="Male">Male
    <input type="radio" name="gender" value="Female">Female<br>

    Address:<br>
    <textarea name="address"></textarea><br>

    City: <input type="text" name="city"><br>
    Pin code: <input type="text" name="pin"><br>
    State: <input type="text" name="state"><br>
    Country: <input type="text" name="country" value="India"><br>

    Hobbies:
    <input type="checkbox" name="hobbies" value="Drawing">Drawing
    <input type="checkbox" name="hobbies" value="Singing">Singing
    <input type="checkbox" name="hobbies" value="Dancing">Dancing
    <input type="checkbox" name="hobbies" value="Sketching">Sketching
    <input type="checkbox" name="hobbies" value="Others">Others<br>

    Qualification:
    <input type="text" name="qualification"><br>

    Course applies for:
    <input type="radio" name="course" value="BCA">BCA
    <input type="radio" name="course" value="B.Com">B.Com
    <input type="radio" name="course" value="B.Sc">B.Sc
    <input type="radio" name="course" value="B.A">B.A<br>

    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
</body>
</html>