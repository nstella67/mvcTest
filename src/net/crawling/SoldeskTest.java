package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SoldeskTest {

	public static void main(String[] args) {
		// 솔데스크 공지사항 제목 크롤링하기
		try {
			String URL="http://soldesk.com/board/board_bagic/board_list.asp?scrID=0000000173&pageNum=9&subNum=1&ssubNum=1?";
			for(int page=1; page<=2; page++) {
				String params="";
				params += "page="+page;
				params += "&bd_num=&act=list&s_string=";
				
				Document doc=Jsoup.connect(URL+params).get();
				//Elements elements=doc.select(".td_left");
				Elements elements=doc.select(".table.t_sty01 .td_left");	//같은 표현
				
				for(Element element: elements) {
					System.out.println(element.text());
				}//for end
				System.out.println(page+" 페이지");
				System.out.println();
			}//for end
			
		}catch(Exception e) {
			System.out.println("크롤링 실패");
		}

	}//main() end

}//class end
