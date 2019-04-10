package wd_admin_models;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import wd_admin_database.PageViewsDao;



public class PageViews {
	
	PageViewsDao pvdao = new PageViewsDao();

	public int getTotalViews(){
		return pvdao.getTotalViewsInDB();
	}
	public int getPageViews(String url){
		return pvdao.getPageCountByUrl(url);
	}
	
	public int getPageCountByUrl(String url){
		int pageCount = 0;
		//check if page exists
		boolean pageExists = checkIfPageExists(url);
		//if exists update else insert and update
		if(pageExists){
			pageCount = pvdao.getPageCountByUrl(url);
		}else{
			pvdao.newPage(url);
		}
		return pageCount;
	}
	public boolean checkIfPageExists(String url){
		return pvdao.checkIfPageExistsInDB(url);
	}
	//page view counter
	public void recordVisit(String url,HttpServletRequest request){
		String agent = request.getHeader("User-Agent");
		String pattern = "(googlebot|bot|Googlebot-Mobile|Googlebot-Image|Google favicon|Mediapartners-Google|bingbot|slurp|java|wget|curl|Commons-HttpClient|Python-urllib|libwww|httpunit|nutch|phpcrawl|msnbot|jyxobot|FAST-WebCrawler|FAST Enterprise Crawler|biglotron|teoma|convera|seekbot|gigablast|exabot|ngbot|ia_archiver|GingerCrawler|webmon |httrack|webcrawler|grub.org|UsineNouvelleCrawler|antibot|netresearchserver|speedy|fluffy|bibnum.bnf|findlink|msrbot|panscient|yacybot|AISearchBot|IOI|ips-agent|tagoobot|MJ12bot|dotbot|woriobot|yanga|buzzbot|mlbot|yandexbot|purebot|Linguee Bot|Voyager|CyberPatrol|voilabot|baiduspider|citeseerxbot|spbot|twengabot|postrank|turnitinbot|scribdbot|page2rss|sitebot|linkdex|Adidxbot|blekkobot|ezooms|dotbot|Mail.RU_Bot|discobot|heritrix|findthatfile|europarchive.org|NerdByNature.Bot|sistrix crawler|ahrefsbot|Aboundex|domaincrawler|wbsearchbot|summify|ccbot|edisterbot|seznambot|ec2linkfinder|gslfbot|aihitbot|intelium_bot|facebookexternalhit|yeti|RetrevoPageAnalyzer|lb-spider|sogou|lssbot|careerbot|wotbox|wocbot|ichiro|DuckDuckBot|lssrocketcrawler|drupact|webcompanycrawler|acoonbot|openindexspider|gnam gnam spider|web-archive-net.com.bot|backlinkcrawler|coccoc|integromedb|content crawler spider|toplistbot|seokicks-robot|it2media-domain-crawler|ip-web-crawler.com|siteexplorer.info|elisabot|proximic|changedetection|blexbot|arabot|WeSEE:Search|niki-bot|CrystalSemanticsBot|rogerbot|360Spider|psbot|InterfaxScanBot|Lipperhey SEO Service|CC Metadata Scaper|g00g1e.net|GrapeshotCrawler|urlappendbot|brainobot|fr-crawler|binlar|SimpleCrawler|Livelapbot|Twitterbot|cXensebot|smtbot|bnf.fr_bot|A6-Indexer|ADmantX|Facebot|Twitterbot|OrangeBot|memorybot|AdvBot|MegaIndex|SemanticScholarBot|ltx71|nerdybot|xovibot|BUbiNG|Qwantify|archive.org_bot|Applebot|TweetmemeBot|crawler4j|findxbot|SemrushBot|yoozBot|lipperhey|y!j-asr|Domain Re-Animator Bot|AddThis)";
		 // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);
	      // Now create matcher object.
	      Matcher m = r.matcher(agent);
	      if (!m.find()){

	  		int count = getPageCountByUrl(url);
			
			//+1 to count
			count += 1;
			
			//update count
			updatePageCountByURL(url, count);
			
			//record single view
//			LoginTimes lt = new LoginTimes();
			Views v = new Views();
			v.newView(url,request);
	      }
		
		
	}
	public void updatePageCountByURL(String url, int count){
		pvdao.updatePageCountByURL(url, count);
	}

	
	
	
	
	//get page id by url
//	public int getPageId(String url){
//		return pvdao.getPageIdByUrlInDB(url);
//	}
	
	//get page view count by url
//	public int getCountByPageID(int pageid){
//		return pvdao.getCountByPageIDInDB(pageid);
//	}
	
}
