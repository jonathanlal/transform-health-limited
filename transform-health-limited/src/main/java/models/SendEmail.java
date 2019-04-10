package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import wd_admin_models.Globals;

public class SendEmail {
	
	String domain = "https://www.transformationpod.com";
	String brand = "Transform Health Limited";

	


//	CONTACT CONFIRMATION EMAIL 
	public void sendContactMailConfirmation(String name,String email, String msg) throws FileNotFoundException{
		
		String subject = "We have received your message and we will reply shortly!";
		
					//START EMAIL BODY			
					String htmlMessage = emailHead();
					//WHITE BOX
					htmlMessage += "<div style=\"background-color: white;display: inline-block;padding: 20px;text-align: center;margin-top: 20px;\">";
					//GREETING PART
					htmlMessage += "<h1 style=\"margin-top: 0px;color: #84A9E5;font-weight: bolder;text-align:center;font-size: 20px;\">Hello "+name+",</h1>";
					//NEW USER
					htmlMessage += "<h3 style=\"color:#55C5AE;font-weight: bolder;\">Thanks for contacting us. Here's a copy of the message you sent us:</h3>";
					//USER MSG COPY BOX
					htmlMessage += "<div style=\"background-color: #FAFAFA;display: inline-block;padding: 20px;max-width: 700px;\"><p style=\"font-size:16px;\">\"";
					htmlMessage += msg;
					htmlMessage += "\"</p></div><br>";
					//WRAP UP
					htmlMessage += "<p style=\"color:#999999;\">This is an automated email just to confirm that we got your message!</p>";
					htmlMessage += "<p style=\"color:#999999;\">Please do not reply to this email.</p><br>";
					htmlMessage += "<p style=\"color:#000000;\">Sincerely,</p>";
					htmlMessage += "<p style=\"color:#000000;\"><b>"+brand+"<b></p>";
					htmlMessage += "</div>";
					//END EMAIL BODY
					htmlMessage += emailFoot();
					
			//SEND MAIL
			send(email,htmlMessage,subject);
	}
//	CONTACT ADMIN EMAIL 
	public void sendAdminContactLeadMail(String name,String email, String phone, String msg, String toemail, String adminname) throws FileNotFoundException{
		//START EMAIL BODY			
		String htmlMessage = emailHead();
		//WHITE BOX
		htmlMessage += "<div style=\"background-color: white;display: inline-block;padding: 20px;text-align: center;margin-top: 20px;\">";
		//GREETING PART
		htmlMessage += "<h1 style=\"margin-top: 0px;color: #84A9E5;font-weight: bolder;text-align:center;font-size: 20px;\">Hello "+adminname+",</h1>";
		//NEW USER
		htmlMessage += "<h3 style=\"color:#55C5AE;font-weight: bolder;\">"+name+" sent us a message:</h3>";
		//USER MSG COPY BOX
		htmlMessage += "<div style=\"background-color: #FAFAFA;display: inline-block;padding: 20px;max-width: 700px;\"><p style=\"font-size:16px;\">\"";
		htmlMessage += msg;
		htmlMessage += "\"</p></div><br>";
		//WRAP UP
		htmlMessage += "<p style=\"color:#999999;margin-bottom:0 !important;\">Their phone number is "+phone+"</p>";
		htmlMessage += "<p style=\"color:#999999;margin-top:0 !important;\">And their contact email is: "+email+"</p>";
		htmlMessage += "<p style=\"color:#999999;\">This is an automated email, please do not reply to this email!</p>";
		htmlMessage += "</div>";
		//END EMAIL BODY
		htmlMessage += emailFoot();
		
		//SEND MAIL
		send(toemail,htmlMessage,"Message from "+name);
	}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String emailHead(){
		//START EMAIL BODY			
		String htmlMessage = "<html>";
			//GREY BOX
		htmlMessage +="<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"20\"><tr><td>";
		htmlMessage += "<div style=\"background-color: #FAFAFA;display: block;padding: 20px;text-align: center;\">";
		//TITLE PART
		htmlMessage += "<div style=\"text-align: center;margin-top: 0px;\">";
		htmlMessage += "<a href=\""+domain+"\" style=\"text-decoration:none;\">";
		htmlMessage += "<img style=\"vertical-align:middle;max-width:140px;\" alt=\""+brand+"\" src=\"cid:email-logo-v2.png\">";
		htmlMessage += "</a>";
		htmlMessage += "</div>";
		return htmlMessage;
	}
	
	
	public String emailFoot(){
		//END OF GREY BOX
		String htmlMessage = "<br><div style=\"text-align:center;\"><br>";
		
		//FACEBOOK
		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://www.facebook.com/#/\"> ";
		htmlMessage += "<img alt=\"Facebook\" src=\"cid:facebook-32.png\">";
		htmlMessage += "</a>";
		
		//GOOGLE+
//		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://plus.google.com/u/1/103143034164273089135/\"> ";
//		htmlMessage += "<img alt=\"Google\" src=\"cid:google-32.png\">";
//		htmlMessage += "</a>";
		//TWITTER
		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://twitter.com/#/\"> ";
		htmlMessage += "<img alt=\"Twitter\" src=\"cid:twitter-32.png\">";
		htmlMessage += "</a>";
		//INSTAGRAM
//		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://www.instagram.com/thewebsitedevil/\"> ";
//		htmlMessage += "<img alt=\"Instagram\" src=\"cid:instagram-32.png\">";
//		htmlMessage += "</a>";
		//PINTEREST
//		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://www.pinterest.co.uk/thewebsitedevil/\"> ";
//		htmlMessage += "<img alt=\"Pinterest\" src=\"cid:pinterest-32.png\">";
//		htmlMessage += "</a>";
		//LINKEDIN
		htmlMessage += "<a style=\"text-decoration:none;\" href=\"https://www.linkedin.com/company/#/\"> ";
		htmlMessage += "<img alt=\"Linkedin\" src=\"cid:link-32.png\">";
		htmlMessage += "</a>";
		
		htmlMessage += "<br>";
		 htmlMessage += "<a style=\"text-decoration:none;font-size:22px;weight:700;color:#1071b1;\" href=\""+domain+"\">";
		 htmlMessage += "www.transformationpod.com";
		 htmlMessage += "</a>";
		 htmlMessage += "<p style=\"font-size:16;font-weight:bold;color:#58595b;margin-top:0;text-decoration:none;\">team@transformationpod.com</p>";
		 htmlMessage += "</div>";
		//END EMAIL BODY
			//END OF WHITE BOX
			htmlMessage += " </div>";
			//END OF GREY BOX
			htmlMessage += "</div>";
			htmlMessage +="</td></tr></table>";

		htmlMessage += "</html>";
		return htmlMessage;
	}
	


	public void sendAdminContactLead(String name, String email, String phone, String msg) throws FileNotFoundException {
		
		Map<String,String> admins = getAdminEmails();
		for(Entry<?, ?> e: admins.entrySet()){
		    String adminName = (String) e.getKey();
		    String adminEmail = (String) e.getValue();
			sendAdminContactLeadMail(name, email, phone, msg, adminEmail, adminName);
		}
	}

	public Map<String, String> getAdminEmails(){
		//UserData ud = new UserData();
		//return ud.getAdminEmails();
	     Map<String, String> admins = new HashMap<>();
	     admins.put("Jonathan", "jonathan@thewebdevil.com");
	     admins.put("Team", "team@transformationpod.com");
	     admins.put("Team", "lyrellconsulting@gmail.com");
	     
		return admins;
	}
	
	  public static ClientResponse send(String useremail,String htmlBody,String subject) {
		   Client client = Client.create();
		   client.addFilter(new HTTPBasicAuthFilter("api",Globals.MAILGUN_API_KEY));
		   WebResource webResource = client.resource(Globals.MAILGUN_BASE_URL);
		   FormDataMultiPart form = new FormDataMultiPart();
		   form.field("from", Globals.MAILGUN_FROM+" <postmaster@" + Globals.MAILGUN_MAIL_DOMAIN + ">");
		   form.field("to", useremail);
		   form.field("subject", subject);
		   form.field("html", htmlBody);
		   File logo = new File("img/email-logo-v2.png");
		   form.bodyPart(new FileDataBodyPart("inline",logo,MediaType.APPLICATION_OCTET_STREAM_TYPE));
		   
		   File shareFacebook = new File("img/facebook-32.png");
//		   File shareGoogle = new File("img/google-32.png");
		   File shareTwitter = new File("img/twitter-32.png");
//		   File sharePinterest = new File("img/pinterest-32.png");
//		   File shareInstagram = new File("img/instagram-32.png");
		   File shareLinkedIn = new File("img/link-32.png");
		   form.bodyPart(new FileDataBodyPart("inline",shareFacebook,MediaType.APPLICATION_OCTET_STREAM_TYPE));
//		   form.bodyPart(new FileDataBodyPart("inline",shareGoogle,MediaType.APPLICATION_OCTET_STREAM_TYPE));
		   form.bodyPart(new FileDataBodyPart("inline",shareTwitter,MediaType.APPLICATION_OCTET_STREAM_TYPE));
//		   form.bodyPart(new FileDataBodyPart("inline",sharePinterest,MediaType.APPLICATION_OCTET_STREAM_TYPE));
//		   form.bodyPart(new FileDataBodyPart("inline",shareInstagram,MediaType.APPLICATION_OCTET_STREAM_TYPE));
		   form.bodyPart(new FileDataBodyPart("inline",shareLinkedIn,MediaType.APPLICATION_OCTET_STREAM_TYPE));
		   
		   return webResource.type(MediaType.MULTIPART_FORM_DATA_TYPE).post(ClientResponse.class, form);
		}
	
	
	
	
	
	
	
	
	
	
	
		public void verifyRegisteredUser(String fullname, String useremail, String encryptedCode, String adminname, String adminemail) {
			String subject = "New User Has Registered. Please Verify!";
			String htmlMessage = emailHead();
			//WHITE BOX
			htmlMessage += "<div style=\"background-color: white;display: inline-block;padding: 20px;text-align: center;margin-top: 10px;\">";
			//GREETING PART
			htmlMessage += "<h1 style=\"margin-top: 0px;color: #84A9E5;font-weight: bolder;text-align:center;font-size: 20px;\">Hello "+adminname+",</h1>";
			//NEW USER
			htmlMessage += "<h3 style=\"color:#55C5AE;font-weight: bolder;\">A new user has registered through the website. </h3>";
			//USER MSG COPY BOX
			htmlMessage += "<div style=\"background-color: #FAFAFA;display: inline-block;padding: 20px;max-width: 700px;\">";
			htmlMessage += "<p style=\"font-size:16px;margin-bottom:0;\"><span style=\"color: black !important\">Full Name: </span><b>"+fullname+"</b></p>";
			htmlMessage += "<p style=\"font-size:16px;margin-top:0;\"><span style=\"color: black !important\">Email Address: </span><b>"+useremail+"</b></p>";
			htmlMessage += "<h4>Do you want to approve this account?</h4>";
			//APPROVE BUTTON
			htmlMessage += "<div style=\"display:inline;margin-right:5px;\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.transformationpod.com/verifyuser?approve=yes&c="+encryptedCode+"\" style=\"height:40px;v-text-anchor:middle;width:200px;\" arcsize=\"10%\" stroke=\"f\" fillcolor=\"#5cb85c\"><w:anchorlock/><center><![endif]--><a href=\"https://www.transformationpod.com/verifyuser?approve=yes&c="+encryptedCode+"\" style=\"background-color:#5cb85c;border-radius:4px;color:#ffffff;display:inline-block;font-family:sans-serif;font-size:13px;font-weight:bold;line-height:40px;text-align:center;text-decoration:none;width:200px;-webkit-text-size-adjust:none;\">Approve</a><!--[if mso]></center></v:roundrect><![endif]--></div>";
			//REJECT BUTTON
			htmlMessage += "<div style=\"display:inline;margin-left:5px;\"><!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.transformationpod.com/verifyuser?approve=no&c="+encryptedCode+"\" style=\"height:40px;v-text-anchor:middle;width:200px;\" arcsize=\"10%\" stroke=\"f\" fillcolor=\"#d9534f\"><w:anchorlock/><center><![endif]--><a href=\"https://www.transformationpod.com/verifyuser?approve=no&c="+encryptedCode+"\" style=\"background-color:#d9534f;border-radius:4px;color:#ffffff;display:inline-block;font-family:sans-serif;font-size:13px;font-weight:bold;line-height:40px;text-align:center;text-decoration:none;width:200px;-webkit-text-size-adjust:none;\">Reject</a><!--[if mso]></center></v:roundrect><![endif]--></div>";
			//END USER MSG COPY BOX
			htmlMessage +=  "<br></div><br>";
			//WRAP UP
			htmlMessage += "<p style=\"color:#999999;\">This is an automated email, please do not reply to this email!</p>";
			htmlMessage += "</div>";
			//END EMAIL BODY
			htmlMessage += emailFoot();
			
			//SEND MAIL
			send(adminemail,htmlMessage,subject);
		}
	
	
	
	


	public void newUser(String useremail, String subject) {
		
		String htmlMessage = emailHead();
			//WHITE BOX
		htmlMessage += "<br><div style=\"background-color: white;display: block;padding: 10px;\">";
		//GREETING PART
		htmlMessage += "<h2 style=\"margin-top: 0px;color: #55C5AE;font-weight: bolder;font-family: Arial, Georgia, Serif\">"+subject+"</h2>";
		htmlMessage += "<p style=\"font-style: italic;color: graytext;font-size: 16px;font-family: Arial, Georgia, Serif\"><a href=\"https://www.thelalibertecenter.com/admin/\" target=\"_blank\">"+"ADMIN PORTAL"+"</a></p>";
		htmlMessage += "<hr>";
		//END OF WHITE BOX
		htmlMessage += " </div>";
		htmlMessage += emailFoot();
		send(useremail,htmlMessage,subject);
	}


	public void forgotPassword(int userid, int forgotid, String code, String email, String subject) {
		String htmlMessage = emailHead();
		//WHITE BOX
	htmlMessage += "<br><div style=\"background-color: white;display: block;padding: 10px;text-align: center;\">";
	//GREETING PART
//	htmlMessage += "<h1 style=\"margin-top: 0px;color: #55C5AE;font-weight: bolder;font-family: Arial, Georgia, Serif\">"+user+",</h1>";
	if(subject.contains("forgot")){
	htmlMessage += "<p style=\"font-style: italic;color: graytext;font-size: 20px;font-family: Arial, Georgia, Serif\">Did you forget your password?</p>";
	}
	htmlMessage += "<p style=\"font-style: italic;color: graytext;font-size: 20px;font-family: Arial, Georgia, Serif\">Click on the link below to change your password:</p>";
	//CONFIRMATION LINK
	htmlMessage += "<br><div style=\"text-align: center;padding-bottom:20px;\">";
	htmlMessage += "<a href=\"https://www.thelalibertecenter.com/ForgotPassword?code="+code+"&amp;id="+forgotid+"&amp;uid="+userid+"\" style=\"color:white;text-decoration:none;letter-spacing:1px;font-size: 20px;background-color:#10ADE4;padding:10px;border-radius:25px;font-family: Arial, Georgia, Serif\">";
	htmlMessage += "Verify Email</a>";
	htmlMessage += "</div>";
	htmlMessage += "<hr>";
	htmlMessage += "<span style=\"color: #7F58AF;font-weight: lighter;font-size: 15px;font-family: Arial, Georgia, Serif\">";
	htmlMessage += "If the button above does not work, click on the link below or copy and paste the url into your browser:";
	htmlMessage += "</span>";
	htmlMessage += " <p style=\"color: #7F58AF;font-weight: lighter;font-size: 10px;font-family: Arial, Georgia, Serif\">https://www.thelalibertecenter.com/ForgotPassword?code="+code+"&amp;id="+forgotid+"&amp;uid="+userid+"</p>";
	//END OF WHITE BOX
	htmlMessage += " </div>";
	htmlMessage += emailFoot();
	send(email,htmlMessage,subject);
	}
//	public void sendOld(String useremail, String htmlBody,Map<String, String> mapInlineImages,String subject) throws MalformedURLException{
//	    Properties props = new Properties();
//	    Session session = Session.getDefaultInstance(props, null);
//	    String msgBody = "...";
//	    try {
//	      Message msg = new MimeMessage(session);
//	      msg.setFrom(new InternetAddress("lalibertecenter.mail@gmail.com", "The Laliberte Center"));
//	      msg.addRecipient(Message.RecipientType.TO,new InternetAddress(useremail, "Admin"));
//	      msg.setSubject(subject);
//	      msg.setText(msgBody);
//	    MimeBodyPart messageBodyPart = new MimeBodyPart();
//	    messageBodyPart.setContent(htmlBody, "text/html");
//	    Multipart multipart = new MimeMultipart("related");
//	    multipart.addBodyPart(messageBodyPart);
//	    if (mapInlineImages != null && mapInlineImages.size() > 0) {
//	        Set<String> setImageID = mapInlineImages.keySet();
//	        for (String contentId : setImageID) {
//	            MimeBodyPart imagePart = new MimeBodyPart();
//	            imagePart.setHeader("Content-ID", "<" + contentId + ">");
//	            imagePart.setDisposition(MimeBodyPart.INLINE);
//	            String imageFilePath = mapInlineImages.get(contentId);
//	            try {imagePart.attachFile(imageFilePath);
//	            } catch (IOException ex) {ex.printStackTrace();
//	            }multipart.addBodyPart(imagePart);}}
//	    msg.setContent(multipart);
//	    Transport.send(msg);
//	    } catch (AddressException e) {} 
//	    catch (MessagingException e) {} 
//	    catch (UnsupportedEncodingException e) {}
//	}

	public void sendAdminNewUserRegistrationVerification(String fullname, String useremail, String code) throws FileNotFoundException {
		
		Map<String,String> admins = getAdminEmails();
		for(Entry<?, ?> e: admins.entrySet()){
		    String adminName = (String) e.getKey();
		    String adminEmail = (String) e.getValue();
		    verifyRegisteredUser(fullname, useremail, code, adminName, adminEmail);
		}
	}
	public void confirmReceivedRegistration(String fullname, String useremail) {
		
		String subject = "Registration received, please wait for approval.";
		
					//START EMAIL BODY			
					String htmlMessage = emailHead();
					//WHITE BOX
					htmlMessage += "<div style=\"background-color: white;display: inline-block;padding: 20px;text-align: center;margin-top:10px;\">";
					//GREETING PART
					htmlMessage += "<h1 style=\"margin-top: 0px;color: #84A9E5;font-weight: bolder;text-align:center;font-size: 20px;\">Hello "+fullname+",</h1>";
			
					//USER MSG COPY BOX
					htmlMessage += "<div style=\"background-color: #FAFAFA;display: inline-block;padding: 20px;max-width: 700px;\">";
					htmlMessage += "<p style=\"color:#55C5AE;font-weight: bolder;font-size:18px !important;\">Thanks for registering! <br>Your account isn't active yet, an admin still needs to verify it.<br> You will receive an email once verified. </p>";
					htmlMessage += "</div><br>";
					//WRAP UP
					htmlMessage += "<p style=\"color:#999999;\">This is an automated email just to confirm that we received your registration!</p>";
					htmlMessage += "<p style=\"color:#999999;\">Please do not reply to this email.</p><br>";
					htmlMessage += "<p style=\"color:#000000;\">Sincerely,</p>";
					htmlMessage += "<p style=\"color:#000000;\"><b>Transform Health Limited<b></p>";
					htmlMessage += "</div>";
					//END EMAIL BODY
					htmlMessage += emailFoot();
					
			//SEND MAIL
			send(useremail,htmlMessage,subject);
	}
	public void confirmCompletedRegistration(String fullname, String useremail, String status) {
		
		String subject = "";
		if(status.equals("approved")){
			subject = "Registration complete!";
		}else{
			subject = "Registration rejected.";
		}
		

		
					//START EMAIL BODY			
					String htmlMessage = emailHead();
					//WHITE BOX
					htmlMessage += "<div style=\"background-color: white;display: inline-block;padding: 20px;text-align: center;margin-top:10px;\">";
					//GREETING PART
					htmlMessage += "<h1 style=\"margin-top: 0px;color: #84A9E5;font-weight: bolder;text-align:center;font-size: 20px;\">Hello "+fullname+",</h1>";
			
					//USER MSG COPY BOX
					htmlMessage += "<div style=\"background-color: #FAFAFA;display: inline-block;padding: 20px;max-width: 700px;\">";
					
					
					if(status.equals("approved")){
					htmlMessage += "<p style=\"color:#55C5AE;font-weight: bolder;font-size:18px !important;\">Registration complete! <br>Your account has been approved by an admin and is now active! <br>You can now <a href=\"https://www.transformationpod.com/wd-admin/login/\">login</a>. </p>";
					}else{
					htmlMessage += "<p style=\"color:#55C5AE;font-weight: bolder;font-size:18px !important;\">Registration rejected. <br>Your account was not approved. Please contact us for more information: <br> team@transformationpod.com </p>";
					}
					
					
					htmlMessage += "</div><br>";
					//WRAP UP
					htmlMessage += "<p style=\"color:#999999;\">This is an automated email about your registration status!</p>";
					htmlMessage += "<p style=\"color:#999999;\">Please do not reply to this email.</p><br>";
					htmlMessage += "<p style=\"color:#000000;\">Sincerely,</p>";
					htmlMessage += "<p style=\"color:#000000;\"><b>Transform Health Limited<b></p>";
					htmlMessage += "</div>";
					//END EMAIL BODY
					htmlMessage += emailFoot();
					
			//SEND MAIL
			send(useremail,htmlMessage,subject);
	}
}
