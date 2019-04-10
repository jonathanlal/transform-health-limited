package wd_admin_objects;

public class ArticleObject {
	
	int id;
	String url;
	String title;
	String body;
	String hide;
	String date;
	String author;
	String shareimage;
	String sharetext;
	String sharetitle;
	
	String headerimage;
	
	String deleted;
	String share;
	int readtime;
	
	int campaignid;
	String campaignname;
	String contact; //contact form null or checked
	
	boolean result; //check if url exists or not
	
	int views;
	int leads;
	
	String authorimage;
	int userid;
	
	String language;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getHide() {
		return hide;
	}
	public void setHide(String hide) {
		this.hide = hide;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCampaignid() {
		return campaignid;
	}
	public void setCampaignid(int campaignid) {
		this.campaignid = campaignid;
	}
	public String getCampaignname() {
		return campaignname;
	}
	public void setCampaignname(String campaignname) {
		this.campaignname = campaignname;
	}
	public String getShareimage() {
		return shareimage;
	}
	public void setShareimage(String shareimage) {
		this.shareimage = shareimage;
	}
	public String getSharetext() {
		return sharetext;
	}
	public void setSharetext(String sharetext) {
		this.sharetext = sharetext;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSharetitle() {
		return sharetitle;
	}
	public void setSharetitle(String sharetitle) {
		this.sharetitle = sharetitle;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public int getReadtime() {
		return readtime;
	}
	public void setReadtime(int readtime) {
		this.readtime = readtime;
	}
	public String getShare() {
		return share;
	}
	public void setShare(String share) {
		this.share = share;
	}
	public String getHeaderimage() {
		return headerimage;
	}
	public void setHeaderimage(String headerimage) {
		this.headerimage = headerimage;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLeads() {
		return leads;
	}
	public void setLeads(int leads) {
		this.leads = leads;
	}
	public String getAuthorimage() {
		return authorimage;
	}
	public void setAuthorimage(String authorimage) {
		this.authorimage = authorimage;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	

}
