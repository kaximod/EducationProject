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
<body style="background-image: url('static/img/0034034865617486_b_WPS图片.jpg');background-repeat: no-repeat;background-size: 100% 100%">
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h1>
                在线教学平台系统
            </h1><br/><br/>
            <form class="form-horizontal" role="form">
                <div class="form-group"style="margin-left: 300px">
                    <label for="inputText" class="col-sm-2 control-label"style="margin-top: 10px">账号</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="inputText"/>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <label for="inputPassword" class="col-sm-2 control-label"style="margin-top: 10px">密码</label>
                    <div class="col-sm-4">
                        <input type="password" class="form-control" id="inputPassword"/>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div>
                            <input type="radio"name="iden"value="学生"/><b>学生</b> &emsp;&emsp;&emsp;
                                <input type="radio"name="iden"value="教师"/><b>教师</b>&emsp;&emsp;&emsp;
                                <input type="radio"name="iden"value="管理员"/><b>管理员</b>
                        </div>
                        <div class="checkbox">
                            <label><input type="checkbox"/><b>记住密码</b></label>
                        </div>
                    </div>
                </div>
                <div class="form-group"style="margin-left: 300px">
                    <div class="col-sm-offset-2 col-sm-10"style="margin-left: 200px">
                        <button type="submit" class="btn btn-default"style="width: 120px">登录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
