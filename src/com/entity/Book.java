package com.entity;

import com.util.VeDate;

public class Book {
	private String bookid = "F" + VeDate.getStringId();
	private String bookname;
	private String image;
	private String cateid;
	private String price;
	private String recommend;

	private String hits;
	private String sellnum;
	private String contents;
	private String catename;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCateid() {
		return cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public String getSellnum() {
		return sellnum;
	}

	public void setSellnum(String sellnum) {
		this.sellnum = sellnum;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookid='" + bookid + '\'' +
				", bookname='" + bookname + '\'' +
				", image='" + image + '\'' +
				", cateid='" + cateid + '\'' +
				", price='" + price + '\'' +
				", recommend='" + recommend + '\'' +
				", hits='" + hits + '\'' +
				", sellnum='" + sellnum + '\'' +
				", contents='" + contents + '\'' +
				", catename='" + catename + '\'' +
				'}';
	}
}
