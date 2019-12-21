package jp.dcnet.lss.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Kicer_map {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(11111, "A");
		map.put(122, "B");
		map.put(null, "C");
		map.put(4, "null");
		map.put(5, "E");
		
//		System.out.println(map.size());
//		System.out.println(map);
//		
//		for (java.util.Map.Entry<Integer, String> en : map.entrySet()) {
//			System.out.println(en.getKey() + "=");
//			System.out.println(en.getValue());
//			
//		}
		if (map != null) {//判断文本是否null
			Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();//叠代器，速度快,指标指向下一位

			while (it.hasNext()) {  //判断下一位是否有东西
				
				
				Entry<Integer, String> entry = it.next();
				Integer key = entry.getKey();
				String value = entry.getValue();
				if (key != null && value != "null") {  //判断下一位是否null
					System.out.println(key + "=" + value);

				}
			}
		}
		
		






	}

}
