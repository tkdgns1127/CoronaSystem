
import java.util.ArrayList;

public class Hospital01 {

	private int vaccin1; // 화이자
	private int vaccin2; // 모더나

	String name; // 병원 이름
	private int unique_num; // 병원 고유 번호

	Month month = new Month(); // 캘린더

	ArrayList<Membership> member = new ArrayList<Membership>(); // 병원 관계자

	ArrayList<Reservelist> rl = new ArrayList<Reservelist>(); // 예약 리스트

	public Hospital01(int unique_num, int vaccin1, int vaccin2, String name) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
		this.name = name;
	}

	public Hospital01(int unique_num, int vaccin1, int vaccin2) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
	}

	public int getUnique_num() {
		return unique_num;
	}

	public void setUnique_num(int unique_num) {
		this.unique_num = unique_num;
	}

	public int getVaccin1() {
		return vaccin1;
	}

	public void setVaccin1(int vaccin1) {
		this.vaccin1 = vaccin1;
	}

	public int getVaccin2() {
		return vaccin2;
	}

	public void setVaccin2(int vaccin2) {
		this.vaccin2 = vaccin2;
	}

	// 확진 여부 메소드(검사)

	// 치료 메소드(치료)
	public void hospitalCure(Hospital01 hospital, int vaccinSelect) {
		if (vaccinSelect == 1) {
			hospital.setVaccin1(hospital.getVaccin1() - 1);
		} else if (vaccinSelect == 2) {
			hospital.setVaccin2(hospital.getVaccin2() - 1);
		} else {
			System.out.println("잘못 선택하셨습니다.");
		}
	}

	// 백신 조회 메소드
	public void vaccinsearch() {// 백신 조회
		System.out.println("병원의 현재 백신 갯수");
		System.out.println("화이자 : " + getVaccin1());
		System.out.println("모더나 : " + getVaccin2());

		HospitalStart hs = new HospitalStart();
		System.out.println("chooseHospital : " + hs.chooseHospital);
		hs.hospitalstart(hs.chooseHospital);
	}

	// 백신 요청 메소드
	// 백신 요청 메소드
	public void vaccinrequest(Hospital01 hospital, int inputV1, int inputV2) {
		Supplyer supplyer = new Supplyer();
		if ((inputV1 <= supplyer.sv1) && (inputV2 <= supplyer.sv2)) {
			supplyer.supply(hospital, inputV1, inputV2);
			System.out.println("화이자 " + inputV1 + "개와 " + "모더나 " + inputV2 + "개가 주문되었습니다.");
			System.out.println("현재  화이자 " + vaccin1 + "개와 " + "모더나 " + vaccin2 + "개를 가지고 있습니다.");
		} else if ((inputV1 > supplyer.sv1) && (inputV2 > supplyer.sv2)) {
			System.out.println("화이자 및 모더나의 물량이 부족합니다.");
			System.out.println("현재 주문 가능한 화이자 개수 : " + supplyer.sv1 + " / 모더나 개수 : " + supplyer.sv2);
		} else if (inputV1 > supplyer.sv1) {
			System.out.println("화이자의 물량이 부족합니다. 현재 주문 가능한 화이자 개수 : " + supplyer.sv1);
		} else if (inputV2 > supplyer.sv2) {
			System.out.println("모더나의 물량이 부족합니다. 현재 주문 가능한 모더나 개수 : " + supplyer.sv2);
		}

		HospitalStart hs = new HospitalStart();
		// hs.hospitalstart(HospitalStart.chooseHospital);
		hs.hospitalstart(hs.chooseHospital);
	}

	public void add(int inputV1, int inputV2) {

		this.vaccin1 += inputV1;
		this.vaccin2 += inputV2;
	}

	class Supplyer {

		int sv1 = 100; // 공급자가 가진 화이자
		int sv2 = 100; // 공급자가 가진 모더나

		public void supply(Hospital01 hospital, int inputV1, int inputV2) {
			sv1 -= inputV1;
			sv2 -= inputV2;

			hospital.add(inputV1, inputV2);
		}
	}
}
