package 주식정보시스템;



import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰메인크롤링 {

	public static void main(String[] args) {
		
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; //로컬변수 초기화!! 수동으로!
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); 
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			//sptxt sp_txt9
			Elements textList = doc.select(".sptxt.sp_txt9"); 
			System.out.println(textList.size());
			
			Element tag2 = textList.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);
																//html에서 sptxt sp_txt10는
			Elements textList2 = doc.select(".sptxt.sp_txt10"); //클래스가 두개라는 뜻
			System.out.println(textList2.size());				//따라서 . 을 두번써서 적어 줘야한다
																// 자바 안에서 .sptxt sp_txt10는 
			Element tag3 = textList2.get(0);					//sptxt 아래에 sp_txt10이라는 태그가 
			String text2 = tag3.text();							//하나 더 있다는 뜻이다. 의미가 다름
			System.out.println("text2 " + text2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
		
		
	}

}
