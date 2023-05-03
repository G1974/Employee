package gr.prog.Exceptions;

import gr.prog.model.EmployeeGeneral;

public class EmployeeNotFound extends Exception{

	private static final long serialVersionUID = 1L;

public EmployeeNotFound(EmployeeGeneral employeegeneral) {
		
		super("Employee with EmployeeNumber = "+ employeegeneral.getEmployeeNumber() + "   does no exist");
	}
	
}
