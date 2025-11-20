package app.components;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException , ServletException {
        request.getRequestDispatcher("/WEB-INF/pages/Index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("empId");
        String pass = request.getParameter("pwd");
        var model = new EmployeeBean();
        if(model.authenticate(name , pass)){
            request.setAttribute("employee", model);
            request.getRequestDispatcher("/WEB-INF/pages/Detail.jsp").forward(request,response);
        }else{
            request.setAttribute("request", "Invalid Id or password");
        }
    }
}