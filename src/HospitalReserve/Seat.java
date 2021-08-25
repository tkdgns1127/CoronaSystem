package HospitalReserve;

import java.util.Scanner;

class reserveseat{
	
	
		//현재 오류 - 타입 
		//수정해야 할 부분 - 날짜 / 리스트
		//다시2차
	
		
		String reserveName; // 예약자 성명
		int dayNum; // 날짜
		int Seattype; // 자리타입
		String[][] seats = new String[3][31]; // 이름은 3글자 일자는31일
		String[] list = {"A","B"}; //자리 타입
		
		public reserveseat(String cusName, int dayNum) {
			this.reserveName = cusName;
			this.dayNum = dayNum;
			
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0; j < 31 ; j++) {
					seats[i][j] = "__";
				}
			}
		}
		
		public void Seat() { // 날짜예약
			// 예약 - 예약은 한 달에 있는 일수로만 계산한다.
			// - 좌석은 A석,B석으로나뉘며,각각 2개의 좌석이 있다.
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("==============================");
			System.out.println("예약하시려는 분의 성함을 입력해주세요!");
			System.out.println("성명 :");
			String reserveName = scanner.next();
			/*while(true) {
				System.out.println("==============================");
				System.out.println("원하시는 날짜를 선택해주세요.!<숫자로만 입력바랍니다>");
				System.out.println("원하시는 날짜 :");
				int Seattype = scanner.nextInt() - 1;
				System.out.println("원하시는 자리타입을 선택하세요. A,B");
				System.out.println("좌석번호 :");
				int dayNum = scanner.nextInt() - 1 ;
	         		if(dayNum>31){
	         			System.out.println("잘못된 좌석번호 입니다. 다시 입력해주세요.");
	         			dayNum = scanner.nextInt()-1;
	         		}
	         		if(seats[Seattype][dayNum].equals(reserveName)){
	         			System.out.println("이미 예약된 자리입니다.다시 시도해주세요.");
	         	}
	         	seats[Seattype][dayNum] = (reserveName);
	         	break;*/
			}
			//System.out.println();
		//}
		public void searchSeat() {
			
		}

		public void CancleSeat() {
				
		}

	}
