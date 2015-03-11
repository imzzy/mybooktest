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
	 * ����Ʒ�ڹ��ﳵ�е�Ǯ��
	 */
	
	public float getItemMoney(){
		return this.book.getPrice() * quanlity;
	}
	
	
	//��Ʒ������1
	
	public void increament(){
		quanlity++;
	}

}
