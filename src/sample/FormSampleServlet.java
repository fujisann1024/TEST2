package sample;

import java.io.IOException;
import java.io.PrintWriter;

//暗黙オブジェクト
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public FormSampleServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//requestパラメータの文字コードを指定
		//リクエストパラメータを元に戻す
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		//フォームで取得したnameの値を変数に格納する
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");


		//リクエストパラメータをチェック
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if(gender == null || gender.length() == 0) {
			errorMsg += "性別が選択されていません<br>";
		}else {
			if(gender.equals("0")) {
				gender = "男性";
			}else if(gender.contentEquals("1")) {
				gender = "女性";
			}
		}

		//表示するメッセージを表示
		String msg = name + "さん(" + gender + ")を登録しました";
		if(errorMsg.length() != 0) {
			msg = errorMsg;
		}

		//Content-Typeヘッダの設定
		response.setContentType("text/html; charset=UTF-8");//HTMLを出力する場合
		//Content-Typeの設定後に記述
		//HTMLの出力
		PrintWriter out = response.getWriter();
		 out.println("<!DOCTYPE html>");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset=\"UTF-8\">");
		 out.println("<title>ユーザー登録結果</title>");
		 out.println("</head>");
		 out.print("<body>");
		 out.print("<p>" + msg + "</p>");
		 out.print("</body>");
		 out.println("</html>");
		doGet(request, response);
	}

}
