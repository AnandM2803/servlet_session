package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class Sample extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int x=10;
		int y=6;
//		req.setAttribute("X", x);
//		req.getRequestDispatcher("tester").forward(req, resp);
		
		res.sendRedirect("tester?x="+x+"&y="+y);
	}

}
