package com.fengdai.serviceImpl;

import java.io.PrintStream;

import com.fengdai.serivce.Quest;

public class DragonQuest implements Quest{
	
	private PrintStream printStream;
	
	public DragonQuest(PrintStream printStream){
		this.printStream=printStream;
		
	}
	public void embark(){
		printStream.println("开始屠龙冒险");
	}
}
