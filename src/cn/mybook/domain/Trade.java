package cn.mybook.domain;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Trade {

	private Integer tradeId;
	private Date tradeTime;
//	������tradeItem
	private Set<TradeItem> items = new LinkedHashSet<TradeItem>();
	
//	����user
	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public Date getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	public Set<TradeItem> getItems() {
		return items;
	}
	public void setItems(Set<TradeItem> items) {
		this.items = items;
	}
	
	
	
}
