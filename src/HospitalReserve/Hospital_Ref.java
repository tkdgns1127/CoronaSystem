package HospitalReserve;
import java.util.Scanner;

class Hospital_Ref {

	String name;
	int v1; //화이자
	int v2; //모더나
	
	public static Supplyer supplyer = new Supplyer(); // static r
	
	public Hospital_Ref(String name, int v1, int Hospital_Ref) {
		this.name = name;
		this.v1 = v1;
		this.v2 = v2;
	}
	// 1. 백신 조회
	public void search( ) {
		
		System.out.println("=================================");
		System.out.println(name);
		System.out.println();
		System.out.print("화이자 : " + v1);
		System.out.println(", 모더나 : " + v2);
		System.out.println("=================================");		
	}
	// 2. 백신 공급	
	public void request(Hospital_Ref hospital, int inputV1, int inputV2) {
		
		search();
		
		if ((inputV1 <= supplyer.sv1) && (inputV2 <= supplyer.sv2)){
			supplyer.supply(hospital, inputV1, inputV2);
			System.out.println("화이자 " + inputV1 + "개와 " +  "모더나 " + inputV2 + "개가 주문되었습니다.");
			System.out.println("현재 " + name + "은 화이자 " + v1 + "개와 " +  "모더나 " + v2 + "개를 가지고 있습니다.");
		} else if((inputV1 > supplyer.sv1) && (inputV2 > supplyer.sv2)) {
			System.out.println("화이자 및 모더나의 물량이 부족합니다.");
			System.out.println("현재 주문 가능한 화이자 개수 : " + supplyer.sv1 + " / 모더나 개수 : " + supplyer.sv2);
		} else if (inputV1 > supplyer.sv1) {
			System.out.println("화이자의 물량이 부족합니다. 현재 주문 가능한 화이자 개수 : " + supplyer.sv1);
		} else if(inputV2 > supplyer.sv2) {
			System.out.println("모더나의 물량이 부족합니다. 현재 주문 가능한 모더나 개수 : " + supplyer.sv2); 
		}
	}
		
	public void add(int inputV1, int inputV2) {
		
		this.v1 += inputV1;
		this.v2 += inputV2;	
	}
}

class Supplyer {
	
	int sv1 = 100; //공급자가 가진 화이자
	int sv2 = 100; //공급자가 가진 모더나
	
	public void supply(Hospital_Ref hospital, int inputV1, int inputV2) {
		sv1 -=  inputV1;
		sv2 -=	inputV2;
		
		hospital.add(inputV1, inputV2);
	}
};

// 백신 조회, 백신 공급 테스트  (테스트용)
//public class Test {
//	
//	public static void main(String[] args) {
//		Hospital_Ref h1 = new Hospital_Ref("서울대병원", 20, 30);
//		Hospital_Ref h2 = new Hospital_Ref("아산병원", 40, 50);
//		Hospital_Ref h3 = new Hospital("이화여대병원", 46, 57);
//		
//		h1.search();
//		h1.request(h1, 5, 6);
//		h1.request(h1, 100, 100);
//		
//		
//	}
//}