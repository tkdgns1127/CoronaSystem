
import java.util.ArrayList;

public class ConfirmedByAge {	// ���̺� Ȯ����
	
	// Ȯ���� ����Ʈ���� ���̴뺰��(10��, 20��, 30��...) ���
	public void confirmedByAge() {
		
		
		int age10=0;
		int age20=0;
		int age30=0;
		int age40=0;
		int age50=0;
		int age60=0;
		int age70=0;
		int age80=0;
		
	
		
		for (Person infection : Test.infectionList) {
			int i = infection.getAge()/10;	//Ȯ����.getage()/10;
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
		System.out.println("���̺� Ȯ���� ��");
		System.out.println("10�� : " + age10 + "��");
		System.out.println("20�� : " + age20 + "��");
		System.out.println("30�� : " + age30 + "��");
		System.out.println("40�� : " + age40 + "��");
		System.out.println("50�� : " + age50 + "��");
		System.out.println("60�� : " + age60 + "��");
		System.out.println("70�� : " + age70 + "��");
		System.out.println("80�� : " + age80 + "��");
		
		//���ư���
		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
	}

	
}
