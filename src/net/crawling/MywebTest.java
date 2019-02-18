package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MywebTest {

	public static void main(String[] args) {
		// myweb 프로젝트 게시판 크롤링 하기
		
		try {
			//1) URL 선언
			String URL="http://172.16.10.8:9090/myweb/index.jsp";
			
			//2) index.jsp의 HTML 문서 내용 가져오기
			//		→ 웹브라우저의 페이지 소스보기와 동일
			Document doc=Jsoup.connect(URL).get();	//return형 : Document
			
			//3) 가져온 2)의 내용 출력하기
			//System.out.println(doc.toString());
			//System.out.println(doc.text());
			System.out.println(doc.title());
			System.out.println(doc.body());
			
		}catch(Exception e) {
			System.out.println("크롤링 실패");
		}

	}//main() end

}//class end
