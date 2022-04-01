<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
  <h2>Weather Wear Account Registration</h2>
  
<form action="register" method="post">
	
  <div class="mb-3">
    <label for="firstname" class="form-label">FirstName</label>
    <input type="text" class="form-control" id="firstname" placeholder="Enter firstname" name="firstName">
  </div>

  <div class="mb-3">
    <label for="LastName" class="form-label">LastName</label>
    <input type="text" class="form-control" id="LastName" placeholder="Enter LastName" name="LastName">
  </div>
  
  <div class="mb-3">
    <label for="username" class="form-label">Username</label>
    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Email:</label>
    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
  </div>
  
   <div class="mb-3 mt-3">
    <label for="reEmail" class="form-label">Re-Type Email:</label>
    <input type="email" class="form-control" id="reEmail" placeholder="Enter email" name="reEmail">
  </div>
  
  <div class="mb-3">
    <label for="pwd" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
  </div>
  
  <div class="mb-3">
    <label for="rePwd" class="form-label">Re-Type Password:</label>
    <input type="password" class="form-control" id="rePwd" placeholder="Enter password" name="rePassword">
  </div>
  
  <div class=" ${style}">
    <strong>${msg}</strong> 
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>
</div>
</body>
</html>