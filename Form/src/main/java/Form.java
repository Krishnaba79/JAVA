

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Form
 */
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String fname=request.getParameter("Firstname");
		String lname=request.getParameter("Lastname");
		String Mno =request.getParameter("Mobileno");
		String Gender =request.getParameter("gender");
		String Pass=request.getParameter("Password");
		String Cpass=request.getParameter("cpassword");
		String Address=request.getParameter("address");
		PrintWriter out=response.getWriter();
		out.println("Your Username is "+fname +" "+lname +" Your Mobile No is "+Mno +" Your Gender is "+Gender 
				+" Password is " +Pass+" Your Confirm Pass is "+Cpass+" Your Address is "+Address);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
