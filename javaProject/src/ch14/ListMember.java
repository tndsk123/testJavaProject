package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		//Member 인스턴스 생성
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		//List에 Member 인스턴스 추가
		list.add(m1);//ArrayList에 Member 객체를 추가
		System.out.println(list.size());
		
		Member m2 = new Member("hong", "1234", "홍길동", "02-989-9999","hong@gmail.com");
		list.add(m2);
		list.add(new Member("choi", "1234", "최철수", "010-123-4567", "choi@daum.net"));
		System.out.println(list.size());//list에 3개의 객체를 넣기
		
		System.out.println("이름\t아이디\t패스워드\t전화\t\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i);//여기에 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수로 활용
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}

}
