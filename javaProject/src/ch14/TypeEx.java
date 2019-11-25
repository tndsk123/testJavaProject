package ch14;

public class TypeEx <T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	public static void main(String[] args) {
		TypeEx<String> a = new TypeEx<String>();
		a.setData("kim");
		System.out.println("id : "+a.getData());
		a.setData("김길동");
		System.out.println("이름  : "+a.getData());
		a.setData("kim@gmail.com");
		System.out.println("이메일 : "+a.getData());
		TypeEx<Integer> b = new TypeEx<Integer>();
		b.setData(30);
		System.out.println("나이 : "+b.getData());
		a.setData("010-1234-5678");
		System.out.println("전화 : "+a.getData());
				
		
	}

}
