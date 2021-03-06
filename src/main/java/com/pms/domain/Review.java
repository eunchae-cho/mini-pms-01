package com.pms.domain;

import java.sql.Date;

public class Review {
	
	private int reviewNo;
	private String content;
	private Date cdt;
	private Date mdt;
	private String writer;
	private String photo;
	
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCdt() {
		return cdt;
	}
	public void setCdt(Date cdt) {
		this.cdt = cdt;
	}
	public Date getMdt() {
		return mdt;
	}
	public void setMdt(Date mdt) {
		this.mdt = mdt;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
