package gr.prog.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gr.progr.database.*;

import gr.prog.model.EmployeeGeneral;

public class EmployeeDaoExecute implements EmployeeDao{

	@Override
	public void insert(EmployeeGeneral empolyeegeneral) throws SQLException {
	  
		String  sql="INSERT INTO information (employeenumber,name,surname,married,sex,birthdate,address,addressnumber,postcode,mobilephone,email,position,nationality) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
		 
		  PreparedStatement pst= DataBaseConnection.openc().prepareStatement(sql);
		  pst.setInt(1, empolyeegeneral.getEmployeeNumber());
		  pst.setString(2,empolyeegeneral.getName());
		  pst.setString(3,empolyeegeneral.getSurname());
		  pst.setString(4,empolyeegeneral.getMarried());
		  pst.setString(5,empolyeegeneral.getSex());
		  pst.setString(6,empolyeegeneral.getBornDate());
		  pst.setString(7,empolyeegeneral.getAddress());
		  pst.setInt(8,empolyeegeneral.getAddressNumber());
		  pst.setString(9,empolyeegeneral.getPostCode());
		  pst.setString(10,empolyeegeneral.getMobile());
		  pst.setString(11,empolyeegeneral.getEmail());
		  pst.setString(12,empolyeegeneral.getPosition());
		  pst.setString(13,empolyeegeneral.getNationality());
		  pst.executeUpdate();
		
       pst.close();
		DataBaseConnection.closestm(pst);
		DataBaseConnection.opencl();
	}

	@Override
	public void delete(EmployeeGeneral empolyeegeneral) throws SQLException {
		String query="delete from information where employeenumber="+empolyeegeneral.getEmployeeNumber()+"";
		 PreparedStatement pst= DataBaseConnection.openc().prepareStatement(query);
		 pst.executeUpdate();
	
	
			DataBaseConnection.closestm(pst);
			DataBaseConnection.opencl();
		 
	}

	@Override
	public void update(EmployeeGeneral oldempolyeegeneral, EmployeeGeneral newempolyeegeneral) throws SQLException {
		String query="update information set mobilephone=?,"+"email=?,"+"address=?,"+"addressnumber=?,"+"postcode=? "+"where employeenumber=?";
		 PreparedStatement pst= DataBaseConnection.openc().prepareStatement(query);
		 pst.setString(1, newempolyeegeneral.getMobile());
		 pst.setString(2, newempolyeegeneral.getEmail());
		 pst.setString(3, newempolyeegeneral.getAddress());
		 pst.setInt(4, newempolyeegeneral.getAddressNumber());
		 pst.setString(5, newempolyeegeneral.getPostCode());
		 pst.setInt(6, oldempolyeegeneral.getEmployeeNumber());
		 pst.executeUpdate();
	
			DataBaseConnection.closestm(pst);
			DataBaseConnection.opencl();
		
	}

	@Override
	public List<EmployeeGeneral> getDetails(String surnames) throws SQLException {
		String query="select employeenumber,name,surname,married,sex,birthdate,address,addressnumber,postcode,mobilephone,email,position,nationality from information where surname ='"+surnames+"'"; 	
		PreparedStatement ps=DataBaseConnection.openc().prepareStatement(query);		
		ResultSet rs=ps.executeQuery();
		List<EmployeeGeneral>employeegeneral=new ArrayList<>();
		
	
		while(rs.next()) {
			EmployeeGeneral employeegenerals=new EmployeeGeneral();
			employeegenerals.setEmployeeNumber(rs.getInt("employeenumber"));
			employeegenerals.setName(rs.getString("name"));
			employeegenerals.setSurname(rs.getString("surname"));
			employeegenerals.setMarried(rs.getString("married"));
			employeegenerals.setSex(rs.getString("sex"));
			employeegenerals.setBornDate(rs.getString("birthdate"));
			employeegenerals.setAddress(rs.getString("address"));
			employeegenerals.setAddressNumber(rs.getInt("addressnumber"));
			employeegenerals.setPostCode(rs.getString("postcode"));
			employeegenerals.setMobile(rs.getString("mobilephone"));
			employeegenerals.setEmail(rs.getString("email"));
			employeegenerals.setPosition(rs.getString("position"));
			employeegenerals.setNationality(rs.getString("nationality"));
			employeegeneral.add(employeegenerals);
		}
		
		DataBaseConnection.resultclose(rs);
		DataBaseConnection.closestm(ps);
		DataBaseConnection.opencl();
	
				
		return (!employeegeneral.isEmpty())? employeegeneral : null;
	}

	@Override
	public EmployeeGeneral getId(int id) throws SQLException {
     boolean emplouyeeFound = false;
		
		String sql = "SELECT * FROM information  WHERE employeenumber= " 
				+ id;
	    PreparedStatement pst = DataBaseConnection.openc().prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    
	    EmployeeGeneral employeegeneral = new EmployeeGeneral();
	    
	    if (rs.next()) {
	    	employeegeneral.setEmployeeNumber(rs.getInt("employeenumber"));
	    	employeegeneral.setName(rs.getString("name"));
	    	employeegeneral.setSurname(rs.getString("surname"));
	    	employeegeneral.setMarried(rs.getString("married"));
	    	employeegeneral.setSex(rs.getString("sex"));
	    	employeegeneral.setBornDate(rs.getString("birthdate"));
	    	employeegeneral.setAddress(rs.getString("address"));
	    	employeegeneral.setAddressNumber(rs.getInt("addressnumber"));
	    	employeegeneral.setPostCode(rs.getString("postcode"));
	    	employeegeneral.setMobile(rs.getString("mobilephone"));
	    	employeegeneral.setEmail(rs.getString("email"));
	    	employeegeneral.setPosition(rs.getString("position"));
	    	employeegeneral.setNationality(rs.getString("nationality"));
	    	emplouyeeFound = true;
	    }
	    
		DataBaseConnection.resultclose(rs);
		DataBaseConnection.closestm(pst);
		DataBaseConnection.opencl();
	    
	    return (emplouyeeFound) ? employeegeneral : null;
	
	}
	

}
