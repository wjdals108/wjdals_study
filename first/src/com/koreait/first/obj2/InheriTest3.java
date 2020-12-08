package com.koreait.first.obj2;

public class InheriTest3 {

	public static void main(String[] args) {
		//ClassD cD = new ClassD("조용필", 30);
		//cD.print();				//오바리이딩 되어있어서 classD에 print()메소드가 출력된다.
		
		//ClassC cC = new ClassC("A",1);
		//cC.print();
		
		ClassC cA = new ClassD("김남길", 20);
		cA.print();
		
		//cA.ddd();		//안됨
		
		((ClassD)cA).ddd();				//업캐스팅
		//ClassD cD = (ClassD)cA;
		//cD.ddd();
		
	}
}
