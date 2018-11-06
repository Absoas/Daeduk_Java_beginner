package pck_DTO;
/**	
	상영관 관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class ShowScreenVO {
	private int screenNo;		//pk
	private int x_seat;
	private int y_seat;
	private String seatNumber;   //좌석 pk
	
	public int getScreenNo() {
		return screenNo;
	}
	
	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}
	
	public int getX_seat() {
		return x_seat;
	}
	
	public void setX_seat(int x_seat) {
		this.x_seat = x_seat;
	}
	
	public int getY_seat() {
		return y_seat;
	}
	
	public void setY_seat(int y_seat) {
		this.y_seat = y_seat;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
