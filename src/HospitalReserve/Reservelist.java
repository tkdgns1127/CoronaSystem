package HospitalReserve;

public class Reservelist { //�����ڸ���Ʈ
	
	/*ArrayList<String> reserveName = new ArrayList<String>(); //�̸�����Ʈ
	ArrayList<String> gender = new ArrayList<String>(); // ��������Ʈ
	ArrayList<Integer> phoneNum = new ArrayList<Integer>(); //��ȭ��ȣ����Ʈ
	ArrayList<Integer> age = new ArrayList<Integer>(); // ���̸���Ʈ*/
	
	private String name; 		//������ �̸�
	private String gender; 		//����
	private int phoneNum; 		//��ȭ��ȣ
	private int age; 			//����
	private int dayNum;			//���೯¥
	private String seattype;	//�ڸ�Ÿ��
	
	public Reservelist(String name, String gender, int phoneNum, int age, int dayNum, String seattype) { //������
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
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDayNum() {
		return dayNum;
	}
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	public String getSeattype() {
		return seattype;
	}
	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
}
