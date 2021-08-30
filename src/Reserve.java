
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

class Reserve {
	String reserveName = null; // 예약자 성명
	String gender = null; // 성별
	String phoneNum = null; // 전화번호
	int age = 0; // 나이
	String dayNum = null; // 예약날짜
	String seattype = null; // 자리타입

	ReserveMain rr = new ReserveMain();
	Scanner scanner = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	int pre_month = calendar.get(Calendar.MONTH) + 1;

	public void resreve(Hospital01 hospital, String reserveName, String gender, String phoneNum, int age) {

		int month = calendar.get(Calendar.MONTH) + 2;
		hospital.month.calendar(month);
		Reserve rs = new Reserve();

		// 입력 받은 일수랑 같은 예약 캘린더의 일수를 찾고
		// 그 일수의 positive가 true인지 확인 후 true라면 false로 바꾸고 예약을 진행
		// false라면 예약 불가능

		// day.substring(3); //입력받은 일수
		System.out.println("예약하실 날짜를 입력하세요 : 예)9/25");
		System.out.println();

		String resDay = scanner.nextLine();
		// boolean flag = Pattern.matches(month + "/^[0-9]*$", resDay);

		// if(flag)
		try {
			String[] res_day = resDay.split("/");
			String res_day0 = res_day[0];
			String res_day1 = res_day[1];

			// Day day : rr.h1.month.day
			for (int i = 0; i < hospital.month.day.size(); i++) {

				if (month == Integer.parseInt(res_day0)) {

					if (hospital.month.day.get(i).getDay().equals(res_day1)) {
						if (hospital.month.day.get(i).isRes_possibility()) {

							hospital.month.day.get(i).setRes_possibility(false);
							// 모든입력완료 후 리스트로 저장
							dayNum = resDay;

							hospital.rl.add(new Reservelist(reserveName, gender, phoneNum, age, dayNum, seattype));
							System.out.println("예약이 완료되었습니다.");
							System.out.println(reserveName + "님의 예약일은 " + dayNum + " 일입니다");
							System.out.println("");
							System.out.println("메뉴로 이동하겠습니다.");

							// rs.resreve(hospital, reserveName, gender, phoneNum, age);
							rr.reserveStart();

						} else {
							System.out.println("예약 가능한 날짜를 골라 주세요");
							rs.resreve(hospital, reserveName, gender, phoneNum, age);
						}
					} // else {
						// System.out.println("날짜 형식에 맞지 않습니다.");
						// rs.resreve(hospital, reserveName, gender, phoneNum,age);
						// }
				} else {
					System.out.println("월을 올바르게 입력하세요.");
					rs.resreve(hospital, reserveName, gender, phoneNum, age);
				}
			}
		} catch (Exception e) {
			System.out.println("날짜 형식에 맞지 않습니다.!!!!!!!!!!!");
			rs.resreve(hospital, reserveName, gender, phoneNum, age);

			// else {
			// System.out.println("날짜 형식에 맞지 않습니다.");
		}
	}

	// static ArrayList<Reservelist> rl = new ArrayList<Reservelist>();

	public void Seat() { // 예약메소드
		// 예약 - 예약은 한 달에 있는 일수로만 계산한다.
		// - 자리는 A석,B석으로나뉘며,각각 2개의 자리가 있다.
		Reserve res = new Reserve();

		// if/else문 추가
		System.out.println("==============================");
		System.out.println("예약하시려는 분의 성함을 입력해주세요!");
		System.out.println("성명 :");
		String reserveName = scanner.next();
		System.out.println("==============================");
		System.out.println("성별을 입력해주세요! ex) 남 / 여");
		System.out.println("성별 :");
		String gender = scanner.next();
		System.out.println("==============================");
		System.out.println("010-0000-0000형식으로 전화번호를 입력해주세요!");
		System.out.println("전화번호 :");

		try {

			String phoneNum = scanner.next(); // int형으로 변경
			boolean flag = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phoneNum);
			if (flag) {

				System.out.println("==============================");
				System.out.println("나이를 입력해주세요!");
				System.out.println("나이 :");

				try {
					int age = scanner.nextInt(); // int형으로 변경
				} catch (InputMismatchException e) {
					scanner = new Scanner(System.in);
					System.out.println("숫자만 입력하세요.");
					ReserveMain reserve = new ReserveMain();
					reserve.reserveStart();

				}
				System.out.println("=============================="); //
				System.out.println("예약하실 병원을 선택해주세요!");
				System.out.println("1.서울대병원 2.아산병원 3.이화여대병원");

				try {

					int hospitals = scanner.nextInt();

					System.out.println();

					// 병원 선택 [1.서울대병원 2.아산병원 3.이화여대병원]
					if (hospitals == 1) {
						System.out.println("서울대병원을 선택하셨습니다.");

						res.resreve(Corona19.h1, reserveName, gender, phoneNum, age);

					} else if (hospitals == 2) { // 아산병원

						System.out.println("아산병원을 선택하셨습니다.");
						res.resreve(Corona19.h2, reserveName, gender, phoneNum, age);

					} else if (hospitals == 3) { // 이화여자 병원
						System.out.println("아산병원을 선택하셨습니다.");
						res.resreve(Corona19.h3, reserveName, gender, phoneNum, age);

					} else {
						System.out.println("병원을 잘못 입력하셨습니다.");
						ReserveMain reserve = new ReserveMain();
						reserve.reserveStart();
					}

				} catch (InputMismatchException e) {
					scanner = new Scanner(System.in);
					System.out.println("잘못 입력하셨습니다");
					System.out.println();
					ReserveMain reserve = new ReserveMain();
					reserve.reserveStart();

				}

			} else {
				System.out.println("전화번호 형식이 맞지 않습니다.");
				ReserveMain reserve = new ReserveMain();
				reserve.reserveStart();

			}

		} catch (InputMismatchException e) {
			scanner = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요!");
			String phoneNum = scanner.next();
		}

	}

	public void searchSeat(Hospital01 hospital) { // 예약조회 메소드
		String find; // 찾는

		System.out.println("조회하실 분의 전화번호 뒷자리 4자리를 입력해주세요!");
		try {
			find = scanner.nextLine();

			// inputPhoneNumber 숫자만 포함되어있는지 체크하는 정규표현식
			String pattern2 = "^[0-9]*$";

			// 값이 입력되지 않았을때?

			if (find.equals("")) {

				System.out.println("번호가 입력되지 않았습니다. 다시 확인해주세요.");
				ReserveMain reserve = new ReserveMain();
				reserve.reserveStart();

				// inputPhoneNumber 입력값의 길이가 4가 아니거거나, 숫자가 아닐때
			} else if (find.length() != 4 || !Pattern.matches(pattern2, find)) {
				System.out.println("올바른 번호 형식이 아닙니다. 다시 확인해주세요.");
				ReserveMain reserve = new ReserveMain();
				reserve.reserveStart();

			} else {

				System.out.println();

				boolean tf = true;

				for (int i = 0; i < hospital.rl.size(); i++) {

					if (hospital.rl.get(i).getPhoneNum().substring(9).equals(find)) {
						tf = false;
						System.out.println("------------------------------------------------------------------------");
						System.out.println("예약자: " + hospital.rl.get(i).getName() + "님 " + "\t예약병원: "
								+ hospital.name + "\t\t예약일: " + hospital.rl.get(i).getDayNum() + "\t전화번호: "
								+ hospital.rl.get(i).getPhoneNum());
						System.out.println("------------------------------------------------------------------------");

					}
				}

				/*
				for (int i = 0; i < Corona19.h2.rl.size(); i++) {

					if (Corona19.h2.rl.get(i).getPhoneNum().substring(9).equals(find)) {
						tf = false;

						System.out.println("------------------------------------------------------------------------");
						System.out.println("예약자: " + Corona19.h2.rl.get(i).getName() + "님 " + "\t예약병원: "
								+ Corona19.h2.name + "\t\t예약일: " + Corona19.h2.rl.get(i).getDayNum() + "\t전화번호: "
								+ Corona19.h2.rl.get(i).getPhoneNum());
						System.out.println("------------------------------------------------------------------------");

					}
				}

				for (int i = 0; i < Corona19.h3.rl.size(); i++) {

					if (Corona19.h3.rl.get(i).getPhoneNum().substring(9).equals(find)) {
						tf = false;

						System.out.println("------------------------------------------------------------------------");
						System.out.println("예약자: " + Corona19.h3.rl.get(i).getName() + "님 " + "\t예약병원: "
								+ Corona19.h3.name + "\t\t예약일: " + Corona19.h3.rl.get(i).getDayNum() + "\t전화번호: "
								+ Corona19.h1.rl.get(i).getPhoneNum());
						System.out.println("------------------------------------------------------------------------");
						
					}
				}*/

				if (tf) {
					System.out.println("예약리스트에 없습니다.");
					System.out.println("예약을 진행해주세요!");
					
					HospitalStart hs = new HospitalStart();
					hs.hospitalstart(hs.chooseHospital);
				

				}else {
					HospitalStart hs = new HospitalStart();
					hs.hospitalstart(hs.chooseHospital);
				}

			}
		} catch (InputMismatchException e) {
			scanner = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요!");
			String phoneNum = scanner.next();
		}
	}

	public static void main(String[] args) {
		Reserve rs = new Reserve();
		rs.resreve(Corona19.h1, "박상훈", "남", "010-7927-7479", 24);
	}
}
