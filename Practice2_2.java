class Practice2_2{
	public static void main(String[] args){

		//数値代入用のint型変数
		int num1,num2,num3;

		//合計値代入用のint型変数
		int sum;

		//平均値代入用のint型変数
		int ave;

		num1 = 24;
		num2 = 63;
		num3 = 77;

		sum = num1 + num2 + num3;

		ave = sum /3;

		System.out.println("num1の値は" + num1 + "です。");
		System.out.println("num2の値は" + num2 + "です。");
		System.out.println("num3の値は" + num3 + "です。");
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + ave + "です。");


	}
}