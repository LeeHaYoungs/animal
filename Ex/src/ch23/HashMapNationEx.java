package ch23;

import java.util.HashMap;
import java.util.Scanner;

import ex.Key;

public class HashMapNationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���  - �����̸� , �α� >> ");
			String nation = sc.next();
			if(nation.equals("�׸�")) {
				System.out.println("��� ����");
				break;
				}
			int population = sc.nextInt();
			nations.put(nation,population);
		}
		while(true) {
			System.out.print("�˻�  - �����̸�  >> ");
			String nation = sc.next();
			if(nation.equals("�׸�")) {
				System.out.println("�˻� ����");
				break;
			}
			else if(nations.get(nation)==null){
				System.out.println("��ε��� ���� �����Դϴ�");
			}
			else {
			System.out.println(nation+"�� �α� : "+nations.get(nation));
			}
		}
		sc.close();
	}

}
