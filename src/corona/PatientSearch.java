package corona;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientSearch {
	Scanner scanner = new Scanner(System.in);
	
	PatientSearch() {
		System.out.println("환자 검색 메뉴에 들어왔습니다.");
		search();
		}
	
	
	void search() {
		String searchname = null;
		System.out.print("이름을 입력하세요. : ");
		searchname = scanner.nextLine();
		
		System.out.println(searchname + "으로 검색중...");
		//확진자 리스트 조회
		
		//치료자 리스트 조회
		
	}
	

}
