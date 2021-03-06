/**
 * 
 */
package dib.dev.bookstore.booktstore.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author boukh
 *
 */

@Entity
@Table(name="category")
@Setter
@Getter
@ToString
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy="category")
	private Set<Book> books;
}
