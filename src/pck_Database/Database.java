package pck_Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pck_DTO.MemberVO;
import pck_DTO.MovieVO;
import pck_DTO.ReservationVO;
import pck_DTO.SeatVO;
import pck_DTO.ShowScreenVO;
import pck_DTO.ShowingVO;

/**	
	DB관련 
*/

public class Database {
	
	//영화의 Id 자동증가하게끔 만듦
	static int movieNum  = 1;
	
	// VO값 관리용 List 선언 
	private List<MemberVO>  memberList = new ArrayList<MemberVO>();
	private List<MovieVO>   movieList = new ArrayList<MovieVO>();
	private List<ReservationVO> reservationList = new ArrayList<ReservationVO>();
	private List<SeatVO>  seatList = new ArrayList<SeatVO>();
	private List<ShowingVO>  showingList = new ArrayList<ShowingVO>();
	private List<ShowScreenVO>  showscreenList = new ArrayList<ShowScreenVO>();
	
	public Database() {
		
		//관리자용 db생성
		MemberVO admin = new MemberVO();
		admin.setName("Manager");
		admin.setId("Manager");
		admin.setJuminNum("1234567");
		admin.setPassword("Manager");
		admin.setMemberGrade(1);
		admin.setPhoneNum("00000000000");
		
		memberList.add(admin);
		//테스트회원 생성
		MemberVO membert = new MemberVO();
		membert.setName("test");
		membert.setId("test");
		membert.setJuminNum("123132");
		membert.setPassword("test");
		membert.setMemberGrade(1);
		membert.setPhoneNum("test");
		
		memberList.add(membert);
		
		
		//기본 영화 생성
		MovieVO fMovie = new MovieVO();
		fMovie.setMovieNum(movieNum++);
		fMovie.setMovieName("괴물");
		fMovie.setMovieTime(90);
		fMovie.setGrade(1);
		fMovie.setGenre("호러");
		fMovie.setPrice(5000);
		
		movieList.add(fMovie);
		
	}
	
	
	
	/**
	 * 	 전체회원목록 조회
	 */
	public void showmemberlist(){
		for (int i = 0; i < memberList.size(); i++) {
			
			System.out.println("ID:"+memberList.get(i).getId()+"이름:"+memberList.get(i).getName()+"비밀번호:"+memberList.get(i).getPassword()+
					"주민번호:"+memberList.get(i).getJuminNum()+"등급:"+memberList.get(i).getMemberGrade()+"전화번호:"+memberList.get(i).getPhoneNum());
			
		}
	}

	/**
	 * 	 회원정보수정 (이름)
	 */
	public boolean updateMemberInf(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_name = params.get("mem_name");
		boolean result = false;
		for (int i = 0; i < memberList.size(); i++) {
			if(mem_id == memberList.get(i).getId()){
				memberList.get(i).setName(mem_name);
				result = true;
			}
		}
		return result;
	}
	
	/**
	 * 해당번째 영화 반환
	 */
	public MovieVO getMovieVO(int index) {
		MovieVO m = null;
		if (movieList.get(index) != null) {
			m = movieList.get(index);
		}

		return m;
	}


	

	/**
	 * 모든 영화 리스트 출력
	 */
	public String showMovieList(){
		String str = "";
		String grade = "";
		
		
		for(int i = 0; i< movieList.size(); i++){
			switch (movieList.get(i).getGrade() ) {
			case 1:
				grade = "전체관람가";
				break;
			case 2:
				grade = "15세 관람가";
				break;
			case 3:
				grade = "19세 관람가";
				break;

			default:
				break;
			}
			
			str += 	" 영화 번호 : "+ movieList.get(i).getMovieNum() + "\n"+  
					" 영화 이름 : "+ movieList.get(i).getMovieName()+ "\n"+
					" 영화 상영 시간 : " + movieList.get(i).getMovieTime() + "분 \n"+
					" 영화 등급 : "+ grade + "\n"+
					" 영화 장르 : "+ movieList.get(i).getGenre()+ "\n"+
					" 영화 가격 : "+ movieList.get(i).getPrice() +"원\n"+
					"---------------------------------\n";
						
		}	
		return str;
	}
	
	/**
	 * 영화 추가
	 */
	public List addMovie(MovieVO m){
		m.setMovieNum(movieNum++);
		movieList.add(m);
		return movieList;
	}
	
	/**
	 * 0730
	 *  영화 정보 수정
	 *  오버로딩 changeMovieInfoT  
	 *  name, genre 바꿀 때 
	 */
	public boolean changeMovieInfoT(int movieNum, int selectNum3,
			String data) {
		boolean result = false;

		int index = 0;
		
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getMovieNum() == movieNum) {
				index = i;
				break;
			}
		}
		
		try {
			switch (selectNum3) {
			case 1:
				movieList.get(index).setMovieName(data);
				result = true;
				break;
			case 3:
				movieList.get(index).setGenre(data);
				result = true;
				break;
			default:
				result = false;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * 0730
	 *  영화 정보 수정
	 *  오버로딩 changeMovieInfoT 
	 *  time, grade, price 바꿀 때
	 */
	
	public boolean changeMovieInfoT(int movieNum, int selectNum3,int data) {
		boolean result = false;

		int index = 0;
		
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getMovieNum() == movieNum) {
				index = i;
				break;
			}
		}
		
		try {
			switch (selectNum3) {
			case 2:
				movieList.get(index).setMovieTime(data);
				break;
			case 4:
				movieList.get(index).setGrade(data);
				break;
			case 5:
				movieList.get(index).setPrice(data);
				break;
			default:
				break;
			}
			result = true;
		} catch (Exception e) {
			
		}

		return result;
	}

	/**
	 * 영화 정보 삭제
	 */
	
	public boolean removeMovie(int index) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getMovieNum() == index) {
				index = i;
				break;
			}
		}
		boolean result;
		try {
			movieList.remove(index);
			result = true;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
