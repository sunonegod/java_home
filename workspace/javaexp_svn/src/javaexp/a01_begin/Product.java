package javaexp.a01_begin;
// javac Product.java
// Product.class
// java Product  
public class Product {
	String name;
	int price;
	int cnt;
	public Product(String name, int price, int cnt) {
		this.name =name;
		this.price = price;
		this.cnt = cnt;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(cnt);
	}
}
