<%@page import="com.webkorps.model.Alien"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-success text-white">
<%
Alien a1=(Alien)request.getAttribute("alien");
//out.print(a1);
%>
<div class="container">
  <table class="table table-hover table table-dark table-striped">
   <thead>
    <tr>
        <th>AID:</th>
        <th>Name</th>
        <th>Profile</th>
      </tr>
   </thead>
   <tbody>
   <tr>
   <th><%=a1.getAid() %></th>
   <th><%=a1.getAname() %></th>
   <th><%=a1.getTech() %></th>
   </tr>
   </tbody>
  </table>
</div>
</body>
</html>