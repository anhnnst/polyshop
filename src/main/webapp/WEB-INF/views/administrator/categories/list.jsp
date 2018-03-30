<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../../common/header.jsp">
    <jsp:param name="page_title" value="${page_title}" ></jsp:param>
</jsp:include>

<c:if test="${not empty error}">
<section id="notification">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="alert alert-danger">
                    ${error}
                </div>
            </div>
        </div>
    </div>
</section>
</c:if>
<c:if test="${not empty message}">
<section id="notification">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="alert alert-info">
                    ${message}
                </div>
            </div>
        </div>
    </div>
</section>
</c:if>

<!--Actions-->
<section id="action" class="py-4 mb-2 bg-light">
<div class="container">
    <div class="row">
        <div class="col-md-3 mr-auto">
            <div class="input-group">
                <a href="#" class="btn btn-light btn-block">
                    <i class="fa fa-arrow-left"></i> Back To Dashboard
                </a>
            </div>
        </div>
        <div class="col-md-3">
            <div class="input-group">
                <a href="/category/search" class="btn btn-primary btn-block">
                    <i class="fa fa-search"></i> Search
                </a>
            </div>
        </div>

        <div class="col-md-3">
            <div class="input-group">
                <a href="/category/add" class="btn btn-success btn-block">
                    <i class="fa fa-check"></i> Add New
                </a>
            </div>
        </div>

    </div>
</div>
</section>

<section id="data">
<div class="container">
    <div class="row">
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>Category ID</th>
            <th>Name</th>
            <th>#</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${list}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>

                <a href="/category/edit/${item.id}" class="btn btn-warning text-light"><span class="fa fa-edit"></span></a>
                <a href="/category/delete/${item.id}" class="btn btn-danger text-light"><span class="fa fa-trash"></span></a>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    </div>
</div>
</section>
<jsp:include page="../../common/footer.jsp"/>
