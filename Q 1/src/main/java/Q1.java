

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Q1
 */
public class Q1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("name");
		String ps = request.getParameter("pass");
		String email = request.getParameter("email");
		
		if (fname.isEmpty() || email.isEmpty() || ps.isEmpty() || ps.length() <8);
		{
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
			if(fname.isEmpty())
			{
				out.print("<p style = 'color : red;'>First name can't be null </p>");
			}
			
			if(email.isEmpty())
			{
				out.print("<p style = 'color : red;'>Email can't be null </p>");
			}
			
			if(ps.length() < 8)
			{
				out.print("<p style = 'color : red;'> Password must be 8 character long </p>");
			}
			else
			{
				out.print("<p style = 'color : green;'>Register Successfully </p>");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
