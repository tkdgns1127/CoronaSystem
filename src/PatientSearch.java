
import java.util.Scanner;

public class PatientSearch {
	Scanner scanner = new Scanner(System.in);

	PatientSearch() {
		System.out.println("환자 검색 메뉴에 들어왔습니다.");
		search();
	}
	
	public void personSearch(String name) {
		//확진자 리스트에서 조회
		for (Person person : Test.infectionList) {
			if (name.equals(person.getName())) {
				System.out.println("이름 : " + person.getName());
				System.out.println("확진여부 : 확진");
				System.out.println("나이 : " + person.getAge());
				System.out.println("번호  : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//치료자 리스트에서 조회
		for (Person person : Cure.treatmentCompletedList) {
			if (name.equals(person.getName())) {
				System.out.println("이름 : " + person.getName());
				System.out.println("확진여부 : 완치");
				System.out.println("나이 : " + person.getAge());
				System.out.println("번호  : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//사망자 리스트에서 조회
		for (Person person : Cure.deathList) {
			if (name.equals(person.getName())) {
				System.out.println("이름 : " + person.getName() + " (사망)");
				System.out.println("나이 : " + person.getAge());
				System.out.println("번호 : " + person.getPhoneNum());
				System.out.println();
			}
		}
		
		//조회 결과가 없다면
		//이거 어떻게 해야되냐
	}

	public void search() {
		String searchname = null;
		System.out.print("이름을 입력하세요. : ");
		searchname = scanner.nextLine();

		System.out.println(searchname + "으로 검색중...");
		System.out.println("====== " +searchname+"님 검색결과 ======");
		personSearch(searchname);
		System.out.println("==========================");
		System.out.println();

		MainSearch mainsearch = new MainSearch();
		mainsearch.start();
		
	}

}
