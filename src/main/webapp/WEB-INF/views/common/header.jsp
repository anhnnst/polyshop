
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fpoly Shop</title>
    <link href="${request.getContextPath("/")}/webjars/bootstrap/4.0.0-2/css/bootstrap.css"
          rel="stylesheet">
    <link href="${request.getContextPath("/")}/webjars/font-awesome/5.0.6/on-server/css/fontawesome-all.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark p-0">
    <div class="container">
        <a href="index.html" class="navbar-brand">Blogen</a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item px-2"><a href="index.html" class="nav-link ">Dashboard</a></li>
                <li class="nav-item px-2"><a href="/product/list" class="nav-link ">Products</a></li>
                <li class="nav-item px-2"><a href="/category/list" class="nav-link ">Categories</a></li>
                <li class="nav-item px-2"><a href="/user/list" class="nav-link">Users</a></li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown mr-3">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-user"></i> Welcome Nguyen Ngoc Anh
                    </a>
                    <div class="dropdown-menu">
                        <a href="profile.html" class="dropdown-item">
                            <i class="fa fa-user-circle"></i> Profile
                        </a>
                        <a href="settings.html" class="dropdown-item">
                            <i class="fa fa-gear"></i> Settings
                        </a>
                    </div>
                </li>
                <li class="nav-item"><a href="login.html" class="nav-link"><i class="fa fa-user-times"></i> Logout</a></li>
            </ul>
        </div>
    </div>
</nav>
<header id="main-header" class="py-2 bg-primary text-white">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h2><i class="fa fa-user"></i> ${page_title}</h2>
            </div>
        </div>
    </div>
</header>
