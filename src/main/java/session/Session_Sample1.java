package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class Session_Sample1 extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		int a=36;
		
	HttpSession session=req.getSession();
	
	session.setAttribute("a", a);
	session.setMaxInactiveInterval(3);
		res.sendRedirect("session2");
	}
}
