package cn.mybook.web;

import java.util.List;

public class Page<T> {

	//��ǰ�ڼ�ҳ
	private int pageNo;
	//��ǰҳ��list
	private List<T> list;
	//ÿҳ��ʾ����������
	private int pageSize = 3;
	//���ж�������¼
	private long totalItemNumber;
	
	public Page(int pageNo){
		this.pageNo = pageNo;
	}

	public int getPageNo() {
		if(pageNo<0){
			pageNo=1;
		}
		if(pageNo > getTotalPageNumber()){
			pageNo = getTotalPageNumber();
		}
		return pageNo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPageSize() {
		return pageSize;
	}



	public void setTotalItemNumber(long totalItemNumber) {
		this.totalItemNumber = totalItemNumber;
	}
	
	//��ȡ��ҳ��
	public int getTotalPageNumber(){
		int totalPageNumber=(int)totalItemNumber/pageSize;
		
		if(totalItemNumber % pageSize != 0){
			 totalPageNumber++;
		}
		return totalPageNumber;
	}
	//��һҳ
	public boolean isHasNext(){
		if(getPageNo() < getTotalPageNumber()){
			return true;
		}
		return false;
	}
	//��һҳ
	public boolean isHasPrev(){
		if(getPageNo() > 1){
			return true;
		}
		return false;
	}
	
	public int getPrevPage(){
		if(isHasPrev()){
			return getPageNo() -1;
		}
		return getPageNo();
	}
	
	public int getNextPage(){
		if(isHasNext()){
			return getPageNo() + 1;
		}
		return getPageNo();
	}
}
