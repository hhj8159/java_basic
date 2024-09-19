package lesson12_api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ExerUrl {
	// 2번 과제
	// URL 분석 ( String class(문자열 클래스)  사용)
	// 특수문자로 나눔
	// 1. 프로토콜 https
	// 2. 도메인 search.naver.com
	
	// 3. 파일네임 search.naver
	
	// 4. 쿼리스트링 where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC
	
	// where(변수) :: nexearch
	
	// sm :: top_hty
	// 현재 위의 문자열은 5쌍의 key, value 

	public static void main(String[] args) throws MalformedURLException {
//		public MyUrl(String url) {
			String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=";
//			str = "https://naver.com";
			MyUrl myUrl = new MyUrl(str);
//			System.out.println(myUrl);
			myUrl.print();
			
		
	}
	class MyUrl {
		String protocol;
		String domain;
		String filename = "";
		String[] queryStrings;
		
		public MyUrl(String url) {
			String str = url;
			protocol = str.substring(0, str.indexOf("://"));
			str = str.substring(str.indexOf("://")+3);
			
			System.out.println(str);
			int idx = str.indexOf("/");
			if(idx < 0) {
				domain = str;
			}
			else {
				domain = str.substring(0, idx);
				str =  str.substring(idx+1);
				
				//filename초기화
				System.out.println(str);
				idx = str.indexOf("?");
				if(idx < 0) {
					filename = str;
					return;
				}
				filename = str.substring(0, idx);
				str = str.substring(idx + 1);
				System.out.println(str);
				
				//queryString 초기화
				if(str.length() == 0) {
					return;
				}
				queryStrings = str.split("&");
				
				
			}

		}

		@Override
		public String toString() {
			return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", filename=" + filename + ", queryStrings="
					+ Arrays.toString(queryStrings) + "]";
		}
		public void print() {
			System.out.println("protocol=" + protocol + ", domain=" + domain + ", filename=" + filename);
			System.out.println(Arrays.toString(queryStrings));
			for(String qs :queryStrings) {
				String[] tmp = qs.split("=");
				System.out.println(tmp[0] + " ::: " + (tmp.length > 1 ? tmp[1] : ""));
				
			}
		}
		
		
		
		
	}
	
}