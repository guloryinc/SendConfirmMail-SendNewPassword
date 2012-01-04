package com.gulory.mail;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendConfirmEmail {
	private static String useremail = null;
	private static String userpasswords = null;
		
	public SendConfirmEmail(String useremailaddress , String userpassword){
		useremail = useremailaddress;
		userpasswords = userpassword;
		
	}
	
    public static void SendEmail() throws EmailException    
    {    
        SimpleEmail email = new SimpleEmail();       
//        email.setTLS(true); //Set TLS
        email.setSSL(true);   //Set SSL
        email.setHostName("smtp.gmail.com");          
        email.setAuthentication("hello@gulory.com", "@gulorycom");   //User name and password
        email.setFrom("hello@gulory.com", "Welcome to DataBumble!");
            
        try     
        {    
          email.addTo(useremail); //Receiver    
 //           email.addCc("xxx@gulory.com"); //CC     
//            email.addBcc("xxx@gulory.com"); //CC secret 
            email.setSubject("Welcome to DataBumble!");         //Title       
            email.setMsg("Welcome to DataBumble! .\n" +"\n" + "Please click the link below to signin DataBumble ! After you have done that, you are ready to begin! \n" +"\n" + "Your information: \n" + "	Your user name:  " + useremail +"\n	Your password:   " + userpasswords + "\n\nPlease contact hello@gulory.com for any questions about technical support or sales.\n"
            + "\nThanks,\n" + "DataBumble Team\n" + "www.databumble.com" );   

            email.send();     
                
        } catch (EmailException e) {    
            e.printStackTrace();    
        }     
    }    

}
