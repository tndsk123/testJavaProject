package ch19;

import java.io.Serializable;
//객체 직렬화 : Serializable
//메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때 사용
//DTO : Data Transfer Object (데이터를 전달하는 객체, 결과물을 저장)
//DAO : Data Access Object(데이터 조작 객체,데이터를 구하는 비즈니스로직)
//객체 직렬화를 하려면 Serializable 인터페이스를 구현해야 함
//VO : Vector Object, Value Object
public class MemberInfoDTO implements Serializable{
	private String juminNo;
	private String passwd;
	
	public MemberInfoDTO() {
		
	}

	public MemberInfoDTO(String juminNo, String passwd) {
		super();
		this.juminNo = juminNo;
		this.passwd = passwd;
	}

	public String getJuminNo() {
		return juminNo;
	}

	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "MemberInfoDTO [juminNo=" + juminNo + ", passwd=" + passwd + "]";
	}
	
	
	

}
