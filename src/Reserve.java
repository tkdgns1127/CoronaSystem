

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Reserve{
		String reserveName = null; 		//예약자 성명
		String gender = null; 			//성별
		String phoneNum = null; 				//전화번호
		int age = 0;					//나이
		String dayNum = null; 				//예약날짜
		String seattype = null; 		//자리타입
		
		ReserveMain rr = new ReserveMain();
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		int pre_month = calendar.get(Calendar.MONTH)+1;
		
		public void resreve(Hospital01 hospital,String reserveName, String gender, String phoneNum, int age) {
			Corona19.h1.month.calendar(calendar.get(Calendar.MONTH)+1);
			
		
			//입력 받은 일수랑 같은 예약 캘린더의 일수를 찾고 
			//그 일수의 positive가 true인지 확인 후 true라면 false로 바꾸고 예약을 진행 
			//false라면 예약 불가능

			//day.substring(3);	//입력받은 일수
			System.out.println("예약하실 날짜를 입력하세요 : 예)08/25");
			System.out.println();
			String res_day = scanner.nextLine();
			//Day day : rr.h1.month.day
			for (int i = 0; i<Corona19.h1.month.day.size(); i++) {
			
				if(hospital.month.day.get(i).getDay().equals(res_day.substring(3))){
					if(hospital.month.day.get(i).isRes_possibility()) {
					
						hospital.month.day.get(i).setRes_possibility(false);
						//모든입력완료 후 리스트로 저장
						dayNum = res_day;
					
						hospital.rl.add(new Reservelist(reserveName,gender,phoneNum,age,dayNum,seattype));
						System.out.println("예약이 완료되었습니다.");
						System.out.println(reserveName+"님의 예약일은 " + dayNum + " 일입니다");
						System.out.println("");
						System.out.println("메뉴로 이동하겠습니다.");
						rr.reserveStart();

					
					}else {
						System.out.println("예약 가능한 날짜를 골라 주세요");
					}
				}
			}
		}
		

		
		//static ArrayList<Reservelist> rl = new ArrayList<Reservelist>();
		
		public void Seat() { 					//예약메소드
			// 예약 - 예약은 한 달에 있는 일수로만 계산한다.
			// - 자리는 A석,B석으로나뉘며,각각 2개의 자리가 있다.
			Reserve res = new Reserve();
			
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
				String phoneNum = scanner.next(); //int형으로 변경
				System.out.println("==============================");
				System.out.println("나이를 입력해주세요!");
				System.out.println("나이 :");
				int age = scanner.nextInt();
				System.out.println("=============================="); //
				System.out.println("예약하실 병원을 선택해주세요!");
				System.out.println("1.서울대병원 2.아산병원 3.이화여대병원");
				int hospitals = scanner.nextInt();
				System.out.println();
				
				
				//병원 선택	[1.서울대병원 2.아산병원 3.이화여대병원]
				if(hospitals == 1) {
					System.out.println("서울대병원을 선택하셨습니다.");
					
					res.resreve(Corona19.h1, reserveName, gender, phoneNum, age);
					
				}else if(hospitals == 2) {	// 아산병원
					
					System.out.println("아산병원을 선택하셨습니다.");
					res.resreve(Corona19.h2, reserveName, gender, phoneNum, age);
					
				}else {						// 이화여자 병원
					res.resreve(Corona19.h3, reserveName, gender, phoneNum, age);
					
				}
				
			
			}
		}
		
		
		public void searchSeat(Hospital01 hospital) { //예약조회 메소드
			String find; //찾는
			
			System.out.println("조회하실 분의 전화번호 뒷자리 4자리를 입력해주세요!");
			find = scanner.nextLine();
			System.out.println();
			
			System.out.println("");
			System.out.println("예약하신분의 전화번호가"+hospital.rl.get(0).getPhoneNum()+"가 맞습니까?");
			System.out.println(hospital.rl.get(0).getName()+"님의 예약 날짜는"+hospital.rl.get(0).getDayNum()+"입니다.");
			for(int i = 0; i<hospital.rl.size(); i++) {
				//System.out.println(hospital.rl.get(i).getPhoneNum().equals(find.substring(8)))
				if(hospital.rl.get(0).getPhoneNum().substring(7).equals(find)) {
					System.out.println(hospital.rl.get(0).getName()+"님의 예약 날짜는"+hospital.rl.get(0).getDayNum()+"입니다.");
				}else {
					System.out.println("예약리스트에 없습니다.");
					System.out.println("예약을 진행해주세요!");
				}
			}
		}
}
