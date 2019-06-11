<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="User_update" method="post">
id:<input type="hidden" name="uid" value="${u.uid }"/>
uname:<input type="text" name="uname" value="${u.uname }"/>
birthday:<input type="text" name="birthday" value="${u.birthday }"/>
umoney:<input type="text" name="umoney" value="${u.umoney }"/>
<button>编辑</button>


</form>


</body>
</html>