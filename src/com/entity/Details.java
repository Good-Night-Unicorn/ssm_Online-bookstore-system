package com.entity;

import com.util.VeDate;

public class Details {
	private String detailsid = "D" + VeDate.getStringId();
	private String ordercode;
	private String bookid;
	private String num;
	private String price;
	private String receivername;
	private String receiverphone;
	private String address;
	private String bookname;

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getDetailsid() {
		return detailsid;
	}

	public void setDetailsid(String detailsid) {
		this.detailsid = detailsid;
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode;
	}



	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public String getReceiverphone() {
		return receiverphone;
	}

	public void setReceiverphone(String receiverphone) {
		this.receiverphone = receiverphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Details{" +
				"detailsid='" + detailsid + '\'' +
				", ordercode='" + ordercode + '\'' +
				", bookid='" + bookid + '\'' +
				", num='" + num + '\'' +
				", price='" + price + '\'' +
				", receivername='" + receivername + '\'' +
				", receiverphone='" + receiverphone + '\'' +
				", address='" + address + '\'' +
				", bookname='" + bookname + '\'' +
				'}';
	}
}
