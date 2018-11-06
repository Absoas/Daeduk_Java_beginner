package pck_Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**	
 	정규식 임시
*/
public class regDemo {

	//이메일
	// [0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
	// ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
	// ^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$


	
	//아이디
	// /[^A-z|0-9]/g
	
	//비밀번호(영문,숫자,특수기호)
	// /[^A-z|0-9]/g
	
	
	
	
	// 영화의 상영시간 패턴 검사 HH24:MM 형식이어야 한다.
	public boolean regMovieTime(String movieTime) {
		Pattern p = Pattern
				.compile("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$");

		Matcher m = p.matcher(movieTime);

		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}

}
