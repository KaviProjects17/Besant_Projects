package employeePackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class EmployeeSuccessServlet
 */
@WebServlet("/EmployeeSuccessServlet")
public class EmployeeSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Employee e = (Employee) request.getAttribute("Employee");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<H1> Employee Registeration Successfully </H1>");
		out.println("<ul>");
		out.println("<li>"+e.getFirstname()+"</li>");
		out.println("<li>"+e.getLastname()+"</li>");
		out.println("<li>"+e.getUsername()+"</li>");
		out.println("<li>"+e.getPassword()+"</li>");
		out.println("<li>"+e.getAddress()+"</li>");
		out.println("<li>"+e.getContactno()+"</li>");
		out.println("</ul>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
