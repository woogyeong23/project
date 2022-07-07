package ezen.dev.spring.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ezen.dev.spring.vo.GalleryVo;
import ezen.dev.spring.vo.MemberVo;

@Repository
public class GalleryDao {

	//MyBatis를 이용해서 DB작업: SqlSession 객체 필요
	
	private SqlSession sqlSession;
	
	public static final String MAPPER = "ezen.dev.spring.gallery";
	
	@Autowired
	public GalleryDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int addGallery(GalleryVo galleryVo) {
		return sqlSession.insert(MAPPER+".addGallery", galleryVo);
	}

	public List<GalleryVo> getGalleryList() {
		return sqlSession.selectList(MAPPER+".getGalleryList");
	}

}
