package pck_Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import pck_DTO.MemberVO;
import pck_DTO.MovieVO;
import pck_Service.IService;
import pck_Service.IServiceImpl;
import pck_Service.regDemo;

public class View {
	
	private IService service = new IServiceImpl();
	private regDemo pattern = new regDemo();
	
	public void start(){									// 영화예매시작
		while(true){
			System.out.println("영화예매시스템시작");
			System.out.println("----------");
			System.out.println("1.회원용로그인");
			System.out.println("2.관리자용로그인");			
			System.out.println("3.회원가입");
			System.out.println("----------");
			System.out.print("번호입력 : ");
			
			Scanner sc = new Scanner(System.in);
			
			int selectNum = 0;
			try {
				selectNum = sc.nextInt();
			} catch (Exception e) {
				System.out.println("번호를 입력해주세요.");
				continue;
			}
			 
			switch(selectNum){
			case 1 : 
				//memberMenu();
				login();
				break;
			case 2 : 
				Managerment();
				break;
			case 3 :
				join();
				//System.out.println("회원가입메서드 실행");
				break;
			default :
				System.out.println("1~2번호를 선택하세요.");
				break;
			}
		}
	}	
	
	private void memberMenu(){							// 회원용 메뉴
		while(true){
			System.out.println("회원전용메뉴실행");
			System.out.println("----------");
			System.out.println("1.영화예매");
			System.out.println("2.예매조회");
			System.out.println("3.회원정보수정");
			System.out.println("4.로그아웃");
			System.out.println("----------");
			System.out.print("번호입력 : ");
			
			Scanner sc = new Scanner(System.in);
			
			int selectNum = 0;
			try {
				selectNum = sc.nextInt();
			} catch (Exception e) {
				System.out.println("번호를 입력해주세요.");
				continue;
			}
			 
			switch(selectNum){
			case 1 : 
				
				break;
			case 2 :
				System.out.println("예매조회 메서드 실행");
				memberMenu();
				break;
			case 3 :			
				
				break;
			case 4 :
				return;
			default :
				System.out.println("1~5번호를 선택하세요.");
				break;
			}
		}
	}	

	private void Managerment() {
		while (true) {
			System.out.println("관리자메뉴");
			System.out.println("----------------");
			System.out.println("1:매출관리");
			System.out.println("2:상영관 관리");
			System.out.println("3:고객관리");
			System.out.println("4:영화관리");
			System.out.println("5:로그아웃");
			System.out.println("입력해주세요");
			Scanner sc = new Scanner(System.in);
			int Manger = sc.nextInt();
			switch (Manger) {
				
			case 1:
				saleManagerV();// 매출관리 메서드 호출
				break;
				
			case 2:
				ScreenManagerV();// 상영관관리메서드
				break;
				
			case 3:
				CustomerMangerV();// 고객관리메서드
				break;
					
			case 4:
				MovieManagerV();// 영화관리메서드
				break;

			case 5:
				start();// 로그아웃
				break;
				
			default:
				System.out.println("ERROR) 1~4번을 선택할 수 있습니다.");
				continue;
			}				
		}			
	}

		//매출관리 메서드 호출
	private void saleManagerV() {

		while (true) {
			System.out.println("--매출관리--");
			System.out.println("1:총매출확인");
			System.out.println("2:선호도조사");
			System.out.println("3:뒤로가기");
			Scanner sc = new Scanner(System.in);
			int manager = sc.nextInt();
			switch (manager) {
			
			case 1:
				TotalSales(); // TotalSales(); 총매출 메서드
				break;
					
			case 2:
				MovieResearch(); // MovieResearch(); 선호도 조사
				break;
					
			case 3:
				Managerment(); // 뒤로가기
				break;

			default:
				System.out.println("ERROR) 1~3번을 선택할 수 있습니다.");
				continue;
			}
		}		
	}

	// 상영관관리메서드
	private void ScreenManagerV() {
		while (true) {
			System.out.println("--상영관 관리--");
			System.out.println("1:상영관 좌석 조회");
			System.out.println("2:뒤로가기");

			Scanner sc = new Scanner(System.in);
			int manager = sc.nextInt();
			switch (manager) {
			case 1:
				TheaterManager(); // TheaterManager(); 상영관 좌석 조회
				break;
					
			case 2:
				Managerment(); // 뒤로가기
				break;
						
			default:
				System.out.println("ERROR) 1~2번을 선택할 수 있습니다.");
				continue;
			}
		}
	}
			
	//고객관리메서드
	private void CustomerMangerV() {
		while (true) {
			System.out.println("-- 고객 관리 --");
			System.out.println("1: 회원 정보 조회");
			System.out.println("2: 회원 정보 수정 ");
			System.out.println("3: 회원 정보 삭제");
			System.out.println("4: 고객 예약 정보");
			System.out.println("5: 뒤로 가기");

			Scanner sc = new Scanner(System.in);
			int manager = sc.nextInt();
			switch (manager) {
						
			case 1:
				CustomerInfo(); // CustomerInfo(); 회원 정보
				break;
						
			case 2:
				EditCustomer(); // EditCustomer(); 회원 수정
				break;
						
			case 3:
				DeleteCustomer(); // DeleteCustomer(); 회원삭제
				break;

			case 4:
				CusReservationInfo(); // CusReservationInfo(); 고객 예약 정보
				break;
				
			case 5:
				Managerment(); // 뒤로가기
				break;

			default:
				System.out.println("ERROR) 1~4번을 선택할 수 있습니다.");
				continue;

			}
		}	
	}
	
	// 영화관리메서드
	private void MovieManagerV() {
		while (true) {
			System.out.println("-- 영화 관리 --");
			System.out.println("1: 영화 정보 ");
			System.out.println("2. 영화 추가");
			System.out.println("3: 영화 수정 ");
			System.out.println("4: 영화 삭제 ");
			System.out.println("5: 뒤로 가기");

			Scanner sc = new Scanner(System.in);
			int manager = sc.nextInt();
			switch (manager) {
			
			case 1:
				MovieInfo();
				break;
				
			case 2:
				AddMovie();
				break;

			case 3:
				EditMovie(); 
				break;

			case 4:
				DeleteMovie();
				break;

			case 5:
				return;

			default:
				System.out.println("ERROR) 1~4번을 선택할 수 있습니다.");
				continue;

			}
		}
	}	
				
	//-----------------------------------------------------------------------------------로그인 및 회원가입			
	private void login(){
		MemberVO memberInfo = new MemberVO();
			
		while(true){
			System.out.print("\nid를 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			String memId = sc.next();
			System.out.print("비밀번호를 입력해주새요 : ");
			String passward = sc.next();
				
			Map<String, String> params = new HashMap<String, String>();
			params.put("memId", memId);
			params.put("passward", passward);
				
				
			if(true){
				System.out.println("님 환영합니다~!");
			} else{
				System.out.println("존재하지 않는 회원입니다.");
			}
		}
	}
		
	private void join(){
		//회원가입을 위한 메서드
		//memList에 add.
		//정규식
		//return타입은 필요에 의해 바꿀수있음.
	}
	//-----------------------------------------------------------------------------------
		
		
		
		
//		--------------------------------------------------------------------------------영화예매
	private void selectMovie(){
		//영화선택을 위한 메서드
		//movieList에서 name만 끌어와서 출력.
		//숫자입력으로 해당하는 값을 인자값으로하여 movieinfo()호출
	}
		
	private void movieInfo(){	//매개변수존재
		//영화정보와 예매유무를 묻는 메서드
		//인자값으로 받은 movieList에 있는 모든 정보를 read
		//
	}
	
	private void selectDate(){  //매개변수존재
		//회원정보 및 선택한 영화를 인자로 하여 해당 영화의 날짜정보를 보여주는 메서드
		//인자값으로 받은채로 다음메서드 인자로 사용.
	}
		
	private void selectScreen(){	//매개변수존재
		//해당 영화에 날짜에 해당하는 상영관과 해당 상영관의 시간을 보여주는 메서드
		//상영관 선택(입력받은 번호) 후 시간 선택(두번째 입력받은 번호) 가능
		//
	}
				
	private void selectSeat(){	//매개변수존재
		//SeatList를 보여주는 메서드를 호출하여 선택하게 하는 메서드
		//SeatID를 선택하여 결제창메서드 호출
		//회원.영화.날짜.상영관.시간.SeatID를 인자값으로 사용
	}
		
	private void pay(){	//매개변수존재
		//해당영화이름, 가격만을 보여주며 결제를 묻는 메서드		
	}
		
	private void payInfo(){ //매개변수존재
		//예약번호를 기준으로 모든정보를 보여주며 확인 시 회원메뉴로 돌아감.
	}
	
		
	
	
	
	
	/**
	 * -----------------매출관리-----------------
	 */
		
			
	private void TotalSales() {
//		 총매출 메서드 
//		 지금까지의 총 매출을 출력하는 메서드이다.
		
	}
		 
	private void MovieShare() {
//		 영화 점유율
			
	//  각 영화의 좌석을 카운팅
	//   
			
	}
	private void MovieResearch() {

//			 선호도 조사	
//		영화별 선호도를 조사 
	//	
			
			
	}
		
		

		/**
		 * --------------상영관 관리---------- 
		 */
		
	private void TheaterManager() {

//	 		상영관 좌석 조회
//		      상영관별 좌석을 볼 수 있는 
//		      상영관별 id를 인자값으로 받는다
			
	}

		
		/**
		 *  ------------고객관리----------------
		 */
		
		// 회원 정보
	private void CustomerInfo() {

//	 		id, name을 맵 형식으로 인자값을 받는다.
//		      반환타입  boolean으로 해서 true이면 정보 조회
//								false이면 없는 정보 출력
		service.allMemberInfo();
			
	}
		

		// 회원 수정
	private void EditCustomer() {
//			 id,name
//			 sql
//			 boolean updateMemberInfo(Map<String,String> params);
			/*
			 * 맵객체 만들어서
			 */
//			boolean result = service.updateMemberInfo(params);
//			if (result) {
//				System.out.println("정상적으로 수정되었습니다.");
//			} else {
//				System.out.println("수정실패");
//			}
	}

	// 회원 삭제
	private void DeleteCustomer() {
//	 	id, name을 맵 형식으로 인자값을 받는다.
//		    반환타입  boolean으로 해서 true이면 회원 정보 삭제
//						false이면 없는 정보 출력

	}
	// 고객 예약 정보
	private void CusReservationInfo() {

//	지금 현재 상영관별로 예약 한 고객들의 id를 출력하는 메서드이다.

	}

		
	
	/**
	 *  ------------영화관리----------------
	 *  
	 *  -- id관리 필요
	 */
	
	private void AddMovie(){
//      영화 추가하는 메서드
//		영화에 대한 정보
		
		String name="";
		String genre="";
		int time =0;
		int grade = 0;
		int price =0;
		
		while(true){
			MovieVO m = new MovieVO();
			
			
			//번호 자동추가 되게끔 하면서
//			//8개 이상 초과 x
//			while (true) {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("영화 번호를 입력해주세요 : ");
//				num = sc.nextInt();
//				break;
//			}
			
			//영화제목 입력 정규식
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 제목을 입력해주세요 : ");
				name = sc.next();
				break;
			}
			
			//영화시간 입력 정규식
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 시간을 입력해주세요: check) 분 단위로 숫자를 입력해주세요");
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					time = sc.nextInt();
				} catch (Exception e) {
					System.out.println("번호를 입력해주세요.");
					continue;
				}
				
				break;
			}
			
			//영화장르 입력 정규식
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 장르을 입력해주세요 : ");
				genre = sc.next();
				break;
			}

			// 영화등급 입력 정규식
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 등급을 입력해주세요 : ");
				System.out.println("(1)전체관람가  (2)15세 관람가 (3)청소년 관람불가 ");
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					grade = sc.nextInt();
				} catch (Exception e) {
					System.out.println("번호를 입력해주세요.");
					continue;
				}

				break;
			}
			
			//영화가격 입력 정규식
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 가격을 입력해주세요 : ");
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					price = sc.nextInt();
				} catch (Exception e) {
					System.out.println("번호를 입력해주세요.");
					continue;
				}
				break;
			}
			
			
			m.setPrice(price);
			m.setGrade(grade);
			m.setMovieTime(time);
			m.setGenre(genre);
			m.setMovieName(name);
		
			service.setMovie(m);
			System.out.println("추가되었습니다.");
			break;
					
		}
	}
		
	// 영화의 모든 리스트 출력
	private void MovieInfo() {
		System.out.println(service.AllMovieList());
	}

		
	// 상영하는 영화 수정
	private void EditMovie() {
		MovieVO m = new MovieVO();
		if(service.AllMovieList().equals("")) {
			System.out.println("회원이 없습니다.");
			return;
		}
		
		System.out.println(service.AllMovieList());
		
		int index = 0;	// 수정할 영화의 번호
		while(true) {
			System.out.println("수정할 영화 번호 선택");
			Scanner scan02 = new Scanner(System.in);
			
			try {
				index = scan02.nextInt();
				m = service.getMovieVO(index-1);
				break;
			} catch (Exception e) {
				System.out.println("번호를 다시 입력해주세요.");
				continue;
			}
		}
		
		String data1 = "";		// name, genre
		int data2 = 0;			// price, time, grade
		int changeNum = 0;
		while (true) {
			System.out.println("  " + m.getMovieNum() + "번째의 영화정보 수정");
			System.out.print("---------------------------------------");
			System.out.println("---------------------------------------");
			System.out.println(""
					+ " (1)영화 이름 : \t" + m.getMovieName()
					+ "\n (2)영화 상영 시간 : \t" + m.getMovieTime()
					+ "\n (3)영화 장르 : \t" + m.getGenre()
					+ "\n (4)영화 등급 : \t" + m.getGrade()
					+ "\n (5)영화 가격 : \t" + m.getPrice() );
					
			System.out.print("번호 입력 :");
			Scanner scan03 = new Scanner(System.in);
			
			//0730 t-c로 번호만 입력받게 오류 처리
			try {
				changeNum = scan03.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("번호를 입력해주세요.");
				continue;
			}
		}
		
		switch (changeNum) {
		//정규식 전체적으로 추가
		
		case 1: // 영화 이름 변경
			while (true) { 
				Scanner sc = new Scanner(System.in);
				System.out.print("영화 이름 : ");
				data1 = sc.next();
				boolean b = service.changeMovieInfo(index, changeNum, data1);
				//price
				if(b){
					System.out.println("수정완료.");
					break;
				}else{
					System.out.println("수정실패");
				}
			}

			break;
			
		case 2: // 영화 시간 변경
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("영화 상영 시간 : check) 분 단위로 숫자를 입력해주세요" );
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					data2 = sc.nextInt();	
				} catch (Exception e) {
					System.out.println("숫자를 입력해주세요");
				}
				boolean b = service.changeMovieInfo(index, changeNum, data2);
				//시간
				if(b){
					System.out.println("수정완료.");
					break;
				}else{
					System.out.println("수정실패");
				}
				break;
			}
			break;
			
		case 3: // 영화 장르 변경
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("영화 장르 : ");
				data1 = sc.next();
				boolean b = service.changeMovieInfo(index, changeNum, data1);
				//ganre
				if(b){
					System.out.println("수정완료.");
					break;
				}else{
					System.out.println("수정실패");
				}
			}
			break;
			
		case 4: // 영화 등급 변경
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("영화 등급을 입력해주세요 : ");
				System.out.println("(1)전체관람가  (2)15세 관람가 (3)청소년 관람불가 ");
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					data2 = sc.nextInt();	
				} catch (Exception e) {
					System.out.println("숫자를 입력해주세요");
				}
				//0730 다른 거 입력하면 continue 
				switch (data2) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("잘못 선택하셨습니다.");
					continue;
				}
				boolean b = service.changeMovieInfo(index, changeNum, data2);
				//grade
				if(b){
					System.out.println("수정완료.");
					break;
				}else{
					System.out.println("수정실패");
				}
			}
			break;
			
		case 5: // 영화 가격 변경
			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.print("영화 가격 : ");
				
				//0730 t-c로 번호만 입력받게 오류 처리
				try {
					data2 = sc.nextInt();	
				} catch (Exception e) {
					System.out.println("숫자를 입력해주세요");
					continue;
				}
				boolean b = service.changeMovieInfo(index, changeNum, data2);
				//price
				if(b){
					System.out.println("수정완료.");
					break;
				}else{
					System.out.println("수정실패");
				}
			}
			break;	
		default:
			break;
		}
	}
	
	// 영화 상영 중지 
	private void DeleteMovie() {
		if (service.AllMovieList().equals("")) {
			System.out.println("중지할 영화가 없습니다.");
		}
		System.out.println(service.AllMovieList());
		System.out.println("삭제할 영화 번호 선택");
		Scanner sc = new Scanner(System.in);
		int index = 0;
		
		while (true) {
			try {
				index = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("번호를 다시 입력해주세요.");
				continue;
			}
		}
		if (service.deleteMovie(index)) {
			System.out.println("영화 상영 중지");
		} else {
			System.out.println("실패. 다시 입력바랍니다.");
		}
	}

	private void updateMemberPw(){	//매개변수존재
		//인자값에 해당하는 비밀번호수정
	}
	
	private void updateMemberPNumber(){	//매개변수존재
		//인자값에 해당하는 폰번호수정
	}
}
//-----------------------------------------------------------------------------------------
		
//--------------------영만쌤예시---------------------------------------------------------	
//	회원 수정
//	private void EditCustomer() {
//		//id,name
//		//sql
//		//boolean updateMemberInfo(Map<String,String> params);
//		/*
//			맵객체 만들어서 
//		
//		*/
//		boolean result = service.updateMemberInfo(params);
//		if(result){
//			System.out.println("정상적으로 수정되었습니다.");
//		}else{
//			System.out.println("수정실패");
//		}
//	}

	
	
	
	
	
	
	
	

