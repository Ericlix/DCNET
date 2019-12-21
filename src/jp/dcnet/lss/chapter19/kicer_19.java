package jp.dcnet.lss.chapter19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class kicer_19 {

	public static void main(String[] args) {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

     // 接続文字列
     		String url = "jdbc:postgresql://192.168.0.200:5432/tihtih";
     		String user = "tihdbadm";
     		String password = "tihdbadm";

        try{
            //PostgreSQLへ接続
            conn = DriverManager.getConnection(url, user, password);

            //自動コミットOFF
            conn.setAutoCommit(false);

            //SELECT文の実行
            stmt = conn.createStatement();
            String sql = "select  name,count,legs from  animal where  legs ='4'";
            rset = stmt.executeQuery(sql);

            List<Animail> anList = new ArrayList();



            //SELECT結果の受け取り
            while(rset.next()){

                String name = rset.getString(1);
                int count = rset.getInt(2);
                int legs = rset.getInt(3);
                Animail an = new Animail(name, count, legs);
                anList.add(an);
//                System.out.println("動物名: " +name +"  動物数: " + count);
            }

            for (int i = 0; i < anList.size(); i++) {
            	Animail an = anList.get(i);
				
            	System.out.println("動物名: " +an.getName() + "  動物数  "+an.getCount()+  " 動物足数  "+an.getLegs());



			}


            //INSERT文の実行
//            sql = "INSERT INTO jdbc_test VALUES (1, 'AAA')";
//            stmt.executeUpdate(sql);
            conn.commit();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(rset != null)rset.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }

        }
	}

}
