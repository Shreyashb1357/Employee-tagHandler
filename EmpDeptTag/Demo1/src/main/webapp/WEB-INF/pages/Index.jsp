<%@taglib prefix = "d" uri="my.app.tags"%>
<html>
    <head>
        <title>Demo-Emp</title>
    </head>
    <body>
        <h1>Welcome Employee</h1>
        <p><d:putTag format="yyyy-MM-dd hh:mm:ss" /></p>
        <form method="post">
            <p>
				<b>Employee ID</b><br/>
				<input required type="text" name="empId" />
			</p>
			<p>
				<b>Password : </b><br/>
				<input required type="password" name="pwd" />
			</p>
			<p>
				<input type="submit" value="Login" />
			</p>
        </form>
    </body>
</html>