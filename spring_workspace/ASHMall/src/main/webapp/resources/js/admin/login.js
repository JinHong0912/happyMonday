$(document).ready(function(){

    var form = $("#loginForm");

    $("#btn_loin").on("click", function(){

        var admin_id = $("#admin_id");
        var admin_pw = $("#admin_pw");

        if(admin_id.val()==null || admin_id.val()==""){
            alert("ENTER YOUR ID");
            admin_id.focus();
        } else if(admin_pw.val()==null || admin_pw.val()==""){
            alert("ENTER YOUR PASSWORD");
            admin_pw.focus();
        } else{
            form.submit();
        }

    });

});