package HospitalReserve;

public class Hospital01 {
	
	int vaccin1;		// 화이자
	int vaccin2;		// 모더나
	
	Month month = new Month();// 고정값이 되어야되는데
	
	
	public Hospital01(int vaccin1, int vaccin2) {
		super();
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
	
	//백신조회 메소드
	
	//백신 요청 메소드
}
