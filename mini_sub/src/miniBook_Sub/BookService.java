package miniBook_Sub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import miniCustomer_Sub.*;
/**
 * 서적 서비스부
 * 
 * @author HHJ, KHM
 */
public class BookService {
	
// 책 목록
	private List<Book> bookList = new ArrayList<Book>();
	private static final int TMPCOUNT = 1000;
	
// 초기화 블럭
	{
		System.out.println("SYSTEM :: 초기 데이터를 삽입합니다.");
		bookList.add(new Book("000", "홍길동전", "홍길동", "길동사", "0000000000001", 
				"정의의 사도 홍길동의 모험", 10_000, TMPCOUNT, false, false));
		bookList.add(new Book("001", "경애하는 경애에게", "홍길동", "길동사", "0000000000002", 
				"경애는 회사를 그만두고 무작정 베트남으로 떠난다.", 11_000, TMPCOUNT, false, false));
		bookList.add(new Book("002", "상수의 마음", "홍길동", "길동사", "0000000000003", 
				"어느날 상수에게 경애가 다가온다. 그의 마음은 움직였다.", 12_000, TMPCOUNT, false, false));
		bookList.add(new Book("003", "참을 수 없는 존재의 가벼움", "홍길동", "길동사", "0000000000004", 
				"길고도 복잡한 이야기를 원한다면.", 13_000, TMPCOUNT, false, false));
		bookList.add(new Book("004", "달과6펜스", "홍길동", "길동사", "0000000000005", 
				"위대한 개츠비, 더블린 사람들의 뒤를 잇는 고전필독서", 14_000, TMPCOUNT, false, false));
		System.out.println("SYSTEM :: 초기데이터 삽입 완료.");
		System.out.println("SYSTEM :: 임시재고는" + TMPCOUNT + "입니다. 추후에 변동예정");
//		try (ObjectInputStream ois = new ObjectInputStream(
//				new FileInputStream("C:\\Users\\USER\\Desktop\\mini\\src\\miniBook\\data.ser"));) {
//			bookList = (List<Book>) ois.readObject();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

	/**
	 * 검색 메서드 구현
	 * 도서번호 리딩 제로 제외하고도 잘 나오게 추가
	 * 
	 * @author KHM
	 */
	public void bookSearcher() {
		Book b = null;
		System.out.printf("SYSTEM :: 도서를 검색합니다.\n1.도서번호 2.ISBN 3.제목 4.저자 5.전체 6.뒤로가기");
		int input = MiniUtils.next("입력", Integer.class, i -> i >= 1 && i <= 5, "1~5 사이의 숫자 입력");
		printBooks();
		switch (input) {
		case 1: {
			b = findByBookId(MiniUtils.next("번호 입력", String.class, 
					s -> findByBookId(s) != null, "존재하지 않는 도서번호입니다."));
			System.out.println("=====검색 결과=====");
			System.out.println(b);
			showBookDetails(b);
			break;
		}
		case 2: {
			b = findByBookISBN(MiniUtils.next("번호 입력", String.class, 
					s -> findByBookISBN(s) != null, "존재하지 않는 ISBN입니다."));
			System.out.println("=====검색 결과=====");
			System.out.println(b);
			break;
		}
		case 3: {
			String a = MiniUtils.next("제목 입력", String.class);
			findByName(a);
			break;
		}
		case 4: {
			String a = MiniUtils.next("저자 입력", String.class);
			findByWriter(a);
			break;
		}
		case 5 : {
			printBooks();
			break;
		}
		case 6 : {
			
			break;
		}
		default:
			break;
		}
	}

	/**
	 * 무작위 초입 출력부 + shuffle
	 * 
	 * @author KHM
	 */
	public void printBooks() {
		List<Book> pBook = new ArrayList<>(bookList);
		Collections.shuffle(pBook);
		System.out.println("SYSTEM :: 도서 리스트를 출력합니다.");
		pBook.forEach(x -> System.out.print(x + "\n"));
	}

	/**
	 * 리스트를 통한 출력부, printBooks 오버로딩
	 * 
	 * @param
	 * @author KHM
	 */
	public void printBooks(List<Book> listTarget) {
		List<Book> pBook = new ArrayList<>(listTarget);
		pBook.sort((p1, p2) -> p1.getBookName().compareTo(p2.getBookName()));
		pBook.forEach(x -> System.out.print(x + "\n"));
	}

	/**
	 * 도서번호, ISBN 검색 일치하는 경우 한가지밖에 없기 떄문에 추후 예외처리 필요
	 * 
	 * @param String bookID
	 * @author KHM
	 */
	public Book findByBookId(String no) {
		Book book = null;
		boolean flag = false;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getBookId().equals(no)) {
				book = bookList.get(i);
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("SYSTEM :: 일치하는 검색결과가 있습니다.");
		}
		else {
			System.out.println("SYSTEM :: 일치하는 검색결과가 없습니다.");
//			return ;
		}
		return book;
	}

	public Book findByBookISBN(String no) {
		Book book = null;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getISBookNum().equals(no)) {
				book = bookList.get(i);
			}
		}
		return book;
	}

	/**
	 * 일치하는 저자에 따른 검색결과 반환 저자 한명이 다양한 검색결과를 가질 수 있기 때문에 리스트 사용 
	 * 마지막 일치하는 검색 결과가 있을 경우 + 후에 트림 사용해서 띄어쓰기 이슈 해결 필요, 
	 * 해외작가의경우 성과 이름이 떨어져 있을 확률이 높으므로 이에 대한 고려도 필요
	 * 
	 * @param String writer
	 * @author KHM
	 */
	private void findByWriter(String writer) {
		List<Book> bookRes = new ArrayList<Book>();
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if (book.getBookWriter().equals(writer)) {
				bookRes.add(book);
			}
		}
		if (bookRes.isEmpty()) {
			System.out.println("SYSTEM :: 저자명 : " + writer + ", 이에 따른 검색결과가 없습니다. ::");
		} else {
			System.out.println("SYSTEM :: 저자명 : " + writer + ", 이에 따른 검색 결과입니다. ::");
			printBooks(bookRes);
		}
		System.out.println("SYSTEM :: END OF QUERRY");
	}

	/**
	 * 일치하는 제목에 따른 검색결과 반환 제목 하나가 출판사에 따른 다양한 검색결과를 가질 수 있기 때문에 리스트 사용 마지막 일치하는 검색
	 * 결과가 있을 경우 + 후에 트림 사용해서 띄어쓰기 이슈 해결 필요 + 제목 일부분만 검색해도 되게 하려면 contains 사용해야 할듯.
	 * 
	 * @param String bookName
	 * @author KHM
	 */
	private void findByName(String bookName) {
		List<Book> bookRes = new ArrayList<Book>();
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			if (book.getBookName().equals(bookName)) {
				bookRes.add(book);
			}
		}
		if (bookRes.isEmpty()) {
			System.out.println("SYSTEM :: 제목 : " + bookName + ", 이에 따른 검색결과가 없습니다. ::");
		} else {
			System.out.println("SYSTEM :: 제목 : " + bookName + ", 이에 따른 검색 결과입니다. ::");
			printBooks(bookRes);
		}
		System.out.println("SYSTEM :: END OF QUERRY");
	}


	/**
	 * 도서 상세정보 페이지 구현
	 * 
	 * @author KHM
	 */
	public void showBookDetails(String a) {
		String b = "";
		int bp = 0;
		System.out.println("SYSTEM :: 상세정보 페이지를 로드합니다.");
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getBookId() == a) {
				b = bookList.get(i).getBookDetail();
				bp = bookList.get(i).getBookPrice();
				System.out.println("*소개 : " + b + " | *정가 : " + bp + " |" + "1.장바구니 2.뒤로가기" );
				break;
			}
		}
		
	}
	
	/**
	 * 도서 상세정보 페이지 구현 오버로딩
	 * (Book 객체)
	 * 
	 * @param Book book
	 * @author KHM
	 */
	public void showBookDetails(Book a) {
		System.out.println("SYSTEM :: 상세정보 페이지를 로드합니다.");
		System.out.println("*소개 : " + bookList.get(Integer.parseInt(a.getBookId())).getBookDetail() 
				+ " | *정가 : " + a.getBookPrice() + " |" + "1.장바구니 2.뒤로가기" );
		int c = MiniUtils.next("입력", Integer.class , null, null);
	}
	
	public void searchApi() {
		String query = MiniUtils.next("검색어를 입력하세요", String.class);
		SearchBookApi searchBookApi = new SearchBookApi();
	
	}

}