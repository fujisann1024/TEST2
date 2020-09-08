package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;


@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//フォワード先
		String forwardPath = null;

		//サーブレットクラスの動作を決定する「action」の値を
		//リクエストパラメータから取得
		String action = request.getParameter("action");

		//「登録の開始」をリクエストされたときの処理
		if(action == null ) {
			//フォワード先を設定
			forwardPath = "/WEB-INF/jsp/registerForm.jsp";
		}

		//登録画面から「登録実行」をリクエストされたときの実行
		else if (action.equals("done")) {
			//セッションスコープに保存された登録ユーザーを取得
			HttpSession session = request.getSession();
			User registerUser = (User) session.getAttribute("registerUser");

			//登録処理の呼び出し
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(registerUser);

			//不要となったセッションスコープ内のインスタンスを削除
			session.removeAttribute("registerUser");

			//登録後のフォワード先を設定
			forwardPath = "/WEB-INF/jsp/register/Done.jsp";
		}

		//設定されたフォワード先にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);

	}


	protected void doPost(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
