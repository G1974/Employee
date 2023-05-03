package gr.prog.controler;

import java.awt.SystemColor;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.prog.Exceptions.EmployeeNotFound;
import gr.prog.dao.EmployeeDao;
import gr.prog.dao.EmployeeDaoExecute;
import gr.prog.dto.EmployeeDTO;
import gr.prog.service.EmployeeService;
import gr.prog.service.EmployeeServiceExecute;

/**
 * Servlet implementation class EmployeeUpdate
 */
public class EmployeeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDTO employeedto = new EmployeeDTO();
		EmployeeDao employeedao = new EmployeeDaoExecute();
		EmployeeService employeeservice = new EmployeeServiceExecute(employeedao);
		response.setContentType("text/html");
		
		Integer num=Integer.parseInt(request.getParameter("employeenumber"));
		String nums=request.getParameter("mobile");
		Integer numss=Integer.parseInt(request.getParameter("addressnumber"));
		String em=request.getParameter("email");
		String ad=request.getParameter("address");
		String ads=request.getParameter("postcode");
	
		employeedto.setMobile(nums);
		employeedto.setEmail(em);
		employeedto.setAddress(ad);
		employeedto.setAddressNumber(numss);
		employeedto.setPostCode(ads);
		employeedto.setEmployeeNumber(num);
		
		try {
			employeeservice.updateService(employeedto, employeedto);
			request.setAttribute("warning", "successfully updated");
			request.getRequestDispatcher("/jsps/UpdateEmployee.jsp").include(request, response);
		} catch (SQLException | EmployeeNotFound e) {
			e.printStackTrace();
			request.setAttribute("error", "registration does not exist ");
			request.getRequestDispatcher("/jsps/UpdateEmployee.jsp").include(request, response);
			
		}
		
	}

}
