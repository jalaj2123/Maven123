package com.webkorps;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webkorps.Dao.AlienDao;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAlienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid=Integer.parseInt(request.getParameter("aid"));
		AlienDao dao=new AlienDao();
		Alien a1=dao.getAlien(aid);
	RequestDispacher rd=request.getRequestDispatcher("Show.jsp");
	rd.forward(response,request);
	 request.setAttribute("alien", "a1");
	}

}
