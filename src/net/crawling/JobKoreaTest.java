package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobKoreaTest {

	public static void main(String[] args) {
		// 잡코리아에서 frontend 검색 후
		// 3 페이지에 있는 회사명 크롤링 하기
		try {
			//1) URL 정보
			String URL="http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			
			//2) 검색어
			String KEYWORD = "frontend";
			
			//3) 요청페이지
			int PAGE=3;
			
			//4) 파라미터
			String params="";
			params += "pageType=GI";
			params += "&stext="+KEYWORD;
			params += "&pageSize=10";
			params += "&ord=1";
			params += "&IsCoInfoSC=false";
			params += "&IsRecruit=false";
			params += "&page="+PAGE;
			params += "&Order=1";
			//System.out.println(params);
			
			//5) HTML 문서 내용 가져오기
			Document doc=Jsoup.connect(URL+params).get();
			//System.out.println(doc.toString());
			
			//6) 요소별 접근
			//<li>
			//Elements elements=doc.select("li");
			//<ul class=detailList>
			//Elements elements=doc.select(".detailList li");
			//<div class=list>
			//Elements elements=doc.select(".list .detailList li");
			//<article id="smGiList">
			Elements elements=doc.select("#smGiList .list .detail li");
			for(Element element:elements) {
				System.out.println(element.text());
			}//for end
			
			
			
			
		}catch(Exception e) {
			System.out.println("크롤링 실패");
		}

	}//main end

}//class end
