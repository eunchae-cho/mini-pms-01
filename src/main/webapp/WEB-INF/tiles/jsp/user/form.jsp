<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



    <div id="signup">
      <div class="back">
        <div class="main">
          <form class="form-signin" action="add" method="post" enctype='multipart/form-data'>
            <div class="sign">
              <h7>회원가입</h7>
            </div>

            <label for="inputEmail" class="sr-only">이메일</label>
            <input type="email" value='${email}' id="sign-inputEmail" name="email" class="form-control"
              placeholder="이메일(example@gmail.com)" required>

            <label for="inputPassword" class="sr-only">비밀번호</label>
            <input type="password" id="sign-inputPassword" name="password" class="form-control" placeholder="비밀번호"
              style="margin:0;" required>

            <label for="inputPassword" class="sr-only">비밀번호확인</label>
            <input type="password" id="sign-inputPassword_check" name="password_check" class="form-control"
              placeholder="비밀번호" style="margin:0;" required>
            <div class="alert alert-success" id="alert-success">비밀번호가 일치합니다.</div>
            <div class="alert alert-danger" id="alert-danger">비밀번호가 일치하지 않습니다.</div>



            <label for="inputName" class="sr-only">이름</label>
            <input type="text" id="sign-inputName" name="name" class="form-control" placeholder="이름" required>

            <label for="inputNick" class="sr-only">닉네임</label>
            <input type="text" id="sign-inputNick" name="nick" class="form-control" placeholder="닉네임" required>

            <button class="btn" type="submit" style="margin-top: 10px;">계정 생성</button>
          </form>
        </div>
      </div>
    </div>

    <script>
      $(function(){
        $("#alert-success").hide();
        $("#alert-danger").hide();
        $("#sign-inputPassword_check").keyup(function () {
          let pwd = $("#sign-inputPassword").val();
          let pwd_check = $("#sign-inputPassword_check").val();
          if (pwd != "" || pwd_check != "") {
            if (pwd == pwd_check) {
              $("#alert-success").show(); 
              $("#alert-danger").hide(); 
            } else {
              $("#alert-success").hide();
              $("#alert-danger").show();
            }
          }
        });
        
      });

    </script>