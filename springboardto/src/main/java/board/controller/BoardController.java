package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.domain.BoardVO;
import board.domain.SearchCommand;
import board.service.BoardService;

@Controller
public class BoardController {
	private BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping(value="/board/list")
	public String getBookList(@ModelAttribute("search") SearchCommand searchCommand, Model model) {
		List<BoardVO> books = boardService.getBookList();
		model.addAttribute("boardList", books);
		return "board/list";
	}
	
	@RequestMapping(value="/board/read/{num}")
	public String read(Model model, @PathVariable int num) {
		
			model.addAttribute("boardVO", boardService.read(num));
			return "board/read";
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public String write(@ModelAttribute("submitForm") BoardVO boardVO) {
			return "board/write";
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(@ModelAttribute("submitForm") BoardVO boardVO, Errors errors, HttpServletRequest request) {
		System.out.println(boardVO.getImage());
		boardService.write(boardVO, request);
		return "redirect:/board/list";
	}
	

	
}
