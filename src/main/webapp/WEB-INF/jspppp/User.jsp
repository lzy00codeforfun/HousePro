<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
     <form action="test" method="post" id="User">
            <input type="text" name="UserName">
            <button type="submit">submit</button>
     </form>
<body>
${user.userName}
${data}
</body>
</html>

