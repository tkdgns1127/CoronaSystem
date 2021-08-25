

import java.util.ArrayList;
import java.util.Scanner;

import Persons.Person;

public class DashBoard {
	
	Scanner scanner = new Scanner(System.in);
	//sanghun.Test test = new sanghun.Test();
	//Consult consult = new Consult();
	
	public DashBoard() {
		dashboardstart();
	}
	
	public void dashboardstart() {
		System.out.println("-------전체 상황판----------");
		//	System.out.println("현재 확진자 수 : " + Test.infectionPersonList.size()); //확진자 리스트 조회
		//	System.out.println("검사 예정자 수 : " + consult.coronaTestList.size();); //검사 리스트 조회
		System.out.println("누적 확진자 수 : " + "명"); //확진자 리스트  + 치료자 리스트
		System.out.println("누적 완치자 수 : " + "명"); //치료자 리스트
		System.out.println("누적 사망자 수 : " + "명"); //사망자 리스트
		System.out.println("백신 접종자 수 : " + "명"); //치료자 리스트 + 항체생성 리스트 + 사망자 리스트
//		System.out.println("재확진자 수 : " + "명");   //백신치료여부가 참인사람(Boolean Cure = true)인 사람이 확진자 리스트로 들어가
		
		
	}
	
	/*	
 	public void backmenu() {
		
		System.out.println("뒤로 가시겠습니까? y/n ");
		char input = scanner.next().charAt(0);
		if(input == 'y') {
			MainSearch mainsearch = new MainSearch();
			mainsearch.start();
		}else if(input == 'n') {
			//system.out.println
		}else {
			System.out.println("다시 입력해주세요.");
		}
	}
*/

}
