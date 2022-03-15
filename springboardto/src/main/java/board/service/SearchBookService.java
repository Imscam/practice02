package board.service;

import java.util.List;

import board.dao.BoardDao;
import board.domain.BoardVO;
import board.domain.SearchCommand;


public class SearchBookService {
private BoardDao boardDAO;
	
	public void setBoardDAO(BoardDao boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public List<BoardVO> search(SearchCommand searchCommand) {
		List<BoardVO> books = null;
		if(searchCommand.getSearchType().equals("bookname")) {
			books = boardDAO.selectByBookname(searchCommand.getSearchValue());
		}	
		System.out.println(searchCommand.getSearchValue());
		return books;
	}
}

