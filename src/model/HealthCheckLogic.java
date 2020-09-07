package model;

public class HealthCheckLogic {
	public void execute(Health health) {
		//BMIを算出して設定
		//Healthクラスのフィールドを取得
		double weight = health.getWeight();
		double height = health.getHeight();
		//bmi変数に取得したフィールドを利用して計算した結果を返す
		double bmi = weight / (height / 100.0 * height / 100.0);
		//Healthクラスのbmiフィールドに結果を代入する
		health.setBmi(bmi);

		//BMI指数から体型を判定して設定
		String bodyType;
		if(bmi < 18.5) {
			bodyType = "やせ型";
		}else if(bmi < 25){
			bodyType = "普通";
		}else {
			bodyType = "肥満";
		}
		//Healthクラスのbmiフィールドに結果を代入する
		health.setBodyType(bodyType);
	}
}
