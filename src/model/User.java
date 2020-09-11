package model;

import java.io.Serializable;

public class User implements Serializable{
	private String id;
	private String name;
	private String pass;
	//コンストラクタ(引数なし)
	public User() {

	}
	//コンストラクタ(引数あり)
	public User(String id, String name, String pass) {
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
	//フィールドのゲッターの作成
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}

}
