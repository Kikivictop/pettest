package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwuzhaolingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwuzhaolingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwuzhaolingView;


/**
 * 宠物招领评论表
 *
 * @author 
 * @email 
 * @date 2022-04-04 22:33:27
 */
public interface DiscusschongwuzhaolingService extends IService<DiscusschongwuzhaolingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuzhaolingVO> selectListVO(Wrapper<DiscusschongwuzhaolingEntity> wrapper);
   	
   	DiscusschongwuzhaolingVO selectVO(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
   	
   	List<DiscusschongwuzhaolingView> selectListView(Wrapper<DiscusschongwuzhaolingEntity> wrapper);
   	
   	DiscusschongwuzhaolingView selectView(@Param("ew") Wrapper<DiscusschongwuzhaolingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuzhaolingEntity> wrapper);
   	

}

