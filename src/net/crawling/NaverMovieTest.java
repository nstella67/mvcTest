package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovieTest {

	public static void main(String[] args) {
		try {
			String URL="https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?";
			int PAGE=3;
			boolean FALSE=false;
			
			for(PAGE=1; PAGE<=3; PAGE++) {
				String params="";
				params += "code=167651";
				params += "&type=after";
				params += "&isActualPointWriteExecute="+FALSE;
				params += "&isMileageSubscriptionAlready="+FALSE;
				params += "&isMileageSubscriptionReject="+FALSE;
				params += "&page="+PAGE;
				Document doc=Jsoup.connect(URL+params).get();
				//Elements elements=doc.select(".score_reple p");
				Elements elements=doc.select(".score_reple");
				//class=ico_viewer 요소 제거하기
				elements.select(".ico_viewer").remove();
				
				for(Element element:elements) {
					System.out.println("- "+element.text());
				}//for end
				System.out.println("-------------------------------------------------------------------------------");
			}//for end
			
			
		}catch(Exception e) {
			System.out.println("크롤링 실패");
		}

	}//main end

}//class end
