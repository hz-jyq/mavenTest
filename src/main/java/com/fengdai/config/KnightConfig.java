package com.fengdai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fengdai.serivce.Knight;
import com.fengdai.serivce.Quest;
import com.fengdai.serviceImpl.BraveKnight;
import com.fengdai.serviceImpl.DragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight  knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest  quest(){
		return new DragonQuest(System.out);
	}
	
}
