package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuzixunView;


/**
 * 宠物资讯
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
public interface ChongwuzixunService extends IService<ChongwuzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuzixunVO> selectListVO(Wrapper<ChongwuzixunEntity> wrapper);
   	
   	ChongwuzixunVO selectVO(@Param("ew") Wrapper<ChongwuzixunEntity> wrapper);
   	
   	List<ChongwuzixunView> selectListView(Wrapper<ChongwuzixunEntity> wrapper);
   	
   	ChongwuzixunView selectView(@Param("ew") Wrapper<ChongwuzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuzixunEntity> wrapper);
   	

}

