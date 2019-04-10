package wd_admin_models;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

import wd_admin_database.ArticlesDao;
import wd_admin_objects.ArticleObject;


public class Articles {

	ArticlesDao adao = new ArticlesDao();
	
	public int getArticlesSize() {
		return adao.getArticlesSizeInDB();
	}

	public List<ArticleObject> getArticles() {
		return adao.getArticlesInDB();
	}

//	public int newArticle(String title, int uid) throws UnsupportedEncodingException {
//		GetDate gd = new GetDate();
//		String date = gd.now();
//		UserData ud = new UserData();
//		String author = ud.getFullName(uid); 
//		String authorimage = ud.getProfileImg(uid);
//		int aid = adao.newArticleInDB(title,date,uid,author,authorimage);
//			String url = adao.createArticleUrl(title, aid);
//				adao.changeArticleUrlInDB(url, aid);
//		return aid;
//	}

	public ArticleObject getAllArticleInfoByID(int aid) throws UnsupportedEncodingException, ParseException {
		return adao.getAllArticleInfoByID(aid);
	}

	public void changeArticleTitle(String title, int aid) {
		adao.changeArticleTitleInDB(title,aid);
	}
	public void changeArticleBody(String body, int aid) {
		adao.changeArticleBodyInDB(body,aid);
	}

	public void changeArticleHide(String status, int aid) {
		adao.changeArticleHideInDB(status,aid);
	}
	public ArticleObject checkIfUrlExists(String input, int aid) throws UnsupportedEncodingException{
		ArticleObject article = new ArticleObject();
		String newUrl = adao.createArticleUrlFromText(input);
		article.setUrl(newUrl);
		boolean check = adao.checkIfUrlExists(newUrl, aid);
		article.setResult(check);
		return article;
	}

	public void changeArticleUrl(String url, int aid) {
		adao.changeArticleUrlInDB(url,aid);
	}

	public void changeArticleAuthor(String author, int aid) {
		adao.changeArticleAuthor(author,aid);
	}

	public void changeArticleCampaign(int cid, int aid) {
		adao.changeArticleCampaign(cid,aid);
	}
	public void changeArticleContact(String contact, int aid){
		adao.changeArticleContact(contact, aid);
	}

	public void changeArticleShareDescription(String description, int aid) {
		adao.changeArticleShareDescription(description, aid);
	}
	public void changeArticleShareTitle(String title, int aid) {
		adao.changeArticleShareTitle(title, aid);
	}
	public void changeArticleShareImage(String url, int aid){
		adao.changeArticleShareImage(url, aid);
	}
	public void deleteArticle(String deleted, int aid){
		adao.deleteArticle(deleted, aid);
	}

	public ArticleObject getAllArticleInfoByUrl(String url) throws UnsupportedEncodingException, ParseException {
		return adao.getAllArticleInfoByUrl(url);
	}

	public void changeArticleHeaderImage(String image, int aid) {
		adao.changeArticleHeaderImage(image,aid);
	}

	public List<ArticleObject> getArticlesByCampaignID(int campaignid) {
		return adao.getArticlesByCampaignIDInDB(campaignid);
	}

	public String getArtitleTitleByID(int articleid) {
		return adao.getArticleTitleByIDInDB(articleid);
	}

	public void removeArticleFromCampaign(int campaignid) {
		adao.removeArticleFromCampaignInDB(campaignid);
	}

	public void changeArticleAuthorImage(String image, int aid) {
		adao.changeArticleAuthorImageInDB(image,aid);
	}

	public void changeArticleLanguage(String language, int aid) {
		adao.changeArticleLanguageInDB(language,aid);
	}
}
