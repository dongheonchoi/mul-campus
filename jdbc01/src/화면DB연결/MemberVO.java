package 화면DB연결;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String tel;

	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setId(String id) {
		this.id = id;
	}
	
	//가방에 하나씩 값을 꺼내 주어야 함. ==> getter
	public String getId() {
		return id;
	}
	
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

	//가방에 어떤 값들이 들어있는지 string으로 찍어볼 수 있다. toString
	
	
	
	
	
	
}
