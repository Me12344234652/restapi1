package p.tuimapps.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import p.tuimapps.restapi.model.Book;



public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByName(String bookName);
}
