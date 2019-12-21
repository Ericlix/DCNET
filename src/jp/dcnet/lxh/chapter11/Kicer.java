package jp.dcnet.lxh.chapter11;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Kicer {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add(null);
		list.add("4");
		list.add("5");
		if (list != null) {
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String str = it.next();
				if (str != null) {
					System.out.println(str.toString());
				}
			}
		}



//
//		List<Integer> intList = new ArrayList<>();
////		List<String> nullList = null;
//		Iterator<Integer> intIt = intList.iterator();
//		intList.add(1);
//		intList.add(2);
//		intList.add(3);
//		intList.add(4);
//		intList.add(5);
//		while (intIt.hasNext()) {
//			System.out.println(intIt.next().toString());
//		}
//
////		for (String str : list) {
////			System.out.println(str);
////		}
//



		Map<Integer,String> map = new HashMap();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, null);
		map.put(null, "D");
		map.put(null, null);
//		System.out.println(map.size());
//		System.out.println(map);
//		for (Entry<Integer, String> en : map.entrySet()) {
//			System.out.print(en.getKey() + "=");
//			System.out.println(en.getValue());
//		}
		if (map != null) {
			Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
			while(it.hasNext()){
				Entry<Integer, String>  entry = it.next();
				Integer key = entry.getKey(); // Ex

				String value = entry.getValue();
				if (key != null && value != null) {
					System.out.println(key + "=" + value);
				}
			}
		}




		// ①
		List<Map<String, Kicer>> listMap = new ArrayList();

		// ②
		Map<String, List<Kicer>> mapList = new HashMap();






//
//
//
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "a");
//		map.put(2, "a");
//
//		System.out.println(map.containsKey(3));
//
////		map.remove(23);
//
//		System.out.println(map.get(null));
//
//		System.out.println("-----------------");
//
//		List<String> list = new ArrayList<String>();
//		list.add(null);
//		list.add("B");
//		list.add("A");
//		list.add("D");
//		list.add("E");
//		list.add("G");
//		list.add("F");
//		list.add("A");
//
//		//System.out.println(list.size());
//		//list.remove("A");
//		//list.clear();
//		//System.out.println(list.size());
//
//		System.out.println(list.contains("A"));// true
//		System.out.println(list.contains("AA")); // false
//
//		System.out.println(list.indexOf("A"));//
//		System.out.println(list.indexOf("AASDSADASD"));
//
//
//		System.out.println("-----------------");
//
//		if (!list.isEmpty()) {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//		}
//
//		System.out.println("-----------------");
//		Collections.sort(list);
//		for (String ls : list) {
//			System.out.println(ls);
//		}
//
//
//		for (int i = 0; i < list.size();i++) {
//
//		}
//
//
////		// TODO 自動生成されたメソッド・スタブ
////
////		String strA = new String("A");
////		String strB = new String("B");
////		String strC = new String("C");
////		String strD = new String("D");
////		String strE = new String("E");
////		String[] strarr = new String[]{strA,strB,strC,strD,strE};
//////		strarr[10] = "RRRR";
////
////		Kicer obj1 = new Kicer();
////		Kicer obj2 = new Kicer();
////		Kicer obj3 = new Kicer();
////		Kicer obj4 = new Kicer();
////		Kicer obj5 = new Kicer();
////		Kicer[] arr = new Kicer[]{obj1,obj2,obj3,obj4,obj5};
////
////
////		Anmail an = new Anmail("AN");
////		Dog dog1 = new Dog("snoopy");
////		Cat cat1 = new Cat("HelloKitty");
////
////		Anmail[] anarr = new Anmail[]{an,dog1,cat1};
////
////
////
////		Dog[]  dogArr = new  Dog[]{dog1};
	}

}
