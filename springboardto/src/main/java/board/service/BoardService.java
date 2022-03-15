package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardVO;


public interface BoardService {
	public List<BoardVO> getBookList();
	
	public BoardVO read(int num);
	
	public void write(BoardVO boardVO, HttpServletRequest request);
	
	
}
