package corona;

import java.util.Scanner;

public class MainSearch {
	int menu;
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		System.out.println("=========================");
		System.out.println("1.전체 상화판   2.환자 검색   3.나이별 확진자   4. 뒤로가기");
		System.out.println("=========================");
		
		System.out.print("메뉴를 입력하세요. : ");
		int result = Integer.parseInt(scanner.nextLine());
		
		if(result == 1) {
			DashBoard dashBoard = new DashBoard();
		}else if(result == 2) {
			PatientSearch patientsearch = new PatientSearch();
		}else if(result == 3) {
			//나이별 클래스 객체 생성
		}else if(result == 4) {
			//조회에서 나가서 메인미뉴로 가기
		}else {
			System.out.println("없는 번호 입니다. 번호를 다시 입력해주세요.");
			start();
			
		}
	}
	
	public static void main(String[] args) {
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
			
	}

}
