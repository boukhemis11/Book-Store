/**
 * 
 */
package dib.dev.bookstore.booktstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dib.dev.bookstore.booktstore.entity.BookCategory;

/**
 * @author boukh
 *
 */
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
