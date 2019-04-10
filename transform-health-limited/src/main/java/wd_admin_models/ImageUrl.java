package wd_admin_models;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.UUID;

import javax.servlet.ServletException;

import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.tika.Tika;

import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ServingUrlOptions;
import com.google.appengine.api.utils.SystemProperty;
import com.google.appengine.tools.cloudstorage.GcsFileOptions;
import com.google.appengine.tools.cloudstorage.GcsFilename;
import com.google.appengine.tools.cloudstorage.GcsInputChannel;
import com.google.appengine.tools.cloudstorage.GcsOutputChannel;
import com.google.appengine.tools.cloudstorage.GcsService;
import com.google.appengine.tools.cloudstorage.GcsServiceFactory;
import com.google.appengine.tools.cloudstorage.RetryParams;

//import database.TestingDao;

public class ImageUrl {
	  private static final int BUFFER_SIZE = 2 * 1024 * 1024;
	  public GcsService gcsService = GcsServiceFactory.createGcsService(new RetryParams.Builder()
		      .initialRetryDelayMillis(10)
		      .retryMaxAttempts(10)
		      .totalRetryPeriodMillis(15000)
		      .build());
	
	public String uploadFromURL(String image, String bucket){
		String mimeType = null;
		String imageType = null;
		String imgname = null;
	      GetDate gd = new GetDate();
	      String uniqueNumbers = gd.uniqueNumbers();
		  byte[] value;
		try {
			//get byte stream from url
			value = recoverContentFromUrl(image);
		  
			//generate random name for image
			imgname = getAlphaNumeric();
		
			//get file type
              try {
            	  mimeType = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(value));
              } catch (IOException e) {
            	  mimeType = new Tika().detect(value);
              }
              if(null != mimeType && mimeType.contains("image")){
            	  //replace 'image/'jpg
            	  imageType = "."+mimeType.substring(6);
              }else{
      			//get byte stream from url
//      			value = recoverContentFromUrl(image);
      		    try {
              	  mimeType = URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(value));
             	  imageType = "."+mimeType.substring(6);
                } catch (IOException e) {
              	  mimeType = new Tika().detect(value);
                }
              }
		
  			//upload image
  			gcsService.createOrReplace(
	        new GcsFilename(bucket, uniqueNumbers+"_"+imgname+imageType),
	        new GcsFileOptions.Builder().acl("public-read").mimeType(mimeType).build(),
	        ByteBuffer.wrap(value));

		} catch (Exception e1) {
			e1.printStackTrace();
		}	
		//return url
		String url = "https://storage.googleapis.com/"+bucket+"/"+uniqueNumbers+"_"+imgname+imageType;
		return url;
	}
	public String uploadFromFile(FileItemStream item, InputStream stream, String bucket) throws ServletException, IOException, FileUploadException {
	     String sname = item.getName(); 
	     String url = null;
		    GetDate gd = new GetDate();
		    String uniqueNumbers = gd.uniqueNumbers();
		try {
      String sctype = item.getContentType();
      GcsFilename gcsfileName = new GcsFilename(bucket, uniqueNumbers+"_"+sname);
      GcsFileOptions options = new GcsFileOptions.Builder().acl("public-read").mimeType(sctype).build();
      GcsOutputChannel outputChannel;
      outputChannel = gcsService.createOrReplace(gcsfileName, options);
		copy(stream, Channels.newOutputStream(outputChannel));
			} catch (Exception e) {
				e.printStackTrace();
			} 
      stream.close();
      if(sname != null && !sname.isEmpty()){
      url = "https://storage.googleapis.com/"+bucket+"/"+uniqueNumbers+"_"+sname;
      }
      return url;
	}
	 private void copy(InputStream input, OutputStream output) throws IOException {
		    try {
		      byte[] buffer = new byte[BUFFER_SIZE];
		      int bytesRead = input.read(buffer);
		      while (bytesRead != -1) {
		        output.write(buffer, 0, bytesRead);
		        bytesRead = input.read(buffer);
		      }
		    } finally {
		      input.close();
		      output.close();
		    }
		  }
	
	  public String getAlphaNumeric() {
		    UUID uuid=UUID.randomUUID();
		    String str=uuid.toString().replace("-", "");
		    return str;
		  }
	  
	  //takes full image url from example: "https://storage.googleapis.com/"+bucket+"/"+imgname+imageType"
//	  and bucket: String bucketName = "test-10080.appspot.com/"+username+"/images/covers";
	public String getPlainImageURL(String image, String bucket){
		 if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
		int index = image.lastIndexOf("/");
		image = image.substring(index);
		ServingUrlOptions options = ServingUrlOptions.Builder
	            .withGoogleStorageFileName("/gs/" + bucket + image)
	            .secureUrl(true);
	   ImagesService imagesService = ImagesServiceFactory.getImagesService();
	   String url = imagesService.getServingUrl(options);
	   return url;
		 }else{
			 return image;
		 }
	}
	public String getBucket(){
		
//		username = username.toLowerCase();
//		
//		String bucket = null;
//		if(type.equals("cover")){
//			bucket = "ask-terence-mckenna-userdata/"+username+"/images/covers";
//		}
//		if(type.equals("profile")){
//			bucket = "ask-terence-mckenna-userdata/"+username+"/images/profiles";
//		}
//		if(type.equals("normal")){
//			bucket = "ask-terence-mckenna-userdata/postimages";
//		}
//		if(type.equals("quote")){
//			bucket = "ask-terence-mckenna-userdata/quoteimages";
//		}
//		if(type.equals("like") || type.equals("comment")){
//			bucket = "ask-terence-mckenna-userdata/"+username+"/images/profiles";
//		}
		return "laliberte-center.appspot.com/articles";
	}
	
	public String getURL(String image, int size){
		String bucket = "laliberte-center.appspot.com/articles";
		 if (SystemProperty.environment.value() ==
			     SystemProperty.Environment.Value.Production) {
		
		int index = image.lastIndexOf("/");
		image = image.substring(index);
//		TestingDao.testInfo(image);
//		TestingDao.testInfo(bucket);
		ServingUrlOptions options = ServingUrlOptions.Builder
	            .withGoogleStorageFileName("/gs/" + bucket + image)
	            .imageSize(size)
	            .crop(true)
	            .secureUrl(true);
	   ImagesService imagesService = ImagesServiceFactory.getImagesService();
	   String url = imagesService.getServingUrl(options);
	   return url;
	   
		 }else{
			 
			 return image;
		 }
	}
	public byte[] recoverContentFromUrl(String urlText) throws Exception {
	    URL url = new URL(urlText);
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    try (InputStream inputStream = url.openStream()) {
	        int n = 0;
	        byte [] buffer = new byte[ 1024 ];
	        while (-1 != (n = inputStream.read(buffer))) {
	            output.write(buffer, 0, n);
	        }
	    }
	    return output.toByteArray();
	}

}
