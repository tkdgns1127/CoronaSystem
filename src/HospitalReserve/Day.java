package HospitalReserve;

public class Day {

	
	
	String day;
	
	boolean res_possibility=true;

	Day(String day, boolean resPossibility){
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
