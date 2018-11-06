package pck_DTO;
/**	
 	상영관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class ShowingVO {
	private int showNum = 0;	//pk
	private String startTime;   //상영시작시간 
	private String endTime;     //상영종료시간 
	private int movieNum;		//영화 pk
	
	public int getShowNum() {
		return showNum;
	}
	
	public void setShowNum(int showNum) {
		this.showNum = showNum;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getMovieNum() {
		return movieNum;
	}

	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}

	
	
}
