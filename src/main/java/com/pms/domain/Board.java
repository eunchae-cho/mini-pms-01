package com.pms.domain;

import java.sql.Date;

public class Board {
	
	private int boardNo;
	private String title;
	private String content;
	private Date cdt;
	private Date mdt;
	private String photo;

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegisteredDate() {
		return cdt;
	}

	public void setRegisteredDate(Date cdt) {
		this.cdt = cdt;
	}

	public Date getmdt() {
		return mdt;
	}

	public void setmdt(Date mdt) {
		this.mdt = mdt;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


}
