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
	 * 修改购物项的数量
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
	 * 移除指定的购物项
	 * removeItem
	 * 
	 */
	
	public void removeItem(Integer id){
		books.remove(id);
	}
	
	
	/*
	 * 
	 * 清空购物车
	 * clear
	 */
	public void clear(){
		books.clear();
	}
	/*
	 * 返回购物车是否为空
	 * isEmpty
	 */
	public boolean isEmpty(){
		return books.isEmpty();
	}
	/*
	 * 获取购物车中商品的总钱数
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
	 * 获取购物车中所有商品的 shoppingCartItem 组成的集合
	 * getItems
	 */
	public Collection<ShoppingCartItem> getItems(){
		return books.values();
	}
	/**
	 * 返回购物车中商品的总数量
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
	 * 检查购物车中是否有id指定的商品
	 * hasbook
	 * 
	 */
	
	public boolean hasBook(Integer id){
		return books.containsKey(id);
	}
	/**
	 * 向购物城中添加一件上商品
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
