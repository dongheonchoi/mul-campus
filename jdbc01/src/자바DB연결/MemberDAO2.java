package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
	
	//DAO는 DAO의 역활만을 수행하는것이 다른것과의 사용성이 좋다
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

	public int update(String id, String tel) {
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
			ps.setString(1, tel);
			ps.setString(2, id);

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

	public int insert(String id, String pw, String name, String tel) {
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
			ps.setString(1, id); // SQL부품인 ps에 첫번째 ?에 받아온 id 값을 넣는다
			ps.setString(2, pw); // SQL부품인 ps에 두번째 ?에 받아온 pw 값을 넣는다
			ps.setString(3, name); // SQL부품인 ps에 세번째 ?에 받아온 name 값을 넣는다
			ps.setString(4, tel); // SQL부품인 ps에 네번째 ?에 받아온 tel 값을 넣는다

			System.out.println("3. SQL문 부품(객체)으로 만들기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원 가입 성공!");
			}
		} catch (Exception e) { // 모든 위험한 상황 다잡음
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행된다.
			//result = 0;
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
