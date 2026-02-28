package singleTon;

public class Mobile {
	private static Mobile m;
	
	private Mobile() {
		
	}
	
	public static Mobile getMobile() {
		if(m == null) {
			return new Mobile();
		}
		return m;
	}
}
