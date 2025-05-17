package BookStore.springboot.withMvc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class BookDAOImpl implements BookDAO {

	@Autowired
	//@PersistenceContext
	EntityManager entityManager;
	
	
	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("--BookDAOimpl-getAllBooks()--");
		String jpaql="from Book book";
		List<Book> list=entityManager.createQuery(jpaql).getResultList();
		return list;
	}

	@Override
	public Book getBookById(Integer bid) {
		System.out.println("--BookDAOimpl-getBookByID()--");
		return entityManager.getReference(Book.class, bid);
	}

	@Override
	public void addBook(Book book) {
		System.out.println("--BookDAOimpl-addBook()--");
		entityManager.persist(book);
		
	}

	@Override
	public void updateBook(Book book) {
		System.out.println("--BookDAOimpl-updateBook()--");
		entityManager.merge(book);
		
	}

	@Override
	public void deleteBook(Integer bid) {
		System.out.println("--BookDAOimpl-deleteBook()--");
		Book book=entityManager.getReference(Book.class, bid);
		entityManager.remove(book);
		
	}

}
