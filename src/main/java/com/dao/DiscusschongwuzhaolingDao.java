package com.dao;

import com.entity.DiscusschongwuzhaolingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwuzhaolingVO;
import com.entity.view.DiscusschongwuzhaolingView;


/**
 * 宠物招领评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:33:27
 */
public interface DiscusschongwuzhaolingDao extends BaseMapper<DiscusschongwuzhaolingEntity> {
	
	List<DiscusschongwuzhaolingVO> selectListVO(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
	
	DiscusschongwuzhaolingVO selectVO(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
	
	List<DiscusschongwuzhaolingView> selectListView(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);

	List<DiscusschongwuzhaolingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
	
	DiscusschongwuzhaolingView selectView(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
	

}
