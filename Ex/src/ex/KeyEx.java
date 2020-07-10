package ex;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Key key1 = new Key(100);
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		hashmap.put(new Key(1),"홍길동");
		hashmap.put(key1, "이하영");
		
		String str = hashmap.get(new Key(1));
		String str2 = hashmap.get(key1);
		
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		
	}
}
