package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import 화면DB연결.miniprojectVO;

public class miniprojectDAO {

	public ArrayList<miniprojectVO> list(String wy) {
		ResultSet rs = null; // 항목명 +결과 데이터를 담고 있는 테이블
		
		//ArrayList<MemberVO> ==> MemberVO만 들어간 ArarryList
		ArrayList<miniprojectVO> list = new ArrayList<>();
		
		miniprojectVO bag = null;
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다는 뜻)
		// 검색결과가 있을때 : 항목명과 결과 row
		// 검색결과가 없을때 : 항목명  (null이 아니다)
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// 2.오라클 11g에 연결해보자. (java -- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.BOOKLIST where " + wy + " is not null ORDER BY " + wy;  // " " + string 변수  + " "; 된다!
			
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분
	
			
			
			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			rs = ps.executeQuery(); // select문 전송시에는 executeQuery
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) {//검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면없다라는 의미
				// 1. 검색결과가 있으면 ,
				//System.out.println("겸색결과 있음. 성공");
				// 2. 각컬럼에서 결과를 가져오자 
				String bookid = rs.getString(1);
				int weekno = rs.getInt(2);
				int yearno = rs.getInt(3);
				String booktitle = rs.getString(4);
				int price = rs.getInt(5);
				String writer = rs.getString(6);
				String publisher = rs.getString(7);
				Date date = rs.getDate(8);
				String pic = rs.getString(9);
				//System.out.println(id2 + " " + pw + " " + name + " " + tel);
				
				// 3. 가방을 만들자
				bag = new miniprojectVO();
				bag.setBookid(bookid);
				bag.setWeekno(weekno);
				bag.setYearno(yearno);
				bag.setBooktitle(booktitle);
				bag.setPrice(price);
				bag.setWriter(writer);
				bag.setPublisher(publisher);
				bag.setDate(date);
				bag.setPic(pic);
					
				// 4. list에 bag을 추가해주자.
				list.add(bag);
			
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			e.printStackTrace();

		}
		//return id, pw, name, tel; 은 안된다. 
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야한다.
		//검색결과가 있을 때는 bag에 데이터가 들어있음.
		//검색결과가 없을 때는 bag에 무슨 데이터가 들어가 있을까. 초기화 시킨 null값이 그대로 들어가 있다. (null)
		return list;
	}
	
	
	
	
}
