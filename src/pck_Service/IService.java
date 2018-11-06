package pck_Service;

import java.util.List;
import java.util.Map;

import pck_DTO.MemberVO;
import pck_DTO.MovieVO;

public interface IService {
	/**
	 * 관리자가 총매출과 점유율을 보기위한 메서드
	 */
	
	/**
	 * 관리자가 회원의 정보를
	 * <회원전체조회,삭제,수정>을 위한 메서드
	 * 멤버의 정보를 수정하기 위한 메서드
	 * @param params 
	 * @return
	 */
	//모든 회원의 정보를 가져오기 위한 메서드
	void allMemberInfo();
	//회원의 id와 이름이 일치하는 회원의 정보를 수정하기위한 메서드
	boolean updateMemberInfo(Map<String,String> params);
	//회원의 id와 이름이 일치하는 회원의 정보를 삭제하기위한 메서드
	boolean deleteMemberInfo(Map<String,String> params);
	
	
	
	
	/**영화 추가 메서드 
	 */
	List<MovieVO> setMovie(MovieVO m);
	
	/**영화의 정보를 불러오기 위한 메서드 
	 */
	String AllMovieList();
	
	/**영화 정보 수정 String
	 */
	public boolean changeMovieInfo(int movieNum , int selectNum3,String data);
	
	/**영화 정보 수정 String
	 */
	
	public boolean changeMovieInfo(int movieNum , int selectNum3,int data);
	
	/**영화 정보 삭제
	 * 
	 */
	public boolean deleteMovie(int movieNum);
	
	/**영화의 index를 입력받아 그 index에 해당하는 영화에 대한 정보 반환
	 */
	public MovieVO getMovieVO(int index);
	

}
