package model;//クラスはpublicでパッケージに所属する

import java.io.Serializable;
//Serializableインターフェースを実装する
public class Human implements Serializable {
	//フィールドはカプセル化する
	private String name;
	private int age;
	//publicで引数のないコンストラクタを持つ
	public Human() {}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//ゲッターとセッターを持つ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
