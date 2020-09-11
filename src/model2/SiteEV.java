package model2;

import java.io.Serializable;

public class SiteEV implements Serializable {
	private int like; //いいねの数
	private int dislike;//よくないねの数
	//コンストラクタ
	public SiteEV() {
		like = 0;
		dislike = 0;
	}
	//ゲッター,セッター
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}


}
