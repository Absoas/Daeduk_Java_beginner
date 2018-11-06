package pck_DTO;
/**	
	예매 관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class ReservationVO {
	private int reservNum;	//pk, +1씩 증가처리 필요
	private int memNo;		//회원 pk
	private int showNum;	//상영 pk
	
	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	public int getReservNum() {
		return reservNum;
	}
	
	public void setReservNum(int reservNum) {
		this.reservNum = reservNum;
	}
	
	public int getShowNum() {
		return showNum;
	}
	
	public void setShowNum(int showNum) {
		this.showNum = showNum;
	}
	
	
}
