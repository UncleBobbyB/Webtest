

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Guess
 */
@WebServlet("/Guess")
public class Guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guess() {
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
		String guessNumber = request.getParameter("guessNumber");
		int number = Integer.parseInt(guessNumber);
		HttpSession session = request.getSession();
		Integer currentNumber = (Integer)session.getAttribute("currentNumber");
		String context = request.getContextPath();
		if (currentNumber == null) {
			currentNumber = 1 + (int)(Math.random() * 50);
			session.setAttribute("currentNumber", currentNumber);
		}
//		System.out.println(currentNumber);
		if (number > currentNumber) {
			response.sendRedirect(context + "/guessNumber.jsp?flag=larger");
		} else if (number < currentNumber) {
			response.sendRedirect(context + "/guessNumber.jsp?flag=lesser");
		} else {
			currentNumber = 1 + (int)(Math.random() * 50);
			session.setAttribute("currentNumber", currentNumber);
			response.sendRedirect(context + "/guessNumber.jsp?flag=success");
		}
	}

}
