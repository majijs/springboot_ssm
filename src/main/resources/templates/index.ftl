<html>
<head>
    <title>首页</title>
</head>

<body>
    <span>欢迎来到王者荣耀</span>


    <#if customers?? && (customers?size>0)>
        <table>
            <thead>
                <tr>
                    <th>姓名</th>
                    <th>电话</th>
                    <th>邮箱</th>
                </tr>
            </thead>
            <#list customers as customer>
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.telephone}</td>
                    <td>${customer.email}</td>
                </tr>
            </#list>
        </table>
    </#if>
</body>
</html>