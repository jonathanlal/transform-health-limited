package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		JSONObject jsonObj      = new JSONObject();
//		JSONArray  arr = new JSONArray();

//		       for (int i=0 ; i<2 ; i++)
//		       {
//		    	   jsonObj = new JSONObject();
//		    	   jsonObj.put("value" , 1);
//		    	   jsonObj.put("string " , 1);
//		    	   jsonObj.put("value" , 2);
//		    	   jsonObj.put("string " , 2);
		          
		          
//		       }
//		       jsonObj.put("finalList", arr);//stackoverflow error
//		       jsonObj= new JSONObject();
//		       jsonObj.put("emp", 5);
//		       jsonObj.put("sal", 1000);

//		       jsonObj.put("dept",jsonObj); //stackoverflow error
//		       arr.put(jsonObj);
//		       response.setContentType("application/json");
//		        response.setCharacterEncoding("UTF-8");

//		        request.setAttribute("depRes",jsonObj);
//		String json = "{\r\n\"finalList\": [\r\n   {\r\n      \"value\" : 4,\r\n      \"string\": 4\r\n   },\r\n   {\r\n      \"value\" : 5,\r\n      \"string\": 5\r\n   }\r\n\r\n   ],\r\n\"dept\":{\r\n     \"emp\": 5,\r\n     \"sal\":1000\r\n   }\r\n}";
//		JSONObject obj = new JSONObject(json);    
//		JSONArray arr = obj.getJSONArray("finalList");
//		
//		HashMap<String, String> map = new HashMap<String, String>();
//		
//		
//		
//		for(int x = 0; x < arr.length();x++){
//			map.put(arr.getJSONObject(x).get("value").toString(), arr.getJSONObject(x).get("string").toString());
//		}
		
		
//		System.out.println("hello");
		
//		        request.setAttribute("test", map);
		        
		        RequestDispatcher dispatch= request.getRequestDispatcher("test2.jsp");
		        dispatch.forward(request, response);
	}
	 public static List<Object> getListFromJsonObject(JSONObject jObject) throws JSONException {
	      List<Object> returnList = new ArrayList<Object>();
	      Iterator<String> keys = jObject.keys();

	      List<String> keysList = new ArrayList<String>();
	      while (keys.hasNext()) {
	        keysList.add(keys.next());
	      }
	      Collections.sort(keysList);

	      for (String key : keysList) {
	        List<Object> nestedList = new ArrayList<Object>();
	        nestedList.add(key);
	        nestedList.add(convertJsonItem(jObject.get(key)));
	        returnList.add(nestedList);
	      }

	      return returnList;
	    }
	    public static List<Object> getListFromJsonArray(JSONArray jArray) throws JSONException {
	        List<Object> returnList = new ArrayList<Object>();
	        for (int i = 0; i < jArray.length(); i++) {
	          returnList.add(convertJsonItem(jArray.get(i)));
	        }
	        return returnList;
	      }

	  public static Object convertJsonItem(Object o) throws JSONException {
	      if (o == null) {
	        return "null";
	      }

	      if (o instanceof JSONObject) {
	        return getListFromJsonObject((JSONObject) o);
	      }

	      if (o instanceof JSONArray) {
	        return getListFromJsonArray((JSONArray) o);
	      }

	      if (o.equals(Boolean.FALSE) || (o instanceof String &&
	          ((String) o).equalsIgnoreCase("false"))) {
	        return false;
	      }

	      if (o.equals(Boolean.TRUE) || (o instanceof String && ((String) o).equalsIgnoreCase("true"))) {
	        return true;
	      }

	      if (o instanceof Number) {
	        return o;
	      }

	      return o.toString();
	    }



}
