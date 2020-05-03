/**
 * 
 */
package dib.dev.bookstore.booktstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dib.dev.bookstore.booktstore.entity.BookCategory;

/**
 * @author boukh
 *
 */
//j'ai utilisé @RepositoryRestResource pour ne pas avoir un url comme http...../BookCategory mais pour avoir un url comme ca http...../Book-category
@RepositoryRestResource(collectionResourceRel = "BookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
