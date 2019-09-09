

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/login.html"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String userName = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		if (checkLogin(userName, passwd)) {
			request.getRequestDispatcher("/member.html").forward(request, response);
		} else { 
			response.sendRedirect("login.jsp");
		}
	}

	private boolean checkLogin(String userName, String passwd) {
		User user = User.getInstance();
		Map<String, String> map = user.getUserMap();
		if (userName != null && !"".equals(userName) && passwd != null && !"".equals(passwd)) {
			String[] arr = map.get(userName).split("##");
			if (arr == null) {
				return false;
			}
			if (arr[0].equals(passwd)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
