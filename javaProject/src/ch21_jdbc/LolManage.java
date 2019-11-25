package ch21_jdbc;

import java.util.List;
import java.util.Scanner;

public class LolManage {
	LolDAO dao=new LolDAO();
	
	void list() {
		List<LolDTO> list=dao.list();
		System.out.println("===========================================================================");
		System.out.println("챔프명\t\tQ스킬\t\tW스킬\t\tE스킬\t\tR스킬");
		System.out.println("===========================================================================");
		for(LolDTO dto : list) {
			System.out.print(dto.getChamp()+"\t\t");
			System.out.print(dto.getQs()+"\t\t");
			System.out.print(dto.getWs()+"\t\t");
			System.out.print(dto.getEs()+"\t\t");
			System.out.print(dto.getRs()+"\n");
		}
	}
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("챔프명 : ");
		String champ = scan.next();
		System.out.print("Q스킬 : ");
		String qs = scan.next();
		System.out.print("W스킬 : ");
		String ws = scan.next();
		System.out.print("E스킬 : ");
		String es = scan.next();
		System.out.print("R스킬 : ");
		String rs = scan.next();
		LolDTO dto = new LolDTO(champ, qs, ws, es, rs);
		dao.insert(dto);
		System.out.println("저장되었습니다.");
	}
	
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 챔피언을 입력하세요.");
		String champ = scan.next();
		int result=dao.delete(champ);
		if(result==1) {
		    System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("챔프가 삭제당하기 싫어합니다.");
		}
	}
	
	public static void main(String[] args) {
		LolManage lol=new LolManage();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요.(1:챔피언목록 2:챔피언추가 3:챔피언삭제 0:종료):");
			int code=scan.nextInt();
			switch (code) {
			case 0: 
				System.out.println("종료합니다.");
				System.exit(0);
				scan.close();
				break;
			case 1: lol.list(); break;
			case 2: lol.insert(); break;
			case 3: lol.delete(); break;
			default: System.out.println("이상한거 누르지 마세요.");
				break;
			}
		}
	}

}
