

public class Day {

	
	
	String day;
	
	boolean res_possibility=true;					//예약가능한지 불가능한지 체크

	Day(String day, boolean resPossibility){		//날짜를 받고 예약가능한지 불가능한지 체크
		this.day = day;
		this.res_possibility = resPossibility;
	}
	
	public boolean isRes_possibility() {
		return res_possibility;
	}

	public void setRes_possibility(boolean res_possibility) {
		this.res_possibility = res_possibility;
	}
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	
}
