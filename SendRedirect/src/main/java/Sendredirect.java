

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SendRedirect
 */
public class Sendredirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sendredirect() {
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
		PrintWriter a =response.getWriter();
		a.print("<h1> Hello From Servlet</h1>");
		a.print("<a href='index.html'>Go To Index</a>");
		String u =request.getParameter("user");
		a.print("<p>"+u+"</u>");
		if(u.equals("root"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			rd.forward(request, response);
			response.sendRedirect("home.html");
		}
		else {
			a.print("Wrong Username");
			RequestDispatcher rd = request.getRequestDispatcher("first.html");
			rd.include(request, response);
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
