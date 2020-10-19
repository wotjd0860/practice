package com.example.demo.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.example.demo.db.PostManager;
import com.example.demo.db.ReplyManager;
import com.example.demo.vo.PostVO;
import com.example.demo.vo.ReplyVO;

@Repository
public class ReplyDAO {
	
	//?κΈ? λΆλ¬?€κΈ?
	public List<ReplyVO> findAll(HashMap map){
		return ReplyManager.findAll(map);
	}
	/*
	public List<ReplyVO> findReplyBull(int p_id){
		return ReplyManager.findReplyBull(p_id);
	}
	public List<ReplyVO> findReplyCreate(int p_id){
		return ReplyManager.findReplyCreate(p_id);
	}
	public List<ReplyVO> findReplyUsed(int p_id){
		return ReplyManager.findReplyUsed(p_id);
	}
	*/
	
	
//	//?κΈ? ??±
//	public int insertBull(PostVO p) {
//		return PostManager.insertBull(p);
//	}
//	
//	public int updateStep(HashMap map) {
//		return PostManager.updateStep(map);
//	}
	
//	public int delete(HashMap map) {
//		return PostManager.delete(map);
//	}
//	
//	public int update(BoardVo b) {
//		return PostManager.update(b);
//	}
}
