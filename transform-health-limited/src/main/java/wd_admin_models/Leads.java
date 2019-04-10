package wd_admin_models;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import wd_admin_database.LeadsDao;
import wd_admin_objects.LeadObject;



public class Leads {
	
	LeadsDao ldao = new LeadsDao();
	
	//get All leads
	public List<LeadObject> getAllLeads(){
		return ldao.getAllLeadsInDB();
	}
	//delete a lead
	public void deleteLead(int leadid){
		ldao.deleteLeadInDB(leadid);
	}
	//edit status for lead
	public void changeLeadStatus(int leadid, String status){
		ldao.changeLeadStatusInDB(leadid,status);
	}
	//insert lead
	public void newLead(String name, String email, String phone, String message, HttpServletRequest request, String url){
		
		String status = "new";
		//leads table
		Views v = new Views();
		int view_id = v.getViewIDBySessionIDAndURL(request, url);
		
		ldao.newLeadInDB(name,email,phone,message,GetDate.now(),status,view_id);
	}
	public int getLeadsSize() {
		return ldao.getLeadsSizeInDB();
	}
	public int getLeadsCountByCampaign(int campaign){
		return ldao.getLeadsCountByCampaign(campaign);
	}
	public int getLeadsCountByLanding(int landing){
		return ldao.getLeadsCountByLanding(landing);
	}
	public int getLeadsCountByLandingID(int landingid){
		return ldao.getLeadsCountByLandingIDInDB(landingid);
	}
	public int getLeadsCountByArticleID(int landingid){
		return ldao.getLeadsCountByArticleIDInDB(landingid);
	}
	public LeadObject getAllLeadInfoByID(int leadid) {
		return ldao.getAllLeadInfoByIDInDB(leadid);
	}
	public int leadIDByViewID(int viewid) {
		return ldao.leadIDByViewIDInDB(viewid);
	}
	public void deleteLeadByCampaign(int id) {
		 ldao.deleteLeadByCampaign(id);
	}
	public void deleteLeadByLanding(int landingid) {
		 ldao.deleteLeadByLanding(landingid);
	}
	public List<LeadObject> getAllLeadsByArticleID(int aid) {
		return ldao.getAllLeadsByArticleIDInDB(aid);
	}
	public void restoreLeadsByCampaignID(int campaignid) {
		ldao.restoreLeadsByCampaignIDInDB(campaignid);
	}
	public void restoreLeadsByLandingID(int id) {
		ldao.restoreLeadsByLandingIDInDB(id);
	}
	public void restoreLead(int id) {
		ldao.restoreLeadByID(id);
		//views
		int viewid = ldao.getViewIDByLeadID(id);
//		Views v = new Views();
//		v.restoreViewByID(viewid);
	}
	

}
