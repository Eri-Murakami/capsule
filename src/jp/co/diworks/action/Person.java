package jp.co.diworks.action;

public class Person {
	private String name = null;
	private int age = 0;
	
	private Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	private String getName() {
		return this.name;
	} 
	
	private void setName(String name) {
		this.name = name;
	}
	
	//演習⑤
	private int getAge() {
		return this.age; 
	}
		
	private void setAge(int age) {
		this.age = age;
	}

}
