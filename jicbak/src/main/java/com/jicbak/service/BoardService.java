package com.jicbak.service;

import java.util.HashMap;
import java.util.List;

import com.jicbak.DTO.BoardDTO;

public interface BoardService {
	public void write(BoardDTO board);
	public void modify(BoardDTO board);
	public void remove(int boardId);
	public BoardDTO getBoard(int boardId);
	public List<BoardDTO> getBoardList();
	public List<BoardDTO> getBoardSearchList(HashMap<String, Object> params);
}
