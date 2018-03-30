<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../../common/header.jsp">
    <jsp:param name="page_title" value="${page_title}" ></jsp:param>
</jsp:include>

<form:form action="/category/addOrEdit" method="post" modelAttribute="category">
<!--Actions-->
<section id="action" class="py-2 mb-2 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3 mr-auto">
                <div class="input-group">
                    <a href="#" class="btn btn-light btn-block">
                        <i class="fa fa-arrow-left"></i> Back To Dashboard
                    </a>
                </div>
            </div>

            <c:if test="${not empty category.id and category.id > 0}">
            <div class="col-md-3">
                <div class="input-group">
                    <<a href="/category/delete/${category.id}" class="btn btn-danger btn-block">
                        <i class="fa fa-check"></i> Delete
                    </a>
                </div>
            </div>
            </c:if>
            <div class="col-md-3">
                <div class="input-group">
                    <button type="submit" class="btn btn-success btn-block">
                        <i class="fa fa-check"></i> Save
                    </button>
                </div>
            </div>
        </div>
    </div>
</section>
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

<section id="datainput">
    <div class="container">
        <div class="row">
            <div class="col">
                <form:hidden path="id"/>
                <div class="form-group">
                    <label for="name">Name</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <i class="fa fa-plug"></i>
                            </div>
                        </div>
                        <form:input path="name" cssClass="form-control"  aria-describedby="nameHelp"/><br>
                    </div>
                    <small id="nameHelp" class="form-text text-danger" style="font-style: italic;">
                        <form:errors path="name"/>
                    </small>
                </div>

            </div>
        </div>
    </div>
</section>

</form:form>

<jsp:include page="../../common/footer.jsp"/>