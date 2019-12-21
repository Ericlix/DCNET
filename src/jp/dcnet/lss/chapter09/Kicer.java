package jp.dcnet.lss.chapter09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kicer {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(1, "d");
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey("a"));
//		System.out.println(map.indexOf(1));
//		System.out.println(map.indexOf("b"));
		System.out.println(map.get(3));
		
		
		
		
		
		
		
		
		
		System.out.println("----------------");
		
		
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i));
		}
//		list.remove("D");
//		list.clear();
		System.out.println(list.contains("B"));
		System.out.println(list.contains("AA"));
		System.out.println(list.indexOf("B"));
		System.out.println(list.indexOf("BCDF"));
		System.out.println(list.get(4));
		
		
		System.out.println("----------------");
		
		for (String Is:list){
			System.out.println(Is);
		}
		
		
		
		

	}

}
