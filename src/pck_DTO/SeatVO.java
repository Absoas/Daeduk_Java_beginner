package pck_DTO;
/**	
	좌석 관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class SeatVO {
	private int x_seat;
	private int y_seat;
	private String seatNumber;   //pk
	private long price;
	private String seatGrade;    // A~Z
	private boolean seatState; 	 // true = 자리 예약중 / false = 자리 빔
	
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
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String getSeatGrade() {
		return seatGrade;
	}
	
	public void setSeatGrade(String seatGrade) {
		this.seatGrade = seatGrade;
	}
	
	public boolean isSeatState() {
		return seatState;
	}
	
	public void setSeatState(boolean seatState) {
		this.seatState = seatState;
	}

}
