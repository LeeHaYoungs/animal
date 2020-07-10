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
			//다운캐스팅으로 obj가 Key클래스의 compareMember로 대입
			if (id.equals(compareMember.id)) {
				return true; // true값을 반환해야 String값을 가져온다
			} else {
				return false;
			}
		}
		return false;
	}
	
	
}
