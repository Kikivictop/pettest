package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuzhaolingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuzhaolingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuzhaolingView;


/**
 * 宠物招领
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
public interface ChongwuzhaolingService extends IService<ChongwuzhaolingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuzhaolingVO> selectListVO(Wrapper<ChongwuzhaolingEntity> wrapper);
   	
   	ChongwuzhaolingVO selectVO(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
   	
   	List<ChongwuzhaolingView> selectListView(Wrapper<ChongwuzhaolingEntity> wrapper);
   	
   	ChongwuzhaolingView selectView(@Param("ew") Wrapper<ChongwuzhaolingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuzhaolingEntity> wrapper);
   	

}

