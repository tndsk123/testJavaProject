package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list = (ArrayList<ProdEx>)map.get("Report");
		for(ProdEx p : list) {
			System.out.println(p.getName()+"\t"+p.getNum()+"\t"+p.getCom()+"\t"+p.getPrice()+"\t\t"+p.getAmount()+"\t"+p.getMoney());
		}
	}
	public static void main(String[] args) {
		Map<String, Object> aaa = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
		System.out.println("--------------------------------------------------------------");
		System.out.println("제품명\t제품번호\t제조사\t단가(만원)\t수량\t판매금액(만원)");
		System.out.println("--------------------------------------------------------------");
		ProdEx p = new ProdEx();
		p.setName("OLEDTV");
		p.setNum("lg01tv");
		p.setCom("LG");
		p.setPrice(300);
		p.setAmount(10);
		list.add(p);
		
		ProdEx p1 = new ProdEx("냉장고", "sm02re","삼성",200,5,0);
		list.add(p1);
		
		list.add(new ProdEx("에어컨","win03","위니아",100,8,0));
		list.add(new ProdEx("컴퓨터","asus01","아수스",200,6,0));
		aaa.put("Report", list);
		
		print(aaa);
		System.out.println("--------------------------------------------------------------");
		System.out.println(aaa.size());
		
	}

}
