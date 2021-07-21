package login_con;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Hibermodel.hibernatefunct;


public class log_in {

	@WebServlet("/index")
	public class LoginController extends HttpServlet {
		private hibernatefunct login;
public void fixit(){
	login = new hibernatefunct();
}



		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			try {
				authenticate(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void authenticate(HttpServletRequest request, HttpServletResponse response)
				throws Exception {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			if (login.validate(username, password)) {
				RequestDispatcher dispatcher;
				dispatcher = request.getRequestDispatcher("login_success.jsp");
				dispatcher.forward(request, response);
			} else {
				throw new Exception("Login not successful..");
			}
		}

}}
