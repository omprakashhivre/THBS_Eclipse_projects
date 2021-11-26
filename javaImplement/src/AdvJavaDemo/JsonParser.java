package AdvJavaDemo;


import java.util.Iterator;

import org.json.*;

public class JsonParser {

	public static void parse(JSONObject jobj, String key) throws JSONException {
		//System.out.println("key is : "+jobj.has(key));
		
		System.out.println("key : value   ---->  "+key+" : "+jobj.get(key));
	}
	public static void main(String[] args) throws JSONException {
		
		String input = " {name:\"John\", age:31, city:\"New York\"};";		
		JSONObject jobj =  new JSONObject(input);
		
		Iterator<?> itr = jobj.keys();
		while(itr.hasNext())
			getKey(jobj, (String) itr.next());
	}
	
	
	public static void getKey(JSONObject jobj, String key) throws JSONException {
		boolean exist = jobj.has(key);
		if(!exist) {
			
		}
		else {
			parse(jobj, key);
		}
	}
	
}
