package BookStore.springboot.withMvc;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("MyBookList")
public class BookController {
	@Autowired
	BookService bookService;
	@GetMapping("/showAllBooks" )
	public String showBooksList(Model model) {
		System.out.println("-------BookControlller--showBooksList()--");
		List<Book> blist=bookService.getAllBooks();
		model.addAttribute("MyBookList", blist);
		return "booksList";
	}
	@PostMapping("/addEditBookForm" )
	public String addBookForm(@RequestParam("bookId")Integer bookId,Model model) {
		System.out.println("----BookController--addEditBookForm()-----");
		System.out.println(bookId);
		Book book=new Book();
		String opType="ADD";
		if (bookId!=0) {
			book=bookService.getBookById(bookId);
			opType="UPDATE";
		}
		model.addAttribute("mybook",book);
		model.addAttribute("OpType",opType);
		return "addEditBook";
	}
	@PostMapping("/saveUpdateBook")
	public String saveUpdateBook(@ModelAttribute("mybook") Book book, BindingResult result, Model model, HttpServletRequest req) {
	    System.out.println("-----BookController--saveUpdateBook-------");
	    String opType = req.getParameter("OpType");
	    System.out.println("OpType: " + opType); // Print OpType (ADD or UPDATE)
	    System.out.println("Book Data: " + book); // Print the book object

	    // Rest of your code...
	    if (result.hasErrors()) {
	        System.out.println("Form Errors: " + result.getAllErrors());
	        model.addAttribute("OpType", opType);
	        return "addEditBook";
	    }

	    if (opType == null) {
	        System.out.println("OpType is null, defaulting to ADD");
	        opType = "ADD";
	    }

	    if ("ADD".equals(opType)) {
	        bookService.addBook(book);
	    } else if ("UPDATE".equals(opType)) {
	        bookService.updateBook(book);
	    }

	    List<Book> blist = bookService.getAllBooks();
	    System.out.println("**********************************");
	    System.out.println(blist);
	    System.out.println("---------------------------");
	    model.addAttribute("MyBookList", blist);
	    return "booksList";
	}
		@PostMapping("/deleteBook")
		public String deleteBook(@RequestParam("bookId") Integer bookId,Model model) {
		System.out.println("---------BookController--deleteBooks()-----");
		bookService.deleteBook(bookId);
		List<Book> blist=bookService.getAllBooks();
		model.addAttribute("MyBookList", blist);
		return "booksList";
	}
		@GetMapping("/viewBook")
		public String viewBook(@RequestParam(value = "bookId") String bookId, Model model) {
			System.out.println("---------------BookController----viewBook()---------------");
			System.out.println(bookId);
//		    if (bookId == null || !bookId.matches("\\d+")) {
//		        return "redirect:/showAllBooks";
//		    }
		    Book book = bookService.getBookById(Integer.parseInt(bookId));
		    model.addAttribute("MyBook", book);
		    return "viewBook";
		}

}
