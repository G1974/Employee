package gr.prog.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.prog.dao.EmployeeDao;
import gr.prog.dao.EmployeeDaoExecute;
import gr.prog.dto.EmployeeDTO;
import gr.prog.model.EmployeeGeneral;
import gr.prog.service.EmployeeService;
import gr.prog.service.EmployeeServiceExecute;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDTO employeedto=new EmployeeDTO();
		EmployeeDao employeedao=new EmployeeDaoExecute();
		EmployeeService employeeservice=new EmployeeServiceExecute(employeedao);
		response.setContentType("text/html");
		Integer id=Integer.parseInt(request.getParameter("id"));
		employeedto.setEmployeeNumber(id);
		employeedto.getEmployeeNumber();

		try {
          	employeeservice.deleteService(employeedto);
          	request.setAttribute("warning", "EMPLOYEE IS DELETED");
          	request.getRequestDispatcher("/jsps/DeleteEmployee.jsp").forward(request, response);
        
		} catch (SQLException e) {
		
			e.printStackTrace();
		}	
	
	}

}
