package com.jicbak.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jicbak.DAO.BoardMapper;
import com.jicbak.DTO.BoardDTO;

@Service
public class BoardServicelmpl implements BoardService {
	
	@Autowired
	private BoardMapper bMapper;
	
	@Override
	public void write(BoardDTO board) {
		bMapper.insertBoard(board);
	}
	
	@Override
	public void modify(BoardDTO board) {
		bMapper.updateBoard(board);
	}
	
	@Override
	public void remove(int boardId) {
		bMapper.deleteBoard(boardId);
	}
	
	@Override
	public BoardDTO getBoard(int boardId) {
		return bMapper.selectOneBoard(boardId);
	}
	
	@Override
	public List<BoardDTO> getBoardList() {
		return bMapper.selectAllBoard();
	}
	
	@Override
	public List<BoardDTO> getBoardSearchList(HashMap<String, Object> params) {
		return null;
	}
}
