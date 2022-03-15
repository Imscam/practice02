package board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.domain.BoardVO;
import board.domain.SearchCommand;
import board.service.SearchBookService;

@Controller
public class SearchBookController {
	private SearchBookService searchBookService;

	public void setSearchBookService(SearchBookService searchBookService) {
		this.searchBookService = searchBookService;
	}
	
	@RequestMapping(value="/board/search", method=RequestMethod.GET)
	public String search(@ModelAttribute("search") SearchCommand searchCommand, Model model) {
		List<BoardVO> books = searchBookService.search(searchCommand);
		model.addAttribute("boardList", books);
		
		return "board/list";
	}
}


