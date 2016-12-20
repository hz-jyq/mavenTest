package com.fengdai.execution;

import java.io.PrintStream;

public class MinStrel {
		private PrintStream stream;
		
		
		public PrintStream getStream() {
			return stream;
		}
		
		public  MinStrel(PrintStream stream){
			this.stream=stream;
		}

		public void setStream(PrintStream stream) {
			this.stream = stream;
		}

		public void singBeforeQuest(){
			stream.println("进军");
		}
		
		public void singAfterQuest(){
			stream.println("杀死龙了");
		}
	
		
}
