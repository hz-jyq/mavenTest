package knigth;

import org.junit.Test;

import com.fengdai.serivce.Quest;
import com.fengdai.serviceImpl.BraveKnight;
import com.fengdai.serviceImpl.DragonQuest;

public class BraveKnigthTest {
	@Test
	public void KnigthOnQuest(){
		 Quest quest=new DragonQuest(System.out);
		BraveKnight braveKnight=new BraveKnight(quest);
		braveKnight.embarkOnQuest();
	}
}
