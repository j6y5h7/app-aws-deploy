package com.increpas.db.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.increpas.db.vo.DeptVO;

@Repository
public class DeptDAO {

    @Autowired
    private SqlSession sqlSession;

    public List<DeptVO> selectList() {
        return sqlSession.selectList("dept.dept_list");
    }
}
