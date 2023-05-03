package gr.progr.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection{

	private  static Connection c=null;
    private DataBaseConnection() {}
 
    public static Connection openc()throws SQLException{
	
    	String con="jdbc:sqlite:C:/Users/Giorgos/Documents/PRPGRAMS/employee/detailsEmployee.db";
    
    	DriverManager.registerDriver(new org.sqlite.JDBC());
        c=DriverManager.getConnection(con);

        System.out.println("is connected");
 return c;
    }

    public static void  opencl()throws SQLException{
    	
    	try {		
    		if(c!=null)c.close();
    	}catch(Exception  e) {e.printStackTrace(); System.out.println("not connected");}
    }
    
    public static void resultclose(ResultSet rs) {
        try { 		
    		if(rs!=null)rs.close();
    	}catch(Exception  e) {e.printStackTrace();}
    	
    }
    public static void closestm(PreparedStatement stm ) {
        try {   		
    		if(stm!=null)stm.close();
    	}catch(Exception  e) {e.printStackTrace();}
    	
    }
}	

