package HospitalReserve;

import java.util.ArrayList;

public class Hospital01 {
	
	int vaccin1;		// 화이자
	int vaccin2;		// 모더나
	
	int unique_num;
	
	Month month = new Month();// 고정값이 되어야되는데
	
	//ArrayList<Membership> member = new ArrayList<Membership>();	// 병원 관계자
	
	
	
	
	
	public Hospital01(int unique_num,int vaccin1, int vaccin2) {
		super();
		this.unique_num = unique_num;
		this.vaccin1 = vaccin1;
		this.vaccin2 = vaccin2;
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


	
	//확진 여부 메소드(검사)
	
	//치료 메소드(치료)
	
	//백신 조회 메소드
	
	//백신 요청 메소드
}
