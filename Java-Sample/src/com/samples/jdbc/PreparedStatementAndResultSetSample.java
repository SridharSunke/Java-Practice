package com.samples.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementAndResultSetSample {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.
        getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
            ,"user","password");
    Statement stmt = con.createStatement();
    
    ResultSet rs = stmt.executeQuery("select name, salary from emp");
    while(rs.next()){
        System.out.println(rs.getString("name"));
        System.out.println(rs.getInt("salary"));
    }
    
    CallableStatement callSt = con.prepareCall("{call myprocedure(?,?)}");
    callSt.setInt(1,200);
    callSt.setDouble(2, 3000);
    callSt.execute();
    rs.close();
    con.close();
    
     PreparedStatement pst = con.prepareStatement("update emp set sal=? where empid=?");
    pst.setInt(1, 3000);
    pst.setInt(2, 200);
    pst.addBatch();
    pst.setInt(1, 4000);
    pst.setInt(2, 230);
    pst.addBatch();
    int count[] = pst.executeBatch();
    
}
}
