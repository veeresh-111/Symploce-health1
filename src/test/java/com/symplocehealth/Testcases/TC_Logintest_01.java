package com.symplocehealth.Testcases;

	import org.testng.Assert;
import org.testng.annotations.Test;

import com.symplocehealth.pageobject.Loginpage;

	public class TC_Logintest_01 extends Baseclass
	{

		@Test
		public void loginTest() throws Exception
		{
			log.info("Entered the URL of app");
			Loginpage lp=new Loginpage(driver);
			log.info("Entered the username");
			lp.setusername(username);
			log.info("Entered the password");
			lp.setpassword(password);
			lp.clicklogin();
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				log.info("Login test passed");
			}else
			{
				captureScreen(driver,"loginTest");
				Assert.assertTrue(false);
				log.info("Login test failed");
			}
			 
		}
	}

