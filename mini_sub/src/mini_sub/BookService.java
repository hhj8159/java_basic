package mini_sub;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class BookService {
// 책 목록
private List<Book> bookList = new ArrayList<Book>();
private static final int TMPCOUNT = 1000;

// 초기화 블럭
{
	System.out.println("초기 데이터를 삽입합니다.");
	bookList.add(new Book("000", "홍길동전", "홍길동", "길동사","00-0000-0000","디테일", TMPCOUNT, 1000, false));
	System.out.println("초기데이터 삽입 완료.");
}

//public class BookQuerryTest {
//	String clientID = "tqo7kxREe4GFC4lx0fAK";
//	String secret = "jcYW9V3xwB";
//
//	public void call() throws Exception {
//		String query = "추리소설";
//		query = URLEncoder.encode(query, "utf-8");
//		String url = "https://openapi.naver.com/v1/search/book.json?query=" + query + "&display=100";
//
//		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("GET");
//		conn.setRequestProperty("X-Naver-Client-Id", clientID);
//		conn.setRequestProperty("X-Naver-Client-Secret", secret);
//
//		int respCode = conn.getResponseCode(); // 200
//		System.out.println(respCode);
//		if (respCode == HttpURLConnection.HTTP_OK) {
//			try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
//				String tmp = null;
//				while (null != (tmp = br.readLine())) {
//					System.out.println(tmp);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

public static void main(String[] args) throws Exception {
	new BookQuerry().call();
}

}