package ex;

import ex.Key;

public class Key {

	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override//�������ּ�
	public int hashCode() {
		return number;
	}
	
	@Override//�����ּ�
	public boolean equals(Object obj) {
		// �θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			//�ٿ�ĳ�������� obj�� KeyŬ������ compareKey�� ����
			if (number == compareKey.number) {
				return true; // true���� ��ȯ�ؾ� String���� �����´�
			} else {
				return false;
			}
		}
		return false;
	}
}
