package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		if(req.getParameter("token")==null) {
		resp.getWriter().print("<h1> First Login then only we can logout</h1>");
		}
		else {
			resp.getWriter().print("<h1> logout successfull</h1>");
		}
	}

	

}
