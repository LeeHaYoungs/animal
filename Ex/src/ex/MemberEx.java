package ex;

import java.util.HashMap;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1= new Member("blue");
		Member m2= new Member("blue");
		Member m3= new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1과 m2는 동등하다");
		}
		else {
			System.out.println("m1과 m2는 동등하지 않다");
		}
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		if(m1.equals(m3)) {
			System.out.println("m1과 m3는 동등하다");
		}
		else {
			System.out.println("m1과 m3는 동등하지 않다");
		}
		System.out.println(m1.hashCode());
		System.out.println(m3.hashCode());
		
		
	}

}
