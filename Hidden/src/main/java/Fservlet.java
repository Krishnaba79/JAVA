

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Fservlet
 */
public class Fservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		p.print("<h1>Welcome,"+name+"</h1>");
		
//		p.print("<a href='Sservlet'>Next Page</a>");
		
//		p.print("<form action='Sservlet'>");
//		p.print("<input type='text' name='username'"+"value='"+name+"'hidden/>");
//		p.print("<input type = 'submit' value = 'Next Page' />");
//		p.print("</form>");
		
		p.print("<a href ='Sservlet?username="+name+"'>Next</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
