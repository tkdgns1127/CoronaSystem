
import java.util.Scanner;

public class PatientSearch {

	PatientSearch() {
		search();
		System.out.println("환자 검색 메뉴에 들어왔습니다.");
	}

	public void personSearch(String name) {
		System.out.println("personSearch 메소드 실행");
		// 확진자 리스트에서 조회
//		for (Person person : Test.infectionList) {
//			if (name.equals(person.getName())) {
//				System.out.println("이름 : " + person.getName());
//				System.out.println("확진여부 : 확진");
//				System.out.println("나이 : " + person.getAge());
//				System.out.println("번호  : " + person.getPhoneNum());
//			}
//		}
//
//		// 치료자 리스트에서 조회
//		for (Person person : Cure.treatmentCompletedList) {
//			if (name.equals(person.getName())) {
//				System.out.println("이름 : " + person.getName());
//				System.out.println("확진여부 : 완치");
//				System.out.println("나이 : " + person.getAge());
//				System.out.println("번호  : " + person.getPhoneNum());
//			}
//		}
//
//		// 사망자 리스트에서 조회
//		for (Person person : Cure.deathList) {
//			if (name.equals(person.getName())) {
//				System.out.println("이름 : " + person.getName() + " (사망)");
//				System.out.println("나이 : " + person.getAge());
//				System.out.println("번호  : " + person.getPhoneNum());
//			}
//		}

		// 조회 결과가 없다면 이거 어떻게 해야되냐
		for (Person person1 : Test.infectionList) {
			if (!(name.equals(person1.getName()))) {
				System.out.println("infectionList에 해당 이름 없음");
				for (Person person2 : Cure.treatmentCompletedList) {
					if (!(name.equals(person2.getName()))) {

						for (Person person3 : Cure.deathList) {
							if (!(name.equals(person3.getName()))) {
								System.out.println("검색 결과가 없습니다.");
							
							} else {
								System.out.println("이름 : " + person3.getName() + " (사망)");
								System.out.println("나이 : " + person3.getAge());
								System.out.println("번호  : " + person3.getPhoneNum());
							}
						}

					} else {
						System.out.println("이름 : " + person2.getName());
						System.out.println("확진여부 : 완치");
						System.out.println("나이 : " + person2.getAge());
						System.out.println("번호  : " + person2.getPhoneNum());
					}
				}
				
			} else {
				System.out.println("이름 : " + person1.getName());
				System.out.println("확진여부 : 확진");
				System.out.println("나이 : " + person1.getAge());
				System.out.println("번호  : " + person1.getPhoneNum());
			}
		}

	}

	public void search() {
		Scanner scanner = new Scanner(System.in);

		String searchname = null;
		System.out.print("이름을 입력하세요. : ");
		searchname = scanner.nextLine();

		System.out.println(searchname + "으로 검색중...");
		System.out.println("====== " + searchname + "님 검색결과 ======");
		personSearch(searchname);
		System.out.println("==========================");

		MainSearch mainsearch = new MainSearch();
		mainsearch.start();

	}

}
