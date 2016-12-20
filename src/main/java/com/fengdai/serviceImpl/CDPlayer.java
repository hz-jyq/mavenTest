package com.fengdai.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fengdai.serivce.CompactDisc;
import com.fengdai.serivce.MediaPlayer;

@Component
public class CDPlayer  implements  MediaPlayer{

	private CompactDisc com;
	
	/*@Autowired
	public CDPlayer(@Qualifier("sgtPeppersNew") CompactDisc com){
		this.com=com;
	}*/

	public CompactDisc getCom() {
		return com;
	}

	@Autowired
	@Qualifier("sgtPeppersNew")
	public void setCom(CompactDisc com) {
		this.com = com;
	}

	@Override
	public void play() {
		com.play();
	}
	
}
