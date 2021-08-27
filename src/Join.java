
import java.util.ArrayList;
import java.util.Scanner;


public class Join {
	
	//static ArrayList<Membership> member = new ArrayList<Membership>();
	
	public void join(Hospital01 hospital) {

		
		int hospital_num = hospital.getUnique_num();
		int unique_num;
		String name;
		String id;
		String pw;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("병원 고유 변호 :");
		unique_num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("아이디 : ");
		id= sc.nextLine();
		
		System.out.print("비밀번호 : ");
		pw = sc.nextLine();
		

	
		if(unique_num != hospital_num) {
			System.out.println("병원 고유번호 확인 : " + hospital_num);//병원고유번호확인
			System.out.println(" 병원 고유 번호가 다릅니다.");
			System.out.println(" 회원가입을 다시 해주세요.");
			join(hospital);
		}else {
			
			hospital.member.add(new Membership(unique_num,name, id, pw));
			System.out.println(name+"님 회원가입을 성공하였습니다.");
		}
		
		Login login = new Login();
		login.loginstart(hospital);

	}

	/*public static ArrayList<Membership> getMember() {
		return hospital.member;
	}
	public static void setMember(ArrayList<Membership> member) {
		Join.member = member;
	}*/

	
	


}
