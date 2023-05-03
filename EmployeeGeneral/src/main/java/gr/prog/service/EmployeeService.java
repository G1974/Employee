package gr.prog.service;

import java.sql.SQLException;
import java.util.List;

import gr.prog.Exceptions.EmployeeAlreadyExixts;
import gr.prog.Exceptions.EmployeeNotFound;
import gr.prog.dto.EmployeeDTO;
import gr.prog.model.EmployeeGeneral;

public interface EmployeeService {
	
void insertService(EmployeeDTO employeedto) throws SQLException, EmployeeAlreadyExixts;
void deleteService(EmployeeDTO employeedto) throws SQLException;
void updateService(EmployeeDTO oldemployeedto,EmployeeDTO newemployeedto) throws SQLException, EmployeeNotFound;
List<EmployeeGeneral>getDetails(String surname)throws SQLException, EmployeeNotFound;
}
