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
                  <p>Reset your password?</p>
                  <form action="resetPassServlet" method="post">
                      <div class="row">
                          <div class="col-sm-6">
                              <div class="form-group">
                                    <label>New Password</label>
                                    <input type="text" class="form-control" name="password" value="${user.password}" />
                              </div>
                              <div class="form-group">
                                  <button class="btn btn-success" type="submit">Submit</button>
                              </div>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
