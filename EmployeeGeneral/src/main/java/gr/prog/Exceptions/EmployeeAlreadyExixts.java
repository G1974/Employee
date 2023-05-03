package gr.prog.Exceptions;

import gr.prog.model.EmployeeGeneral;

public class EmployeeAlreadyExixts  extends Exception{
	
	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExixts(EmployeeGeneral employeegeneral) {
		
		super("Employee with EmployeeNumber = "+ employeegeneral.getEmployeeNumber() + "already exist");
	}
	

}
