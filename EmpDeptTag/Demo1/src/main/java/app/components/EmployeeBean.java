package app.components;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBean {
    private String empName;

    public String getEmpName() {
        return empName;
    }

    // public String getName() {
    //     var con = ShopDb.pool.getConnection();
    //     var stmt = con.prepareStatement("select emp_name from emp where ")
    // }
    private String name;

    public String getName() {
        return name;
    }

    public boolean authenticate(String eId , String ePwd) {
        try(var con = ShopDb.pool.getConnection()){
            var stmt = con.prepareStatement("select count(username) , emp_name from emp where username = ? and password = ?");
            stmt.setString(1 , eId);
            stmt.setString(2 , ePwd);
            var rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            rs.close();
            stmt.close();
            if(count == 1){
                stmt = con.prepareStatement(
                    "SELECT emp_name FROM emp WHERE username = ?"
                );
                stmt.setString(1, eId);

                rs = stmt.executeQuery();
                rs.next();
                String n = rs.getString(1);
                empName = eId;
                name = n;
                return true;
            }
            empName = null;
            return false;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void getDetailsEmp() {
        
    }


}