package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.BoardVO;

@Repository
public class BoardDaoMybatis implements BoardDao{
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public BoardDaoMybatis(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<BoardVO> getBookList() {
		return sqlSessionTemplate.selectList("getBookList");
	}
	
	@Override
	public BoardVO select(int num) {
		BoardVO vo = (BoardVO) sqlSessionTemplate.selectOne("select", num);
		return vo;
	}
	
	@Override
	public void insert(BoardVO boardVO) {
		sqlSessionTemplate.insert("insert", boardVO);
	}

	@Override
	public List<BoardVO> selectByBookname(String bookname) {
		return sqlSessionTemplate.selectList("selectByBookname", bookname);
	}

}
