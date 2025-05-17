package BookStore.springboot.withMvc;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mybooks")
public class Book {
	@Id
	@Column(name="bid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bid;
	
	@Column(name="bname")
	private String bname;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="pub")
	private String pub;
	
	public Book() {
		// TODO Auto-generated constructor stub
		System.out.println("Def Constructor");
	}
	
	

	public Book(Integer bid, String bname, String author, BigDecimal price, String category, String pub) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}

	


	public Book(String bname, String author, BigDecimal price, String category, String pub) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.category = category;
		this.pub = pub;
	}



	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + ", category="
				+ category + ", pub=" + pub + "]";
	}
	
	
	

}