package com.sujata.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<String,List<String>> map=new HashMap<String, List<String>>();
	
	public void addNewVertex(String str) {
		map.put(str, new LinkedList<String>());
	}
	
	public void addNewEdge(String source,String destination,boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		
		map.get(source).add(destination);
		if(bidirectional==true) {
			map.get(destination).add(source);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(String vertext:map.keySet()) {
			builder.append(vertext.toString()+" : ");
			for(String connectedVertext:map.get(vertext)) {
				builder.append(connectedVertext.toString()+"  ");
			}
			builder.append("\n");
		}
		return (builder.toString());
	}
	
	
}
