package com.internousdev.sampleweb.action;

public class Testmoveing {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String value="";
		double d;

		for
		(int i=1; i<=16; i++)
		{
			d=Math.random() * 10;
			value=value+((int)d);

			 System.out.println("-----------------------------------------"+i+"--------------");
			 System.out.println(value);

		}
			System.out.println("-----------------------------------------END-------------");
			System.out.println("TempUserIdは[ "+value+" ]です");
	}

}
