package pck_DTO;
/**	
	회원 관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class MemberVO {
	private int memNo;			//pk
	private String name;
	private String memId;		//
	private String password;
	private String juminNum;
	private int memberGrade;	//일반 : 0 , 관리자 : 1
	private String phoneNum;
	
	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return memId;
	}
	
	public void setId(String id) {
		this.memId = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getJuminNum() {
		return juminNum;
	}
	
	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}
	
	public int getMemberGrade() {
		return memberGrade;
	}
	
	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}