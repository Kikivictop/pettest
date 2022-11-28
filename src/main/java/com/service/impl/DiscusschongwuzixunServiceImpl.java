package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschongwuzixunDao;
import com.entity.DiscusschongwuzixunEntity;
import com.service.DiscusschongwuzixunService;
import com.entity.vo.DiscusschongwuzixunVO;
import com.entity.view.DiscusschongwuzixunView;

@Service("discusschongwuzixunService")
public class DiscusschongwuzixunServiceImpl extends ServiceImpl<DiscusschongwuzixunDao, DiscusschongwuzixunEntity> implements DiscusschongwuzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuzixunEntity> page = this.selectPage(
                new Query<DiscusschongwuzixunEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuzixunEntity> wrapper) {
		  Page<DiscusschongwuzixunView> page =new Query<DiscusschongwuzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwuzixunVO> selectListVO(Wrapper<DiscusschongwuzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuzixunVO selectVO(Wrapper<DiscusschongwuzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuzixunView> selectListView(Wrapper<DiscusschongwuzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuzixunView selectView(Wrapper<DiscusschongwuzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
