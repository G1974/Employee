package gr.prog.controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.prog.Exceptions.EmployeeAlreadyExixts;
import gr.prog.dao.EmployeeDao;
import gr.prog.dao.EmployeeDaoExecute;
import gr.prog.dto.EmployeeDTO;
import gr.prog.service.EmployeeService;
import gr.prog.service.EmployeeServiceExecute;

/**
 * Servlet implementation class EmployeeInsert
 */
public class EmployeeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EmployeeDTO employeedto;
		EmployeeDao employeedao = new EmployeeDaoExecute();
		EmployeeService employeeservice = new EmployeeServiceExecute(employeedao);
		response.setContentType("text/html");
		
		int employeenumber=Integer.parseInt(request.getParameter("employeenumber"));
		String name=request.getParameter("name");
		String Surname=request.getParameter("surname");
		String married=request.getParameter("married");
		String sex=request.getParameter("sex");
		String birthdate=request.getParameter("birthdate");
		String address=request.getParameter("address");
		int addressnumber=Integer.parseInt(request.getParameter("addressnumber"));
		String postcode=request.getParameter("postcode");
		String mobile=request.getParameter("mobilephone");
		String email=request.getParameter("email");
		String position=request.getParameter("position");
		String nationality=request.getParameter("nationality");
		
		employeedto = new EmployeeDTO(employeenumber,name,Surname,married,sex,birthdate,address,addressnumber,postcode,mobile,email,position,nationality);
			
		  try { employeeservice.insertService(employeedto);
		  request.setAttribute("inserts", employeedto);
		  request.getRequestDispatcher("/jsps/EmployeeInserts.jsp").forward(request, response);
		  } catch (SQLException | EmployeeAlreadyExixts e) { e.printStackTrace();
		  request.getRequestDispatcher("/jsps/EmployeeExists.jsp").forward(request, response);
		  }
		 
	}

}
