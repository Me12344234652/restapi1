package p.tuimapps.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.tuimapps.restapi.model.Book;
import p.tuimapps.restapi.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book getBookByName(String bookName) {
        return bookRepository.findByName(bookName);
    }

    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "book removed !! " + id;
    }
//    @Transactional
//    @CachePut(cacheNames = "SinglePost", key = "#result.id")
//    public Book editBook(Book book) {
//        Book bookEdited = bookRepository.findById(book.getId()).orElseThrow();
//        bookEdited.setName(book.getName());
//        bookEdited.setAuthor(book.getAuthor());
//        bookEdited.setPlace(book.getPlace());
//        return bookEdited;
//    }
    public Book updateBook(int id, Book book) {
        Book existingBook = bookRepository.findById(id).orElseThrow();
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPlace(book.getPlace());
        return bookRepository.save(existingBook);
    }
}
