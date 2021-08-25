
import java.util.ArrayList;
import java.util.Scanner;

public class Join {
	
	static ArrayList<Membership> member = new ArrayList<Membership>();
	
	public void join() {

		int hospital_num = 1111;
		int unique_num;
		String name;
		String id;
		String pw;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("병원 고유 변호 :");
		unique_num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("이름 : ");
		name = sc.nextLine();
		
		System.out.println("아이디 : ");
		id= sc.nextLine();
		
		System.out.println("비밀번호 : ");
		pw = sc.nextLine();
		

	
		if(unique_num != hospital_num) {
			System.out.println(" 병원 고유 번호가 다릅니다.");
			System.out.println(" 다시 출력");
		}else {
			
			member.add(new Membership(unique_num,name, id, pw));
			System.out.println(name+"님 회원가입을 성공하였습니다.");
		}

	}

	public static ArrayList<Membership> getMember() {
		return member;
	}

	public static void setMember(ArrayList<Membership> member) {
		Join.member = member;
	}

	
	


}
