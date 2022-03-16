

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webkorps.Dao.AlienDao;

/**
 * Servlet implementation class Delete
 */
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter(); 
		int aid =Integer.parseInt(request.getParameter("aid"));
		AlienDao dao=new AlienDao();
		int i=dao.Delete(aid);
		if(i>0)
		{
	        RequestDispatcher rd=request.getRequestDispatcher("home.html");
	           rd.include(request,response);
	         out.print("Record delete");
	}
		else
			
		{
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
	           rd.include(request,response);
	         out.print("Record not delete");
		}
		

	}

}
