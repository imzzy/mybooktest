package cn.mybook.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	
	private Map<Integer, ShoppingCartItem> books = new HashMap<Integer, ShoppingCartItem>();

	public Map<Integer, ShoppingCartItem> getBooks() {
		return books;
	}
	
	
	
	/*
	 * �޸Ĺ����������
	 * updateItemQuanlity
	 * 
	 */
	
	public void updateItemQuanlity(Integer id,int quanlity){
		ShoppingCartItem sci = books.get(id);
		if(sci != null){
			sci.setQuanlity(quanlity);
		}
	}
	
	/*
	 * �Ƴ�ָ���Ĺ�����
	 * removeItem
	 * 
	 */
	
	public void removeItem(Integer id){
		books.remove(id);
	}
	
	
	/*
	 * 
	 * ��չ��ﳵ
	 * clear
	 */
	public void clear(){
		books.clear();
	}
	/*
	 * ���ع��ﳵ�Ƿ�Ϊ��
	 * isEmpty
	 */
	public boolean isEmpty(){
		return books.isEmpty();
	}
	/*
	 * ��ȡ���ﳵ����Ʒ����Ǯ��
	 * getTotalMoney
	 * 
	 */
	
	public float getTotalMoney(){
		float total = 0;
		for(ShoppingCartItem sci:getItems()){
			total += sci.getItemMoney();
		}
		return total;
	}
	
	/**
	 * ��ȡ���ﳵ��������Ʒ�� shoppingCartItem ��ɵļ���
	 * getItems
	 */
	public Collection<ShoppingCartItem> getItems(){
		return books.values();
	}
	/**
	 * ���ع��ﳵ����Ʒ��������
	 * getBookNum
	 */
	
	public int getBooksNum(){
		int total = 0;
		for (ShoppingCartItem sci:getItems()){
			total += sci.getQuanlity();
		}
		return total;
	}
	/**
	 * ��鹺�ﳵ���Ƿ���idָ������Ʒ
	 * hasbook
	 * 
	 */
	
	public boolean hasBook(Integer id){
		return books.containsKey(id);
	}
	/**
	 * ����������һ������Ʒ
	 * addBook
	 */
	
	public void addBook(Book book){
		ShoppingCartItem sci = books.get(book.getBookId());
		
		if(sci == null){
			sci = new ShoppingCartItem(book);
			books.put(book.getBookId(), sci);
		}else{
			sci.increament();
		}
	}
	
	
}
