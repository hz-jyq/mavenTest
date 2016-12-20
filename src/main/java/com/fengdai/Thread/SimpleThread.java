package com.fengdai.Thread;

import com.fengdai.Utils.Foo;

public class SimpleThread  extends Thread{
	  public SimpleThread() {
		
	  }
	  public void run() {
	    while(true) {
	    	  Foo.getInstance();
	    }
	  }
	  public static void main(String[] args) {
	    for(int i = 0; i < 10; i++)
	      new SimpleThread().start();
	    System.out.println("All Threads Started");
	  }
}
