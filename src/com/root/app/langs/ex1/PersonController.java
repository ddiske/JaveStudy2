package com.root.app.langs.ex1;

import java.util.Scanner;

public class PersonController {
	
	public void start() {
//		1. 주소록 초기화 - init 호출
//		2. 주소록 출력
//		3. 검색(이름, PathInfo.find()) - 이름 입력 시 일치하는 정보 출력
//		4. 주소록 정보 추가(PathInfo.add())
//		5. 주소록에서 삭제(이름으로 검색 후 삭제 PathInfo.delete())
//		6. 종료
		
		Scanner sc = new Scanner(System.in);
		PersonView pv = new PersonView();
		PersonInfo pi = new PersonInfo();
		
		
		System.out.println("1.주소록 초기화 2.주소록 출력 3.검색 4.추가 5.삭제 6.종료");
		boolean check = false;
		Person [] persons = null;
		
		while(check = true) {
			int in = sc.nextInt();
			if(in == 1) {
				persons = pi.init();
				System.out.println("정보를 초기화합니다");
			}else if(in == 2) {
				System.out.println("전부 출력합니다");
				pv.view(persons);
			}else if(in == 3) {
				Person person = pi.findByName(persons, sc);
				if(person != null) {
					pv.view(person);					
				}else {
					System.out.println("검색 결과가 없습니다");
				}
			}else if(in == 4) {
				System.out.println("추가");
				persons = pi.add(persons, sc);
			}else if(in == 5) { 
				System.out.println("삭제");
			}else if(in == 6) {
				System.out.println("종료합니다");
				check = !check;
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
			System.out.println("1.주소록 초기화 2.주소록 출력 3.검색 4.추가 5.삭제 6.종료");
			
		}
		
		
		
		
		
	}
	

}
