package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuzixunView;


/**
 * 宠物资讯评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:33:27
 */
public interface DiscusschongwuzixunService extends IService<DiscusschongwuzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuzixunVO> selectListVO(Wrapper<DiscusschongwuzixunEntity> wrapper);
   	
   	DiscusschongwuzixunVO selectVO(@Param("ew") Wrapper<DiscusschongwuzixunEntity> wrapper);
   	
   	List<DiscusschongwuzixunView> selectListView(Wrapper<DiscusschongwuzixunEntity> wrapper);
   	
   	DiscusschongwuzixunView selectView(@Param("ew") Wrapper<DiscusschongwuzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuzixunEntity> wrapper);
   	

}

