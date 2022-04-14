package com.zensar.olx.db;

import java.util.HashMap;
import java.util.Map;

public class TokenStorage {

	private static Map<String, String> tokenCache;
	
	static {
		tokenCache =new HashMap<>();
	}
	
	private static Map<String, String> getCache()
	{
		return tokenCache;
	}
	
	//this method is responsible for storing token in cache on server 
	//both token_key and token-value is token itself 
	
	public static void storeToken(String key,String token)
	{
		tokenCache.put(key, token);
	}
	
	//this method is responsible for remove token fron server cache 
	
	public static String removeToken(String key) {
		return tokenCache.remove(key);
	}
	
	//this method is responsible for getting from cache
	//this is written to check if token is present in cache or not 
	
	public static String getToken(String key) {
		
		return tokenCache.get(key);
	}
}
