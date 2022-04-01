<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
  <h2>Weather Wear Region Search</h2>
  
<form action="search" method="post">

  <label for="region">Choose a region:</label>
  <select name="city" id="city">
    <option value="toronto">Toronto</option>
    <option value="vancouver">Vancouver</option>
    <option value="halifax">Halifax</option>
   
  </select>
  <br><br>
 
  <button type="submit" class="btn btn-primary">Submit</button>
  
</form>
</div>
</body>
</html>