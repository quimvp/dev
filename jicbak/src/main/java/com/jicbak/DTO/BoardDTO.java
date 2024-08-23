package com.jicbak.DTO;

import java.util.Date;

public class BoardDTO {
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private Date boardWritedate;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardWritedate() {
		return boardWritedate;
	}
	public void setBoardWritedate(Date boardWritedate) {
		this.boardWritedate = boardWritedate;
	}
}
