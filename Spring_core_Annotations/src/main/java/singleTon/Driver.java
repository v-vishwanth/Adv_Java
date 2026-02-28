package singleTon;

public class Driver {
	public static void main(String[] args) {
		Mobile m1 = Mobile.getMobile();
		Mobile m2 = Mobile.getMobile();
		Mobile m3 = Mobile.getMobile();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		
	}
}
