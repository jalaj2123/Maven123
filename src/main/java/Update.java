

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webkorps.Dao.AlienDao;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		String aname=request.getParameter("aname");
		String tech=request.getParameter("tech");
		AlienDao dao=new AlienDao();
		int i=dao.Update(aid, aname, tech);
		if(i>0)
		{
	        RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	           rd.include(request,response);
	         out.print("Record Update");
	}
}
}
