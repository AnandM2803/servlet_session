package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class Session_Sample2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	HttpSession	session=req.getSession();
			int a=(int)session.getAttribute("a");
	
			session.invalidate();
			res.getWriter().print("<h1>"+a+"</h1>");
			
	}

	
}
