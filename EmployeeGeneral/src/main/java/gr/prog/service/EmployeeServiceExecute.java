package gr.prog.service;

import java.sql.SQLException;
import java.util.List;

import gr.prog.Exceptions.EmployeeAlreadyExixts;
import gr.prog.Exceptions.EmployeeNotFound;
import gr.prog.dao.EmployeeDao;
import gr.prog.dto.EmployeeDTO;
import gr.prog.model.EmployeeGeneral;

public class EmployeeServiceExecute implements EmployeeService{

	private final EmployeeDao employeedao;
	
	public EmployeeServiceExecute(EmployeeDao employeedao)
	{this.employeedao=employeedao;}
	
	@Override
	public void insertService(EmployeeDTO employeedto) throws SQLException, EmployeeAlreadyExixts {
		
	EmployeeGeneral newEmployeeGeneral= new EmployeeGeneral();
	
	newEmployeeGeneral.setEmployeeNumber(employeedto.getEmployeeNumber());
	newEmployeeGeneral.setName(employeedto.getName());
	newEmployeeGeneral.setSurname(employeedto.getSurname());
	newEmployeeGeneral.setMarried(employeedto.getMarried());
	newEmployeeGeneral.setSex(employeedto.getSex());
	newEmployeeGeneral.setBornDate(employeedto.getBornDate());
	newEmployeeGeneral.setAddress(employeedto.getAddress());
	newEmployeeGeneral.setAddressNumber(employeedto.getAddressNumber());
	newEmployeeGeneral.setPostCode(employeedto.getPostCode());
	newEmployeeGeneral.setMobile(employeedto.getMobile());
	newEmployeeGeneral.setEmail(employeedto.getEmail());
	newEmployeeGeneral.setPosition(employeedto.getPosition());
	newEmployeeGeneral.setNationality(employeedto.getNationality());
		
  if ((employeedao.getId(newEmployeeGeneral.getEmployeeNumber())) == null)
  employeedao.insert(newEmployeeGeneral); 
  else {  throw new EmployeeAlreadyExixts(newEmployeeGeneral); } 
	}

	@Override
	public void deleteService(EmployeeDTO employeedto) throws SQLException {
		EmployeeGeneral employeegeneral= new EmployeeGeneral();
		employeegeneral.setEmployeeNumber(employeedto.getEmployeeNumber());
		employeedao.delete(employeegeneral);
		
		employeedao.delete(employeegeneral);
	}

	@Override
	public void updateService(EmployeeDTO oldemployeedto,EmployeeDTO newemployeedto) throws  EmployeeNotFound, SQLException {
		EmployeeGeneral newemplup= new EmployeeGeneral();
		newemplup.setEmployeeNumber(oldemployeedto.getEmployeeNumber());
		
		EmployeeGeneral newempl= new EmployeeGeneral();
		newempl.setMobile(newemployeedto.getMobile());
		newempl.setEmail(newemployeedto.getEmail());
		newempl.setAddress(newemployeedto.getAddress());
		newempl.setAddressNumber(newemployeedto.getAddressNumber());
		newempl.setPostCode(newemployeedto.getPostCode());
		
		
		if(employeedao.getId(newemplup.getEmployeeNumber())== null) {
			throw new EmployeeNotFound(newemplup);	
		}
		employeedao.update(newemplup, newempl);
	}

	@Override
	public List<EmployeeGeneral> getDetails(String surname) throws SQLException{
	
		return  employeedao.getDetails(surname); 
	}

	

}
