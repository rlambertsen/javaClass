<!DOCTYPE html>
<html>
    <head>
        <title>Titan Online Banking</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/TOBA">Titan Banking</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">                  
                        <li><a href="/TOBA/login.html">Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
          <div class="row">
              <div class="col-lg-12">
                  <h2>New User Sign Up</h2>
              </div>
            <form action="NewCustomerServlet" method="post">
              <div class="col-sm-6">
                
                <div class="form-group">
                  <label>First Name</label>
                  <input type="text" class="form-control" name="firstName" >
                </div>
                <div class="form-group">
                  <label>Last Name</label>
                  <input type="text" class="form-control" name="lastName" >
                </div>
                <div class="form-group">
                  <label>Phone</label>
                  <input type="number" class="form-control" name="phone" >
                </div>
                <div class="form-group">
                  <label>Email</label>
                  <input type="email" class="form-control" name="email" >
                </div>
                
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label>Address</label>
                  <input type="text" class="form-control" name="address" >
                </div>
                <div class="form-group">
                  <label>City</label>
                  <input type="text" class="form-control" name="city" >
                </div>
                <div class="form-group">
                  <label>State</label>
                  <input type="text" class="form-control" name="state" >
                </div>
                <div class="form-group">
                  <label>Zip code</label>
                  <input type="number" class="form-control" name="zip"  maxlength="5">
                </div>
                <div class="form-group">
                    <p class="text-danger">${message}</p>
                </div>
                <div class="form-group">
                  <button class="btn btn-success" type="submit">Sign Up</button>
                </div>
              </div>
            </form>
          </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
