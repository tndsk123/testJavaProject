package ch04;

public class SwitchExam {

	public static void main(String[] args) {
		int kor=85, mat=90, eng=70, tot=kor+mat+eng;//총
		double avg=tot/3.0;//평균
		String grade="";//등급(수우미양가)
		
		switch((int)(avg/10)) {//double을 int로 변환
		case 10:
		case 9:grade="수";
		break;
		case 8:grade="우";
		break;
		case 7:grade="미";
		break;
		case 6:grade="양";
		break;
		default:grade="가";
		}//end switch
		//결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%4.1f\t%s",kor,eng,mat,tot,avg,grade);
		

	}

}
