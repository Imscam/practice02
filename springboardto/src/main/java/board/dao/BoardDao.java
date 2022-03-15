package board.dao;

import java.util.List;

import board.domain.BoardVO;


public interface BoardDao {
	public List<BoardVO> getBookList();

	public BoardVO select(int num);
	
	public void insert(BoardVO boardVO);
	
	public List<BoardVO> selectByBookname(String bookname);
	
}
