package ex;

public class Member {
	String id;
	
	Member(String id){
		this.id=id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member compareMember = (Member) obj;
			//�ٿ�ĳ�������� obj�� KeyŬ������ compareMember�� ����
			if (id.equals(compareMember.id)) {
				return true; // true���� ��ȯ�ؾ� String���� �����´�
			} else {
				return false;
			}
		}
		return false;
	}
	
	
}
