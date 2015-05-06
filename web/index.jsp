<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <h1>Welcome!</h1>

    <form method="POST" action="/show">
      <input type="text" name="name" placeholder="Name"/><br/>
      <input type="text" name="lastname" placeholder="LastName"/><br/>
      <input type="text" name="password" placeholder="Password"/><br/>
      <input type="email" name="email" placeholder="Email"/><br/>
      <input type="submit" />
      <input type="reset" />
    </form>

  </body>
</html>
