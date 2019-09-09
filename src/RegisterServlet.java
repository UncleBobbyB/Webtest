

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "registerServlet", urlPatterns = {"/register.html"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		String confirmPasswd = request.getParameter("confirmPasswd");
		String email = request.getParameter("email");
		List<String> errors = new ArrayList<String>();
		if (!isValidEmail(email)) {
			errors.add("无效的邮箱号码");
		}
		if (inValidUsername(userName)) {
			errors.add("有户名为空或者已经存在");
		}
		if (inValidPassword(passwd, confirmPasswd)) {
			errors.add("密码为空或者密码不一致");
		}
		if (!errors.isEmpty()) {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("/error.html").forward(request, response);
		} else {
			User user = User.getInstance();
			Map<String, String> map = user.getUserMap();
			map.put(userName, passwd + "##" + email);
			request.getRequestDispatcher("/success.html").forward(request, response);
		}
	}

	private boolean inValidPassword(String passwd, String confirmPasswd) {
		return passwd == null || confirmPasswd == null || passwd.length() < 6 || !passwd.equals(confirmPasswd);
	}

	private boolean inValidUsername(String userName) {
		User user = User.getInstance();
		Map<String, String> map = user.getUserMap();
		if (userName != null && !userName.equals("")) {
			if (map.get(userName) != null && !map.get(userName).equals("")) {
				return true;
			} else {
				return false;
			}
		}
		return true;
		
	}

	private boolean isValidEmail(String email) {
		boolean flag = false;
		if (email == null || "".equals(email)) {
			flag = false;
		}
		if (email != null && !"".equals(email)) {
			flag = email.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$");
		}
		return flag;
	}

}
