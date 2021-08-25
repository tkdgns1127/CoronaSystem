package corona;

import java.util.ArrayList;

public class DashBoard {
	
	ArrayList<Person> treatmentCompletedList = new ArrayList<>();//완치자리스트
	ArrayList<Person> antibodyList = new ArrayList<>();//항체생성자 리스트
	ArrayList<Person> deathList = new ArrayList<>();//사망자 리스트
	
	
	public void dashboardstart() {
		System.out.println("현재 확진자 수 : " + "명"); //확진자 리스트 조회
		System.out.println("검사 예정자 수 : " + "명"); //검사 리스트 조회
		System.out.println("누적 확진자 수 : " + "명"); //확진자 리스트  + 치료자 리스트
		System.out.println("누적 완치자 수 : " + "명"); //치료자 리스트
		System.out.println("누적 사망자 수 : " + "명"); //사망자 리스트
		System.out.println("백신 접종자 수 : " + "명"); //치료자 리스트 + 항체생성 리스트 + 사망자 리스트
//		System.out.println("재확진자 수 : " + "명");   //백신치료여부가 참인사람(Boolean Cure = true)인 사람이 확진자 리스트로 들어가
		
		
	}
}
