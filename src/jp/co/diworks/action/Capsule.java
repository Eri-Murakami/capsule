package jp.co.diworks.action;

public class Capsule {
	public static void main(String[]args) {
		Person taro = new Person("山田太郎",20);
		System.out.println(taro.getName());
		taro.setName("花子");
		System.out.println(taro.getName());
		
		//演習⑤
		taro.setAge(30);
		System.out.println(taro.getAge());
	}
}
