<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>
<%--<jsp:include page="/user.do/findAll"></jsp:include>--%>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header text-success">游戏管理</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        用户信息
                        <button type="button" class="btn btn-primary btn-xs btn-wide pull-right" id="btn-budget"
                                onclick="window.location.href='${pageContext.request.contextPath}/sky.do/game_add.view'">添加</button>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>lol</th>
                                    <th>crossfire</th>
                                    <th>dnf</th>
                                    <th>dota</th>
                                    <%--<th></th>--%>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="game" items="${gameList}">
                                    <tr>
                                        <td>${game.game_id}</td>
                                        <td>${game.lol}</td>
                                        <td>${game.crossfire}</td>
                                        <td>${game.dnf}</td>
                                        <td>${game.dota}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/sky.do/delete?game_id=${game.game_id}"
                                               onclick="return confirm('是否要删除该条数据')">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>

    <!-- /.container-fluid -->
</div>
</div>
<!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->

<jsp:include page="/bottom.jsp"></jsp:include>

