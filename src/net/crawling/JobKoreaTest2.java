package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobKoreaTest2 {

	public static void main(String[] args) {
		try {
			String URL="http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			String KEYWORD = "frontend";
			int PAGE=3;
			
			for(PAGE=1; PAGE<=3; PAGE++) {
				String params="";
				params += "pageType=GI";
				params += "&stext="+KEYWORD;
				params += "&pageSize=20";
				params += "&ord=1";
				params += "&IsCoInfoSC=false";
				params += "&IsRecruit=false";
				params += "&page="+PAGE;
				params += "&Order=1";
				Document doc=Jsoup.connect(URL+params).get();
				Elements elements=doc.select("#smGiList .list .detailList li .corpName");
				for(Element element:elements) {
					System.out.println(element.text());
				}//for end
				System.out.println("------------------------------------------");
			}//for end
			
			
		}catch(Exception e) {
			System.out.println("크롤링 실패");
		}

	}//main end

}//class end
