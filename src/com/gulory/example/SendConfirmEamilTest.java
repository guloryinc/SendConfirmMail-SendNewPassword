package com.gulory.example;

import org.apache.commons.mail.EmailException;

import com.gulory.mail.SendConfirmEmail;

public class SendConfirmEamilTest {
	public static void main(String[] args) throws EmailException
	{
		SendConfirmEmail test = new SendConfirmEmail("xueyan@gulory.com", "911911911");
		test.SendEmail();
	}

}
