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
			System.out.print("등록  - 나라이름 , 인구 >> ");
			String nation = sc.next();
			if(nation.equals("그만")) {
				System.out.println("등록 종료");
				break;
				}
			int population = sc.nextInt();
			nations.put(nation,population);
		}
		while(true) {
			System.out.print("검색  - 나라이름  >> ");
			String nation = sc.next();
			if(nation.equals("그만")) {
				System.out.println("검색 종료");
				break;
			}
			else if(nations.get(nation)==null){
				System.out.println("등로되지 않은 나라입니다");
			}
			else {
			System.out.println(nation+"의 인구 : "+nations.get(nation));
			}
		}
		sc.close();
	}

}
