package gr.prog.controler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.prog.Exceptions.EmployeeNotFound;
import gr.prog.dao.EmployeeDao;
import gr.prog.dao.EmployeeDaoExecute;
import gr.prog.model.EmployeeGeneral;
import gr.prog.service.EmployeeService;
import gr.prog.service.EmployeeServiceExecute;

/**
 * Servlet implementation class EmployeeSearch
 */
public class EmployeeSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmployeeDao employeedao = new EmployeeDaoExecute();
		EmployeeService employeeservice = new EmployeeServiceExecute(employeedao);
		List<EmployeeGeneral>employeegenerals=new ArrayList<>();
		
		response.setContentType("text/html"); 
		String sur=request.getParameter("searchInput");
		
			try {
				employeegenerals=employeeservice.getDetails(sur);
			
			} catch (SQLException | EmployeeNotFound e ) {
				e.printStackTrace();			
			}
		   
			if (employeegenerals != null) {
				request.setAttribute("search", employeegenerals);
				request.getRequestDispatcher("/jsps/EmployeeSearch.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/jsps/notFound.jsp").forward(request, response);
				
			}
	}

}
