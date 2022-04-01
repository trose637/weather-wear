<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
  <h2>Weather Wear Login</h2>
<form action="login" method="post">

  <div class="mb-3">
    <label for="username" class="form-label">Username</label>
    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username">
  </div>
  
  <div class="mb-3">
    <label for="pwd" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
  </div>
  
  <button style="margin-bottom: 10px" type="submit" class="btn btn-primary">Submit</button>
  
  <div class=" ${style}">
    <strong>${msg}</strong> 
  </div>
   
</form>

  <div>
   <button onclick="window.location.href='PasswordRecovery.jsp'" style="margin-top: 0px" type="button" class="btn btn-primary">Password Recovery</button>
  </div>

</div>
</body>
</html>