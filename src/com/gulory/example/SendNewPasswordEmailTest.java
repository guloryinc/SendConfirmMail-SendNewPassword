package com.gulory.example;

import org.apache.commons.mail.EmailException;

import com.gulory.mail.SendNewPasswordEmail;

public class SendNewPasswordEmailTest {
	public static void main(String[] args) throws EmailException{
		
		/*
		 * SendConfirmEmail(String useremailaddress , String userpassword)
		 * useremailaddress is user's email address.
		 * userpassworrd is user's new password
		 */
		SendNewPasswordEmail test = new SendNewPasswordEmail("xueyan@gulory.com","911911911");
		test.SendEmail();//Send the mail.
	}

}
