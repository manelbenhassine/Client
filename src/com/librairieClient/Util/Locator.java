package com.librairieClient.Util;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Locator {
	static
	{
			 try {
				context=new InitialContext();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	static Map <String,Object>cache=new HashMap<String,Object>();
	static Context context;
	public static final String MODULE_NAME="gestionaireLibrairie";
	
	public static Object lookUp(String jndiName,Class remoteInterface)
	{
		if(!(cache.containsKey(jndiName)))
			
		{
			
			try {
				Object o = context.lookup(MODULE_NAME+"/"+jndiName+"!"+remoteInterface.getCanonicalName());
				cache.put(jndiName, o);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cache.get(jndiName);
	}
		
	}
	
		


