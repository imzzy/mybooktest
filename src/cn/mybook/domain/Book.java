package cn.mybook.domain;

import java.sql.Date;

public class Book {

	private Integer bookId;
	private String author;
	
	private String title;
	private float price;
	
	private Date PublishingDate;
	private int saleaAmount;
	
	private int storeNumber;
	private String remark;
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublishingDate() {
		return PublishingDate;
	}
	public void setPublishingDate(Date publishingDate) {
		PublishingDate = publishingDate;
	}
	public int getSaleaAmount() {
		return saleaAmount;
	}
	public void setSaleaAmount(int saleaAmount) {
		this.saleaAmount = saleaAmount;
	}
	public int getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		
		return "Book[bookId:="+bookId+", author="+author+", price="+price+", publishingDate="+PublishingDate+", saleAmount="+saleaAmount
				+ "storeNumber="+storeNumber+", remark="+remark+"]"; 
	}
	
	
}
