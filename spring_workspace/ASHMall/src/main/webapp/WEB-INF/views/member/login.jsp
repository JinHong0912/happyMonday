<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>MEMBER SIGN IN</title>

  <!-- Bootstrap core CSS -->
  <!-- Custom styles for this template -->
<%@ include file="/WEB-INF/views/common/bootcss.jsp" %>
<script type="text/javascript" src="/js/member/login.js"></script>
<script>
	if("${msg}"=="LOGIN_FAIL"){	
		alert("로그인에 실패하였습니다.\n아이디와 비밀번호를 다시 확인해주세요.");
	}
</script>

  <style>
.login-form {
    width: 340px;
    margin: 50px auto;
  	font-size: 15px;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}
</style>
</head>

<body>
<!-- Navigation -->
<%@ include file="/WEB-INF/views/common/top.jsp" %>
 <!-- Page Content -->
 <div class="container">
   <div class="row">
     <div class="col-lg-3">

     </div>
      <!-- /.col-lg-3 -->
      <div class="col-lg-9">
	
        <div class="row">		
		<!-- 로그인 -->         
           <div class="col">
    		<div class="login-form">
			    <form id="loginForm" action="/member/loginPost" method="post">
			        <h2 class="text-center">SIGN IN</h2>       
			        <div class="form-group">
			            <input type="text" class="form-control" id="mb_id" placeholder="USERNAME" required="required">
			        </div>
			        <div class="form-group">
			            <input type="password" class="form-control" id="mb_password" placeholder="PASSWORD" required="required">
			        </div>
			        <div class="form-group">
			            <button id="btn_login" type="submit" class="btn btn-primary btn-block">SIGN IN</button>
			        </div>
			        <div class="clearfix">
			            <label class="float-left form-check-label"><input type="checkbox" name="useCookie"> REMEMBER ME</label>
			            <a href="#" class="float-right">&#128274; FORGOT</a>
			        </div>        
			    </form>
			    <p class="text-center"><a href="/member/join">&#128420; JOIN US</a></p>
			</div>
   		   </div>       
		<!-- 로그인 -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.col-lg-9 -->
    </div>
    <!-- /.row -->
  </div>
  <!-- /.container -->
  <!-- Footer -->
  <%@ include file="/WEB-INF/views/common/bottom.jsp" %>
  <!-- Bootstrap core JavaScript -->
  <%@ include file="/WEB-INF/views/common/bootjs.jsp" %>

</body>

</html>

