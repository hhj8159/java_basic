package mini_sub;

public class BookStoreMain {
	public static void main(String[] args) {
		CustomerService cs = new CustomerService();
//		cs.login();
//		cs.customerAdd();
//		cs.customerRemove();
		cs.printCustomer();

		BookService bookService = new BookService();
		bookService.bookSearch();
		
	}
}
