package com.vishnu.practice;

         class Test1{
	
	String name(String vishnu){
		
	return "vishnu";
	}	
	int rollno(){
	int	a=15;
		return a;
	}
	int rollno(int a){
		return a;
	}
	float marks(float d){
		
		return d;
	}
	
	void sayHi(String name){
		
		System.out.println("Hi "+name);
	}
	
	public static void main(String[] args) {
		String name = "Jaggi";
		Test1 show = new Test1();
		int x=show.rollno(15);
		String data=show.name("vishnu");
		float d=show.marks(88.25f);
		System.out.println("My name is "+data);
		System.out.println("My Roll number is "+x);
		System.out.println("Marks got "+d);
		show.sayHi(name);
		
	}
}
