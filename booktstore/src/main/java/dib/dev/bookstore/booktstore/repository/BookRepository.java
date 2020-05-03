/**
 * 
 */
package dib.dev.bookstore.booktstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dib.dev.bookstore.booktstore.entity.Book;

/**
 * @author boukh
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
