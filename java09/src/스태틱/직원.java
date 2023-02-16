package 스태틱;

public class 직원 {
	
	String name;
	int age;
	String gen;
	
	static int sum; 
	static int count;
	
	public 직원(String name, int age, String gen) {
		count++;
		sum += age;
		this.name = name;
		this.age = age;
		this.gen = gen;
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
	
	
	
	
		
}
