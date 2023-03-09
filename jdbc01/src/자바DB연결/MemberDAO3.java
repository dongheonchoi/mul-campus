package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.MemberVO;

public class MemberDAO3 {

	public int login(MemberVO bag) {
		ResultSet rs = null; // 항목명 +결과 데이터를 담고 있는 테이블
		int result = 0;
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

			String sql = "select * from hr.MEMBER where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			rs = ps.executeQuery(); // select문 전송시에는 executeQuery
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) {//검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면없다라는 의미
				System.out.println("겸색결과 있음. 성공");
				result = 1;
			
			
			}else {
				System.out.println("검색결과 없음. 실패");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			e.printStackTrace();

		}
		//return id, pw, name, tel; 은 안된다. 
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야한다.
		//검색결과가 있을 때는 bag에 데이터가 들어있음.
		//검색결과가 없을 때는 bag에 무슨 데이터가 들어가 있을까. 초기화 시킨 null값이 그대로 들어가 있다. (null)
		return result;
	}
	
	
	public MemberVO one(String id) {
		ResultSet rs = null; // 항목명 +결과 데이터를 담고 있는 테이블
		MemberVO bag = null;
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

			String sql = "select * from hr.MEMBER where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			rs = ps.executeQuery(); // select문 전송시에는 executeQuery
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) {//검색결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면없다라는 의미
				System.out.println("겸색결과 있음. 성공");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				System.out.println(id2 + " " + pw + " " + name + " " + tel);
				
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);;
					
			
			
			}else {
				System.out.println("검색결과 없음. 실패");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			e.printStackTrace();

		}
		//return id, pw, name, tel; 은 안된다. 
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야한다.
		//검색결과가 있을 때는 bag에 데이터가 들어있음.
		//검색결과가 없을 때는 bag에 무슨 데이터가 들어가 있을까. 초기화 시킨 null값이 그대로 들어가 있다. (null)
		return bag;
	}

	// DAO는 DAO의 역활만을 수행하는것이 다른것과의 사용성이 좋다
	public int delete(String id) {
		int result = 0;
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

			// ipaddress ==> InetAddress
			// String url = "http://www,naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서 , String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 측정한 부품으로 인식하려면 그 부품으로 만드렁 주어야 한다.
			// SQL 부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품이다.

			String sql = "delete from hr.MEMBER where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			e.printStackTrace();

		}
		return result;
	}

	public int update(MemberVO bag) {
		int result = 0;
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

			// ipaddress ==> InetAddress
			// String url = "http://www,naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서 , String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 측정한 부품으로 인식하려면 그 부품으로 만드렁 주어야 한다.
			// SQL 부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품이다.

			String sql = "update hr.MEMBER set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 완료");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			e.printStackTrace();

		}
		return result;
	}

	public int insert(MemberVO bag) { // 1.가방을 받아서 변수에 넣기
		int result = 0;
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

			// ipaddress ==> InetAddress
			// String url = "http://www,naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서 , String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 측정한 부품으로 인식하려면 그 부품으로 만드렁 주어야 한다.
			// SQL 부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품이다.

			String sql = "insert into hr.MEMBER values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로
			// sql스트링에 있는 것을 SQL부품으로 만들어 달라고 요펑한 부분

			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 DB은 인덱스가 1부터 시작
			ps.setString(1, bag.getId()); // SQL부품인 ps에 첫번째 ?에 받아온 id 값을 넣는다
			ps.setString(2, bag.getPw()); // SQL부품인 ps에 두번째 ?에 받아온 pw 값을 넣는다
			ps.setString(3, bag.getName()); // SQL부품인 ps에 세번째 ?에 받아온 name 값을 넣는다
			ps.setString(4, bag.getTel()); // SQL부품인 ps에 네번째 ?에 받아온 tel 값을 넣는다

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원 가입 성공!");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행된다.
			// result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
