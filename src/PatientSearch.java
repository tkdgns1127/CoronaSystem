

import java.util.ArrayList;
import java.util.Scanner;

public class PatientSearch {
	Scanner scanner = new Scanner(System.in);
	
	PatientSearch() {
		System.out.println("환자 검색 메뉴에 들어왔습니다.");
		search();
		}
	
	
	public void personSearch(String name) {
		//Test.infectionPersonList.add(new Person("도현도", 23));
		//Test.infectionPersonList.add(new Person("박상훈", 25));
				
		//for(Person person : Test.infectionPersonList) {
				//if(name.equals(person.getName())) {
				//	System.out.println("이름 : " + person.getName());
				//	System.out.println("나이 : " + person.getAge());
				//	System.out.println("번호  : " + person.getPhoneNum());	
				//}
		//}
		
	}
	
	public void search() {
		String searchname = null;
		System.out.print("이름을 입력하세요. : ");
		searchname = scanner.nextLine();
		
		System.out.println(searchname + "으로 검색중...");
		//확진자 리스트 조회
		
		//치료자 리스트 조회
		
	}
	

}
