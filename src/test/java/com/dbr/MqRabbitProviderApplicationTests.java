package com.dbr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqRabbitProviderApplicationTests {
	@Autowired
	private RabbitTemplate template;
	@Test
	public void contextLoads() {
		JSONObject msgJson = new JSONObject();
		for (int i = 0; i < 100; i++) {
			msgJson.put("id", i);
	 		template.convertAndSend("topicExchange", "hhh", msgJson);
		}

	}

}
