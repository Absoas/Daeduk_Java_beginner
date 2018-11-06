package pck_DTO;
/**	
 	영화 관련
*/
/*
 * VO (Value Object)
 * 구성 : 변수, getter,setter
 * 이후 메서드 생성 시 메서드 안에서 VO의 객체를 생성, setter 이용하여 객체 안에 값을 담고, 리스트에 담는다.
 * */
public class MovieVO {
	private int movieNum;		//pk
	private String movieName;   //
	private int price;
	private int movieTime;	//영화 상영시간
	private String genre;		//영화 장르
	private int grade;		//영화 상영등급
								// 0 전체 
								// 1 15세
								// 2  청소년 관람불가
	
	
	public String getGenre() {
		return genre;
	}

	public int getMovieNum() {
		return movieNum;
	}

	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getMovieTime() {
		return movieTime;
	}
	
	public void setMovieTime(int movieTime) {
		this.movieTime = movieTime;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
