package ex;

import ex.Key;

public class Key {

	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override//물리적주소
	public int hashCode() {
		return number;
	}
	
	@Override//논리적주소
	public boolean equals(Object obj) {
		// 부모객체와 자식객체가 형성되어서 형변환이 가능한지 판다
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			//다운캐스팅으로 obj가 Key클래스의 compareKey로 대입
			if (number == compareKey.number) {
				return true; // true값을 반환해야 String값을 가져온다
			} else {
				return false;
			}
		}
		return false;
	}
}
