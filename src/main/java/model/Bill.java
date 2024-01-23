package model;
import java.sql.Date;
import java.sql.Time;
public class Bill {
	private String totalPrice;
	private String subPrice;
	private Date dateBuy;
	private Time timeBuy;
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getSubPrice() {
		return subPrice;
	}
	public void setSubPrice(String subPrice) {
		this.subPrice = subPrice;
	}
	public Date getDateBuy() {
		return dateBuy;
	}
	public void setDateBuy(Date dateBuy) {
		this.dateBuy = dateBuy;
	}
	public Time getTimeBuy() {
		return timeBuy;
	}
	public void setTimeBuy(Time timeBuy) {
		this.timeBuy = timeBuy;
	}
	public Bill(String totalPrice, String subPrice, Date dateBuy, Time timeBuy) {
		super();
		this.totalPrice = totalPrice;
		this.subPrice = subPrice;
		this.dateBuy = dateBuy;
		this.timeBuy = timeBuy;
	}
	public Bill() {
		
	}
}