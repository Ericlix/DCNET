package jp.dcnet.lss.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Kicer_list {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add(null);
		list.add("C");
		list.add("D");

		if (list != null) {//判断文本是否null
			Iterator<String> it = list.iterator();//叠代器，速度快,指标指向下一位

			while (it.hasNext()) {  //判断下一位是否有东西
				String str = it.next();
				if (str != null) {  //判断下一位是否null
					System.out.println(str.toString());

				}
			}


		}

//以下各种列表输出

//		System.out.println(list);

//		for (int i = 0;i <=list.size();i++) {
//			System.out.println(list.get(i));
//
//		}

//		for (String str : list) {
//			System.out.println(str);
//		}


	}

}
