package com.dao;

import com.entity.ChongwuzhaolingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuzhaolingVO;
import com.entity.view.ChongwuzhaolingView;


/**
 * 宠物招领
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
public interface ChongwuzhaolingDao extends BaseMapper<ChongwuzhaolingEntity> {
	
	List<ChongwuzhaolingVO> selectListVO(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
	
	ChongwuzhaolingVO selectVO(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
	
	List<ChongwuzhaolingView> selectListView(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);

	List<ChongwuzhaolingView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
	
	ChongwuzhaolingView selectView(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
	

}
