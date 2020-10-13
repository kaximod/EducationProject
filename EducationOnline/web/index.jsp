<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/pages/common/head.jsp" %>
    <title>在线教学平台</title>
</head>
<%--<body style="background-image: url("")">--%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h3>
                在线教学平台系统
            </h3><br/><br/>
            <form class="form-horizontal" role="form">
                <div class="form-group"style="margin-left: 300px">
                    <label for="inputText" class="col-sm-2 control-label">账号</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="inputText"/>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-3">
                        <input type="password" class="form-control" id="inputPassword"/>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="checkbox">
                            <label><input type="checkbox"/>记住密码</label>
                        </div>
                        <div >

                                <input type="radio"name="iden"value="学生"/>学生
                                <input type="radio"name="iden"value="教师"/>教师
                                <input type="radio"name="iden"value="管理员"/>管理员

                        </div>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">登录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
