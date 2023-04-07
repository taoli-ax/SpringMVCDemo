<%--
  Created by IntelliJ IDEA.
  User: deuta
  Date: 2023/4/7
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.4/jquery.js"></script>

</head>
<body>

<p>ajax</p>

<form id="form1">
    <input name="name" id="name">
    <input name="brand" id="brand">
    <button type="button" id="sub">submit</button>
</form>
</body>
<script>
    $(document).ready(function (){
        // $.ajax({
        //     url:"ajax/json",
        //     success:function (msg){
        //       msg.map(item=>{
        //           console.log(item.name);
        //           console.log(item.brand);
        //       })
        //         $.each(msg,function (key,value){
        //             console.log(key+":"+value.name)
        //         })
        //     }
        // })

        $("#sub").click(function (){
                let form1={"name":$("#name").val(),"brand":$("#brand").val()};

                $.ajax({
                    url:"ajax/json2",
                    type:"post",
                    contentType:"application/json",
                    data:JSON.stringify(form1),
                    success:function (msg){
                        alert(msg);
                    }
                })
        });
    })
</script>
</html>
