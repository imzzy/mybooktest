package cn.mybook.domain;

public class ShoppingCartItem {
	
	private Book book;
	private int quanlity;
	
	public ShoppingCartItem(Book book){
		this.book = book;
		this.quanlity = 1;
	}

	public Book getBook() {
		return book;
	}


	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	
	/*
	 * 该商品在购物车中的钱数
	 */
	
	public float getItemMoney(){
		return this.book.getPrice() * quanlity;
	}
	
	
	//商品数量加1
	
	public void increament(){
		quanlity++;
	}

}
