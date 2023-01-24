package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class Cookie_Sample2 extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		Cookie[] cookies=req.getCookies();
		
		for(Cookie cookie:cookies)
		{
//			if(cookie.getName().equals("a"))
			resp.getWriter().print("<h1>"+cookie.getValue()+"</h1>");
		}
	}
	catch(Exception e)
	{
		
	}
		resp.getWriter().print("<h1> Logout </h1>");
	}
}
