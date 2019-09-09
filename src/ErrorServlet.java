

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet(name = "errorServlet", urlPatterns = {"/error.html"})
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("test/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head><title>新增会员失败</title></head>");
		out.println("<body>");
		out.println("<h2>新增会员失败</h2>");
		List<String> list = (List<String>)request.getAttribute("errors");
		for (String str: list) {
			out.println(str + "<br>");
		}
		out.println("<a href=\"" + request.getContextPath() + "/register.jsp\">返回注册首页</a>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
