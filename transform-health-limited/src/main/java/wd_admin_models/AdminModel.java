package wd_admin_models;

import java.util.List;

import wd_admin_database.AdminDao;
import wd_admin_objects.DashboardObject;
import wd_admin_objects.UserObject;

public class AdminModel {
	
	AdminDao adao = new AdminDao();

	public List<UserObject> getAllUsers() {
		return adao.getAllUsersInDB();
	}

	public DashboardObject getDashBoardInfo() {
//		return adao.getDashBoardInfoInDB();
		DashboardObject d = new DashboardObject();
		Leads l = new Leads();
		Articles a = new Articles();
		UserModel u = new UserModel();
		Views v = new Views();
		
		
		d.setLeads(l.getLeadsSize());
		d.setArticles(a.getArticlesSize());
		d.setUsers(u.getUsersSize());
		d.setViews(v.getViewsSize());
		
		return d;
	}
	
	//get all leads
		//delete a lead
	
	
	//get all users
		//approve user
		//delete user
	
	//get all articles
		//delete article
		//new article
		//edit article
	
	

}
