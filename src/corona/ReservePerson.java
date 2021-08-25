package corona;

public class ReservePerson extends Person {
	
	private int dayNum; // 날짜
	private int Seattype; // 자리타입
	
	
	ReservePerson(){
		System.out.println("예약자 생성");
	}
	
	public int getDayNum() {
		return dayNum;
	}
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	public int getSeattype() {
		return Seattype;
	}
	public void setSeattype(int seattype) {
		Seattype = seattype;
	}
	
	
	
	
}
