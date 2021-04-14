<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Novus Bank</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row text-center" style="color: black;">
        <h2>Novus Bank</h2>
    </div>
    <hr>
    <div class="row col-md-10 col-md-offset-3">
        <div class="card card-body">
            <h2>User Register Form</h2>
            <div class="col-md-8 col-md-offset-3">
                <form action="<%=request.getContextPath()%>/register" method="post">
                    <div class="form-group">
                        <label for="uname">First Name:</label> <input type="text"
                                                                      class="form-control" id="uname" placeholder="First Name"
                                                                      name="firstName" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">Last Name:</label> <input type="text"
                                                                     class="form-control" id="uname" placeholder="Last Name"
                                                                     name="lastName" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">Email:</label> <input type="email"
                                                                     class="form-control" id="emailId" placeholder="Email"
                                                                     name="email" required>
                    </div>

                    <div class="form-group">
                        <label for="uname">Password:</label> <input type="password"
                                                                    class="form-control" id="password" placeholder="Password"
                                                                    name="password" required>
                    </div>
                    <div class="form-group">
                        <label for="uname">Account Number:</label> <input type="number"
                                                                    class="form-control" id="accNo" placeholder="Account Number"
                                                                    name="accountNumber" required>
                    </div>
                    <div class="form-group">
                        <label for="uname">Sort Code:</label> <input type="number"
                                                                    class="form-control" id="sortCode" placeholder="Sort Code"
                                                                    name="sortCode" required>
                    </div>


                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>