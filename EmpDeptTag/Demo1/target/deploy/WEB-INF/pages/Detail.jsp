<%@ taglib prefix = "d" uri = "my.app.tags"%>

<jsp:useBean id = "employee" class = "app.components.EmployeeBean" scope = "request"/>
<html>
	<head>
		<title>demo-app</title>
	</head>
	<body>
		<h1>Welcome Employee</h1>
        <hr/>
        <d:putTag format="yyyy-MM-dd HH:mm:ss" />
		<hr/>
		<h2>Orders for ${employee.name}</h2>
        <table border="1">
            <tr>
                <th>Employee Id</th>
                <th>History Id</th>
                <th>Action Date</th>
                <th>Action Description</th>
            </tr>
            <d:forEachEmp detailVar = "entry" empSource="${employee.detailsEmp}">
                <tr>
                    <td>${entry.EId}</td>
                    <td>${entry.HId}</td>
                    <td>${entry.adate}</td>
                    <td>${entry.desc}</td>
                </tr>
            </d:forEachEmp>
           
        </table>
        <p>
            <a href="/">Logout</a>
        </p>
	</body>
    <hr/>
    <d:putTag format="yyyy-MM-dd HH:mm:ss" />
</html>
