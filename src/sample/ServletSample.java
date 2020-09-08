package sample;

import java.io.IOException;
//HTMLを出力するため
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

//Enter押したら出てきた
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//自動生成
@WebServlet("/ServletSample")
//自動生成
public class ServletSample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//自動生成
    public ServletSample() {
        super();
    }

    //自動生成
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException {

		//運勢をランダムで決定
		String[] luckArray = {"超スッキリ","スッキリ","最悪"};
		int index = (int) (Math.random() * 3);
		String luck = luckArray[index];

		//実行日を取得
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);


		//Content-Typeヘッダの設定
		response.setContentType("text/html; charset=UTF-8");//HTMLを出力する場合
		//Content-Typeの設定後に記述
		//HTMLの出力
		PrintWriter out = response.getWriter();
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>スッキリ占い</title>");
		 out.println("</head>");
		 out.print("<body>");
		 out.print("<p>" + today + "の運勢は「" + luck + "」です</p>");
		 out.print("</body>");
		 out.println("</html>");
		 //上の構文はHTML出力のお約束

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
