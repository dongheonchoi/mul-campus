package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		
		슈퍼맨 s= new 슈퍼맨();
		s.name = "클라크";
		s.age = 25000;
		s.power = 4445646;
		s.fly = true;
		s.eat();
		s.run();
		s.space();
		
		
		
		
		우먼 wm = new 우먼();
		wm.jump();
		
		원더우먼 swm = new 원더우먼();
		swm.name = "뭐지";
		swm.age = 2000;
		swm.ability = 100;
		swm.늙다 =false ;
		
		swm.eat();
		swm.jump();
		swm.space();
		
		
		
		
		
	}

}
