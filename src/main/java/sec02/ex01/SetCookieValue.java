package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setcookie")
public class SetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		Cookie cookie = new Cookie("password",URLEncoder.encode("짜장","utf-8"));
		System.out.println(cookie);
		
		
		//cookie.setMaxAge(24*60*60); //초 단위
		//cookie.setMaxAge(-1); //음수를 넣어 세션쿠키 만들기.  
		//양수 값은 몇 초가 지난 후 쿠키가 만료됨을 나타냅니다. 값은 쿠키의 현재 수명이 아니라 쿠키가 만료되는 최대 수명입니다.
		//음수 값은 쿠키가 지속적으로 저장되지 않으며 웹브라우저가 종료될때 삭제된다는 것을 의미합니다. 값이 0이면 쿠키가 삭제됩니다. 
		response.addCookie(cookie);
		
		Date date = new Date();
//		pw.write(date.toString() + "<br>");
		pw.write(date.toLocaleString());

	}

}
