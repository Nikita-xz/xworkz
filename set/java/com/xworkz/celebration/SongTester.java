package com.xworkz.celebration;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class SongTester {

	public static void main(String[] args) {
		Map<String, String>map=new TreeMap<String, String>((a,b)-> b.compareTo(a));
		map.put("Jai ho", "Vijay Prakash");
		map.put("Kabira", "Arijith singh");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy Agide", "All ok");
		
		Set<Entry<String, String>> entrySet =map.entrySet();
		entrySet.forEach(entry -> System.out.println("Song is : "+entry.getKey()+"Singer is:"+entry.getValue()));
		map.forEach((k,v)-> System.out.println(k+""+v));
		Properties properties=new Properties();
		properties.setProperty("name", "Email");
		properties.getProperty("name");
		
	
	}

}
