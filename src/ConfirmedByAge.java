
import java.util.ArrayList;

public class ConfirmedByAge {	// 나이별 확진자
	
	// 확진자 리스트에서 나이대별로(10대, 20대, 30대...) 출력
	public void confirmedByAge() {
		
		ArrayList<Integer> a = new ArrayList<>();	// 확진자 리스트
		
		for(int i=0; i<5; i++) {
			int num = 10 + i;
			a.add(num);	
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			int num = 20 + i;
			a.add(num);	
		}
		
		for(int i=0; i<8; i++) {
			int num = 30 + i;
			a.add(num);	
		}
		
		for(int i=0; i<9; i++) {
			int num = 40 + i;
			a.add(num);	
		}
		
		for(int i=0; i<7; i++) {
			int num = 50 + i;
			a.add(num);	
		}
		
		for(int i=0; i<5; i++) {
			int num = 60 + i;
			a.add(num);	
		}
		
		for(int i=0; i<5; i++) {
			int num = 70 + i;
			a.add(num);	
		}
		
		
		int age10=0;
		int age20=0;
		int age30=0;
		int age40=0;
		int age50=0;
		int age60=0;
		int age70=0;
		int age80=0;
		
		
		
		for (Integer integer : a) {
			int i = integer/10;	//확진자.getage()/10;
			if(i == 1) {
				age10++;
			}else if(i == 2) {
				age20++;
			}else if(i == 3) {
				age30++;
			}else if( i ==4 ) {
				age40++;
			}else if( i ==5 ) {
				age50++;
			}else if( i == 6) {
				age60++;
			}else if( i == 7) {
				age70++;
			}else {
				age80++;
			}
		}
		System.out.println("======================");
		System.out.println("나이별 확진자 수");
		System.out.println("10대 : " + age10 + "명");
		System.out.println("20대 : " + age20 + "명");
		System.out.println("30대 : " + age30 + "명");
		System.out.println("40대 : " + age40 + "명");
		System.out.println("50대 : " + age50 + "명");
		System.out.println("60대 : " + age60 + "명");
		System.out.println("70대 : " + age70 + "명");
		System.out.println("80대 : " + age80 + "명");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfirmedByAge cc =new ConfirmedByAge();
		cc.confirmedByAge();
		
		
	}
}
