package com.fengdai.Utils;

public class Foo {
	private static Foo f=new Foo();
	private static int i=0;

	private  Foo(){
		 if (f != null) {
	            throw new IllegalStateException("sss");
	        }
	}
	
	public static Foo getInstance(){
			if(f==null){
				System.out.println(i+2);
				return new Foo();
			}
			System.out.println(i+1);
		return f;
	}
	public  String getPrint(String a){
		return a;
	}
}
