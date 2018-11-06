package pck_Service;

import java.util.List;
import java.util.Map;

import pck_DTO.MemberVO;
import pck_DTO.MovieVO;
import pck_Database.Database;

public class IServiceImpl implements IService{

	private Database db = new Database();
	@Override
	public void allMemberInfo() {
		db.showmemberlist();
	}
	@Override
	public boolean deleteMemberInfo(Map<String, String> params) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateMemberInfo(Map<String, String> params) {
		boolean result = db.updateMemberInf(params);
		return result;
	}
	

	
	
	// 영화 추가하는 기능
	@Override
	public List<MovieVO> setMovie(MovieVO m) {
		return db.addMovie(m);
	}
	
	// 지금 상영중인 영화 조회
	@Override
	public String AllMovieList() {
		return db.showMovieList();
	}
	
	// 영화의 정보 업데이트
	@Override
	public boolean changeMovieInfo(int movieNum, int selectNum3, String data) {
		boolean result = db.changeMovieInfoT(movieNum, selectNum3, data);
		return result;
	}
	@Override
	public boolean changeMovieInfo(int movieNum, int selectNum3, int data) {
		boolean result = db.changeMovieInfoT(movieNum, selectNum3, data);
		return result;
	}
	
	@Override
	public boolean deleteMovie(int movieNum) {
		return db.removeMovie(movieNum);
	}
	
	
	@Override
	public MovieVO getMovieVO(int index) {
		// TODO Auto-generated method stub
		return db.getMovieVO(index);
	}
}
