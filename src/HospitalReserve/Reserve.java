package HospitalReserve;

import java.util.ArrayList;
import java.util.Scanner;

class Reserve{
		String reserveName = null; 		//예약자 성명
		String gender = null; 			//성별
		int phoneNum = 0; 				//전화번호
		int age = 0;					//나이
		int dayNum = 0; 				//예약날짜
		String seattype = null; 		//자리타입
		
		static ArrayList<Reservelist> rl = new ArrayList<Reservelist>();
		
		public void Seat() { 					//예약메소드
			// 예약 - 예약은 한 달에 있는 일수로만 계산한다.
			// - 자리는 A석,B석으로나뉘며,각각 2개의 자리가 있다.
			Scanner scanner = new Scanner(System.in);
			
			while(true) { //조건이 true일 경우 계속해서 반복
				//if/else문 추가
				System.out.println("==============================");
				System.out.println("예약하시려는 분의 성함을 입력해주세요!");
				System.out.println("성명 :");
				String reserveName = scanner.next();
				System.out.println("==============================");
				System.out.println("성별을 입력해주세요! ex) 남 / 여");
				System.out.println("성별 :");
				String gender = scanner.next();
				System.out.println("==============================");
				System.out.println("-를 제외한 전화번호를 입력해주세요!");
				System.out.println("전화번호 :");
				int phoneNum = scanner.nextInt(); //int형으로 변경
				System.out.println("==============================");
				System.out.println("나이를 입력해주세요!");
				System.out.println("나이 :");
				int age = scanner.nextInt();
				System.out.println("=============================="); //
				System.out.println("예약하실 병원을 선택해주세요!");
				System.out.println("1.서울대병원 2.아산병원 3.이화여대병원");
				int hospitals = scanner.nextInt();
				//hospitals==1
				//이부분에서 1번선택했을시 2번선택했을시 3번선택했을시  해당 메소드를 호출하는코드 재입력
				Hospital hospital = new Hospital(); //병원객체 생성
	//			hospital.snuh(); //서울대병원메소드 호출
				
				//모든입력완료 후 리스트로 저장
				rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
				System.out.println("예약이 완료되었습니다.");
				System.out.println(reserveName+"님의 예약일은"+dayNum+"일입니다");
				System.out.println("");
			}
		}
}
		/*
		public void searchSeat() { //예약조회 메소드
			
		}

		public void CancleSeat() { //예약취소 메소드
				
		}*/
/*		
	//좌석에 자리의 타입과 일에 이름이 있다면 예약된자리입니다. 출력
	if(seats[seattype][dayNum].equals(reserveName)){
		System.out.println("이미 예약된 자리입니다.다시 시도해주세요.");
}
seats[seattype][dayNum] = (reserveName);
break;*/
//System.out.println();
//}
