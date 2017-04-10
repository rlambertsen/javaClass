<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
                  <p>Success!! You have Signed up, now please login!</p>
                  <div class="row">
                    <div class="col-xs-12">
                        <p><label>User Name: </label> ${user.userName}</p>
                        <p><label>Password:</label> ${user.password}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>First Name:</label> ${user.firstName}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>Last Name:</label> ${user.lastName}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>Phone:</label>${user.phone}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>Email:</label>${user.email}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>Address:</label>${user.address}</p>
                    </div>
                    <div class="col-xs-6">
                        <p><label>City, State, Zip:</label>${user.city}, ${user.state} ${user.zip}</p>
                    </div>
                </div>
              </div>
          </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
