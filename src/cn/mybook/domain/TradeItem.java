package cn.mybook.domain;

public class TradeItem {

	private Integer tradeItemId;
	private int quanlity;
	
	private Book book;
	private Integer bookId;
	public Integer getTradeItemId() {
		return tradeItemId;
	}
	public void setTradeItemId(Integer tradeItemId) {
		this.tradeItemId = tradeItemId;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	
	public TradeItem() {
		
	}
	public TradeItem(Integer tradeItemId, int quanlity, Book book,
			Integer bookId) {
		super();
		this.tradeItemId = tradeItemId;
		this.quanlity = quanlity;
		this.book = book;
		this.bookId = bookId;
	}
	
	
}
