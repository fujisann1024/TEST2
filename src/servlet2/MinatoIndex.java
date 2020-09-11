package servlet2;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.SiteEV;
import model2.SiteEVLogic;


@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public MinatoIndex() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {
		//アプリケーションスコープに保存されたサイトを評価
		ServletContext application = this.getServletContext();
		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");

		//サイト評価の初期化(初回リクエスト時実行)
		if(siteEV == null) {
			siteEV = new SiteEV();
		}

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		//サイトの評価処理(初回リクエスト時は実行しない)
		SiteEVLogic siteEVLogic = new SiteEVLogic();
		if(action != null && action.equals("like")) {
			siteEVLogic.dislike(siteEV);
		}else if(action != null && action.equals("dislike")){
			siteEVLogic.dislike(siteEV);
		}

		//アプリケーションスコープにサイト評価を保存
		application.setAttribute("siteEV ", siteEV);


	}


	protected void doPost(HttpServletRequest request,
	HttpServletResponse response) throws ServletException, IOException {

	}

}
