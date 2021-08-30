
public class Reservelist extends Person{ // 예약자리스트

	/*
	 * ArrayList<String> reserveName = new ArrayList<String>(); //이름리스트
	 * ArrayList<String> gender = new ArrayList<String>(); // 성별리스트
	 * ArrayList<Integer> phoneNum = new ArrayList<Integer>(); //전화번호리스트
	 * ArrayList<Integer> age = new ArrayList<Integer>(); // 나이리스트
	 */

	private String name; // 예약자 이름
	private String gender; // 성별
	private String phoneNum; // 전화번호
	private int age; // 나이
	private String dayNum; // 예약날짜
	private String seattype; // 자리타입
	

	public Reservelist(String name, String gender, String phoneNum, int age, String dayNum, String seattype) { // 생성자
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.age = age;
		this.dayNum = dayNum;
		this.seattype = seattype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDayNum() {
		return dayNum;
	}

	public void setDayNum(String dayNum) {
		this.dayNum = dayNum;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
}
