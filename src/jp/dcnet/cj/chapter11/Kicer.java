package jp.dcnet.cj.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kicer {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"A");//放入key，value
		map.put(1,"B");//更新对应key（1）的value内容
		System.out.println(map.containsKey(1));//寻找key
		map.remove(1);// 删除对应key的所有数据
		System.out.println(map.get(1));
		System.out.println("----------");
		
		
		
		
		
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("H");
		list.add("G");
		list.add("E");
		list.add("D");
		list.add("F");
//		list.add(0, "B");// 直接按照下标添加更改
//		list.set(5, "C");// 先历遍一次在进行添加更改
		System.out.println(list.size());
		list.remove(3);// 移除对应下标的数据
		System.out.println(list.size());
		System.out.println("----------");
		System.out.println(list.contains("A"));// 判断list里是否有相同元素
		System.out.println("----------");
		System.out.println(list.indexOf("2"));
		System.out.println("----------");
		if(!list.isEmpty()) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		}
		System.out.println("----------");
		for (String Is : list) {
			System.out.println(Is);
		}
	}
}
