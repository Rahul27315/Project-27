package com.jtcindia.springboot;

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

    @GetMapping("/showAllBooks")
    public String showBooksList(Model model) {
        System.out.println("-------BookController--showBooksList()--");
        List<Book> blist = bookService.getAllBooks();
        model.addAttribute("MyBookList",blist);
        return "booklist";
    }

    @PostMapping("/addEditBookForm")
    public String addBookForm(@RequestParam("bookId") Integer bookId, Model model) {
        System.out.println("----BookController--addEditBookForm()-----");
        System.out.println(bookId);
        Book book = new Book();
        String opType = "ADD";
        if (bookId != 0) {
            book = bookService.getBooksById(bookId);
            opType = "UPDATE";
        }
        model.addAttribute("mybook", book);
        model.addAttribute("OpType", opType);
        return "addEditBook";
    }

    @PostMapping("/saveUpdateBook")
    public String saveUpdateBook(
            @ModelAttribute("mybook") Book book,
            BindingResult result,
            Model model,
            HttpServletRequest req) {

        System.out.println("-----BookController--saveUpdateBook()-------");
        String opType = req.getParameter("OpType");
        System.out.println("OpType:"+opType);
        System.out.println("Book Data:"+book);
        if ("ADD".equals(opType)) {
            bookService.addBook(book);
        } else if ("UPDATE".equals(opType)) {
            bookService.updateBook(book);
        }

        List<Book> blist = bookService.getAllBooks();
        System.out.println("----------------------------------------------");
        System.out.println(blist);
        System.out.println("***********************************************");
        model.addAttribute("MyBookList", blist);        
        return "booklist";
    }
    @PostMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookId") Integer bookId, Model model) {
        System.out.println("---------BookController--deleteBook()-----");
        bookService.deleteBook(bookId);
        List<Book> blist = bookService.getAllBooks();
        model.addAttribute("MyBookList", blist);
        return "booklist";
    }

    @GetMapping("/viewBook")
    public String viewBook(@RequestParam("bookId") String bookId, Model model) {
        System.out.println("--------BookController---viewBook()-------");
        System.out.println(bookId);
        Book book = bookService.getBooksById(Integer.parseInt(bookId));
        model.addAttribute("MyBook", book);
        return "viewBook";
    }
}
