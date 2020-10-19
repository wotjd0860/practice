package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.PostManager;
import com.example.demo.vo.PostVO;
import com.example.demo.vo.ReplyVO;

@Repository
public class PostDAO {
	
	//κ²μ? ? μ²΄κ? ? μ‘°ν
	public int getTotalCount(HashMap map) {
		return PostManager.getTotalCount(map);
	}	
	
	//κ²μ? ? μ²΄κ? κ°?? Έ?€κΈ?
	public List<PostVO> findAll(HashMap map){
		return PostManager.findAll(map);
	}
	
	//κ²μ? ??ΈκΈ? λ³΄κΈ°
	public PostVO findById(HashMap map) {
		return PostManager.findById(map);
	}
	
	//?κΈ? ??±
	public int insertCreate(PostVO p) {
		return PostManager.insertCreate(p);
	}
	
	//κΈ? ?? 
	public int update(PostVO b) {
		return PostManager.update(b);
	}
	
	//κΈ? ?­? 
	public int delete(HashMap map) {
		return PostManager.delete(map);
	}
	
//	public int updateStep(HashMap map) {
//		return PostManager.updateStep(map);
//	}
	
}
