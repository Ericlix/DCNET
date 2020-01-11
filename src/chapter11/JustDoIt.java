package jp.dcnet.yjw.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JustDoIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line ln=new Line("山手線");
		
		List<Station> stList=new ArrayList<Station>();
		
		stList.add(new Station("山口"));
		stList.add(new Station("山上"));
		stList.add(new Station("山下"));
		
		for(Station x:stList) {
			//質問１
			System.out.println(ln.route+"of"+x.getName());
			
			//質問２
			System.out.println(x.name.equals("山上"));
		}
				
		
	}
	
}


