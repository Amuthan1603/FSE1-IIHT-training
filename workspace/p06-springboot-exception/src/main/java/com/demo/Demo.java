package com.demo;

public class Demo {
	
	int a = 0;

	public static void main(String[] args) {
		
//		new Demo().doTask();
		
		
		String n = "This is text";
		
		for(int i=0;i<100000;i++) {
			n = n + n+ n+n+n;
			n = n + n+ n+n+n;
			n = n + n+ n+n+n;
			n = n + n+ n+n+n;
			n = n + n+ n+n+n;
			n = n + n+ n+n+n;
			System.out.println(n);
		}
		
		
		
	}
	
	private void doTask() {
		System.out.println("Doing a task: "+ ++a);
		doTask();
	}
	
}
