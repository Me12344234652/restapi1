package p.tuimapps.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import p.tuimapps.restapi.model.Book;
import p.tuimapps.restapi.service.BookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> bookList) {
        return bookService.saveBooks(bookList);
    }

    @GetMapping("/Books")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/BookById/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/BookByName/{name}")
    public Book getBookByName(@PathVariable String name) {
        return bookService.getBookByName(name);
    }
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
