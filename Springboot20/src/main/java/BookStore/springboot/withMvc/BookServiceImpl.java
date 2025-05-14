package BookStore.springboot.withMvc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookDAO bookDAO;	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("--BookServiceimpl-getAllBooks()--");
		return bookDAO.getAllBooks();
	}
	@Override
	public Book getBookById(Integer bid) {
		System.out.println("--BookServiceimpl-getBookByID()--");
		return bookDAO.getBookById(bid);
	}
	@Override
	public void addBook(Book book) {
		System.out.println("--BookServiceimpl-addBook()--");
		bookDAO.addBook(book);
	}
	@Override
	public void updateBook(Book book) {
		System.out.println("--BookServiceimpl-updateBook()--");
		bookDAO.updateBook(book);		
	}
	@Override
	public void deleteBook(Integer bid) {
		System.out.println("--BookServiceimpl-deleteBook()--");
		bookDAO.deleteBook(bid);		
	}
}
