<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../../common/header.jsp">
    <jsp:param name="page_title" value="${page_title}" ></jsp:param>
</jsp:include>

<!--Actions-->
<section id="action" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-6 ml-auto">
                <form action="/category/search">
                <div class="input-group">
                    <input type="text" name="name" class="form-control" placeholder="Search by Name">
                    <span class="input-group-btn">
                        <button class="btn btn-primary">Search</button>
                    </span>
                </div>
                </form>
            </div>
        </div>
    </div>
</section>

<%--Data Section--%>
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
                            <%--<a href="/category/detail/${item.id}" class="btn btn-primary text-white" ><span class="fa fa-angle-double-right"></span></a>--%>
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
