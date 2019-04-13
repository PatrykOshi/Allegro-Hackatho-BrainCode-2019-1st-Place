<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="h" %>


<h:tag-uppertag-user-profile/>


<style>
    img {
        height: 50px;
        margin: 0 40px 0 0;
    }
    .card {
        width: 100%;
    }

</style>

<div class="container-fluid">
    <div class="row">
        <div class="card">
            <div class="card-header">
                <div class="row">
                    <div class="col-6 font-weight-light">$user</div>
                    <div class="col-6 text-right font-weight-light">$date</div>
                </div>
            </div>
            <div class="card-body">
                <div class="media">
                    <%--${pageContext.request.contextPath}--%>
                    <img class="img-fluid" src="https://a.allegroimg.com/s360/0115fa/3a3df96746c7bf7d882fdb17e04a" alt="" style="max-height: 200px;" />
                    <div class="row" style="width: 100%">
                        <div class="col-6">$product-name</div>
                        <div class="col-3 text-right">2 sztuki</div>
                        <div class="col-3 text-right">$price</div>
                    </div>
                </div>
                <div class="row" style="border-top: 1px solid #eee; margin: 10px 0 0 0; padding: 20px 0 0 0;">
                    <div style="border-right: 1px solid #eee">
                        <a href="#" style="margin: 0 10px">Szczegóły</a>
                    </div>
                    <div>
                        <a href="#" style="margin: 0 10px">Usuń</a>
                    </div>
                </div>
            </div>
            <div class="card-footer text-right font-weight-bold">
                $price
            </div>
        </div>
    </div>
</div>


<h:tag-lowertag-user-profile/>