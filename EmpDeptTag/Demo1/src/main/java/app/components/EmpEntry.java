package app.components;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpEntry {
    private int eId;
    private int hId;
    private Date Adate;
    private String description;

    public EmpEntry(ResultSet s) throws SQLException {
        eId = s.getInt("emp_id");
        hId = s.getInt("history_id");
        Adate = s.getDate("action_date");
        description = s.getString("action_description");
    }

    public int getEId(){
        return eId;
    }

    public int getHId(){
        return hId;
    }

    public Date getAdate() {
        return Adate;
    }

    public String getDesc() {
        return description;
    }


}
