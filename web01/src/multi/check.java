package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check.do")
public class check extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("check 서블릿하나가가 만들어 진다.");
	}
	@Override
	public void destroy() {
		System.out.println("check 서블릿 소멸됨");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");
		String result = "그냥있자" ; 
		if (today.equals("맑음")) {
			result = "나가자";
		}else if (today.equals("흐림")) {
			result = "코딩";
		}else if (today.equals("비옴")) {
			result = "쇼핑";
		}
		out.print(result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src ='no.png'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src ='yes.png'>";
		}
	
		out.print(result);
		out.close();	
	}

}
