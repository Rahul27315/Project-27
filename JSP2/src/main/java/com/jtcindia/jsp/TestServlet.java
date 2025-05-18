package com.jtcindia.jsp;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String fnm=req.getParameter("fname");
		Date dt=new Date();
		if(fnm==null||fnm.trim().length()==0) {
			fnm="Guest";
			req.setAttribute("NM",fnm);
			req.setAttribute("DT",dt);
			req.getRequestDispatcher("show.jsp").forward(req, res);				
		}
	}
}
