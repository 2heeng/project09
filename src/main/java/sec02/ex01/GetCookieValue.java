package sec02.ex01;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getcookie")
public class GetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println(request.getCookies());
		Cookie[] cookies=request.getCookies();
		
		for(Cookie cookie : cookies) {
			System.out.println("쿠키 객체: " + cookie);
			System.out.println("쿠키 이름: "+cookie.getName());
			System.out.println("쿠키 이름: "+URLDecoder.decode(cookie.getValue()));
		}
		
		
		
		
	}

}
