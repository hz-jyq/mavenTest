package knigth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fengdai.config.CDPlayerConfig;
import com.fengdai.serivce.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayTest{
	
	ContextConfiguration context;
	
	
	@Autowired
	@Qualifier("sgtPeppersNew")
	private CompactDisc cd;
	
	@Test
	public void test(){
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config/CDconfig.xml");
		cd.play();
		System.out.println(cd);
	}
	
	@Test
	public void test1(){
		"true".equals("false");
	}
}
