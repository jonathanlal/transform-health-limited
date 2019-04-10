package wd_admin_models;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import wd_admin_database.SecretCodesDao;

public class SecretCodes {
	
	SecretCodesDao scdao = new SecretCodesDao();

	
	
	
	
	
	public void newCode(String code, String key) {
		scdao.newCodeInDB(code, key);
	}

	public String getKeyByCode(String code) {
		return scdao.getKeyByCodeInDB(code);
	}
	
	
	
	
	 public SecretKey generateSecretKey() {
		   SecretKey secretKey = null;
			try {
			   KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		       keyGenerator.init(128); // block size is 128bits
		       secretKey = keyGenerator.generateKey();
			} catch (Exception e) {
				e.printStackTrace();
			}
		   	return secretKey;
	   }
	
	
	   public String encrypt(String plainText, SecretKey key) {
		      String encryptedText = "";
			   try {

			        
			   byte[] plainTextByte = plainText.getBytes();
			   
			   Cipher cipher = Cipher.getInstance("AES");
			   cipher.init(Cipher.ENCRYPT_MODE, key);
				
		       byte[] encryptedByte = cipher.doFinal(plainTextByte);
		       
			   Base64.Encoder encoder = Base64.getUrlEncoder();
		       encryptedText = encoder.encodeToString(encryptedByte);
		       
		   	} catch (Exception e) {
				e.printStackTrace();
		   	}
				return encryptedText;
		   }

		   public String decrypt(String encryptedText, String encodedkey) {
			   String decryptedText = "";
			   try {
			   Base64.Decoder decoder = Base64.getUrlDecoder(); //base64 decoder
			       
			   byte[] decodedKey = decoder.decode(encodedkey); //decode the encodedkey
			   SecretKey secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");  // rebuild key using SecretKeySpec

		       byte[] encryptedTextByte = decoder.decode(encryptedText);//decode the encryptedText (aka code)
		       
		       Cipher cipher = Cipher.getInstance("AES"); 
		       cipher.init(Cipher.DECRYPT_MODE, secretKey);
		       
		       byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
		       decryptedText = new String(decryptedByte);
		       
			   	} catch (Exception e) {
					e.printStackTrace();
			   	}
		       return decryptedText;
		   }

		public void deleteCode(String code) {
			scdao.deleteCodeInDB(code);
		}

}
