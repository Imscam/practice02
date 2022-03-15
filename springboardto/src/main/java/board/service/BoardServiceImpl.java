package board.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import board.dao.BoardDao;
import board.domain.BoardVO;



@Service
public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;
	
	public BoardDao getBoardDao() {
		return boardDao;
	}
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<BoardVO> getBookList() {
		return boardDao.getBookList();
	}
	@Override
	public BoardVO read(int num) {
		return boardDao.select(num);
	}
	
	@Override
	public void write(BoardVO boardVO, HttpServletRequest request) {
		MultipartFile img = boardVO.getImage();
		
		if(!img.isEmpty()) {
			boardVO.setFilename(img.getOriginalFilename());
			String realPath = request.getSession().getServletContext().getRealPath("/resources/uploads");
			boardVO.setFilepath(realPath);
			try {
				System.out.println(realPath);
				img.transferTo(new File(realPath, boardVO.getFilename()));
			} catch (Exception ignore) {
				ignore.printStackTrace();
				System.out.println("err");
			}
		}
		boardDao.insert(boardVO);
	}

}


