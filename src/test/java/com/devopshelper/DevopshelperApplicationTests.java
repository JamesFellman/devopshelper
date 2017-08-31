package com.devopshelper;

import com.devopshelper.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopshelperApplicationTests {


	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocalService() throws Exception {
		String expectpedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected String don't match", expectpedResult, actual);
	}

}
