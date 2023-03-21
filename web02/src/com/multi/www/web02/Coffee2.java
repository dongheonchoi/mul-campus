package com.multi.www.web02;

public class Coffee2 {
	int price;
	String name;

	public static Coffee2 coffee2;

	private Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public static Coffee2 getInstance() {
		if (coffee2 == null) {
			coffee2 = new Coffee2(1000, "아메리카노");
		}

		return coffee2;
	}


}
