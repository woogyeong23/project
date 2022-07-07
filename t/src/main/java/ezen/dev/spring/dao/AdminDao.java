package ezen.dev.spring.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ezen.dev.spring.vo.MemberVo;

@Repository
public class AdminDao {

	//MyBatis를 이용해서 DB작업: SqlSession 객체 필요
	
	private SqlSession sqlSession;
	
	public static final String MAPPER = "ezen.dev.spring.admin";
	
	@Autowired
	public AdminDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<MemberVo> getMemberList() {
		return sqlSession.selectList(MAPPER+".getMemberList");
	}

	public int updateMemberGrade(HashMap<String, Integer> map) {
		return sqlSession.update(MAPPER+".updateMemberGrade", map);
	}

	public int deleteMemberInfo(List<Integer> member_idx_list) {
		return sqlSession.delete(MAPPER+".deleteMemberInfo", member_idx_list);
	}
	
	
	
	
	
	
	
	
	

}
