

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Getformvalues
 */
public class Getformvalues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getformvalues() {
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
		PrintWriter p=response.getWriter();
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String hobbies[]= request.getParameterValues("hobby");
		
		p.print("<h1>Form values</h1>");
		p.print("<h3>Selected name is :"+name+"</h3>");
		p.print("<h3>Selected gender is :"+gender+"</h3>");
		p.print("<h3>Selected hobbies are:</h3>");
		for(int i=0;i<hobbies.length;i++) {
			p.print("<p>"+hobbies[i]+"</p>");
		}

	}

	protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
