package ch07;
//한 개의 파일에 2개 이상의 class파일을 작성
//주의점 : 파일저장이름이 public class의 이름으로 저장
class Phone {
	String model;
	int value;
	void print() {
		System.out.println(value+"만원 짜리 "+model+" 스마트폰");
	}
}//phone class



public class PhoneDemo {
    public static void main(String[] args) {
    	Phone myPhone = new Phone();
    	myPhone.model = "갤럭시 S10";
    	myPhone.value = 100;
    	myPhone.print();
    	
    	Phone yourPhone = new Phone();
    	yourPhone.model = "G7";
    	yourPhone.value = 70;
    	yourPhone.print();
	
   }

}//phoneDemo class
