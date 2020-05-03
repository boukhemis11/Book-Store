/**
 * 
 */
package dib.dev.bookstore.booktstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dib.dev.bookstore.booktstore.entity.Book;

/**
 * @author boukh
 *
 */
//@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
