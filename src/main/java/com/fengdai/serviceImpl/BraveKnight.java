package com.fengdai.serviceImpl;

import com.fengdai.serivce.Knight;
import com.fengdai.serivce.Quest;

public class BraveKnight implements Knight {
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	};
}
