package jp.dcnet.yjw.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JustDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line ln=new Line("�R���");
		
		List<Station> stList=new ArrayList<Station>();
		
		stList.add(new Station("�R��"));
		stList.add(new Station("�R��"));
		stList.add(new Station("�R��"));
		
		for(Station x:stList) {
			//����P
			System.out.println(ln.route+"of"+x.getName());
			
			//����Q
			System.out.println(x.name.equals("�R��"));
		}
				
		
	}
	
}


