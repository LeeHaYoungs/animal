package ex;

import java.util.HashMap;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1= new Member("blue");
		Member m2= new Member("blue");
		Member m3= new Member("red");
		
		if(m1.equals(m2)) {
			System.out.println("m1�� m2�� �����ϴ�");
		}
		else {
			System.out.println("m1�� m2�� �������� �ʴ�");
		}
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		if(m1.equals(m3)) {
			System.out.println("m1�� m3�� �����ϴ�");
		}
		else {
			System.out.println("m1�� m3�� �������� �ʴ�");
		}
		System.out.println(m1.hashCode());
		System.out.println(m3.hashCode());
		
		
	}

}
