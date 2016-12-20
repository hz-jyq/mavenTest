package com.fengdai.serviceImpl;

import org.springframework.stereotype.Component;

import com.fengdai.serivce.CompactDisc;

@Component
public class SgtPeppersNew  implements CompactDisc{
	
	  private String title = "Sgt. Pepper‘s Lonely Hearts Club Band";
	   private String artist = "http://blog.csdn.net/unix21";
	    
	    @Override
	    public void play() {
	        System.out.println("【非常醒目SgtPeppersnew 】>>>>>>>>>>>>>>>>>Playing " + title + " by " + artist);
	    }
}


