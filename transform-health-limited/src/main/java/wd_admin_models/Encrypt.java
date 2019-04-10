package wd_admin_models;

import org.jasypt.util.password.StrongPasswordEncryptor;

import wd_admin_database.UserDao;


public class Encrypt {
	
	UserDao udao = new UserDao();
	public boolean validate(String user_email, String inputPassword){
		StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
		//get password based on username(or email) and inputpass from form
		String encryptedpass = udao.getPass(user_email);
		//use jasypt to check if correct pass by matching encrypted value with inputpass
		return passwordEncryptor.checkPassword(inputPassword, encryptedpass);
	}
	
	

}