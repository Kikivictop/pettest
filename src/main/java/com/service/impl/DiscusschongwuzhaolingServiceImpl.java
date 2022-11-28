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


import com.dao.DiscusschongwuzhaolingDao;
import com.entity.DiscusschongwuzhaolingEntity;
import com.service.DiscusschongwuzhaolingService;
import com.entity.vo.DiscusschongwuzhaolingVO;
import com.entity.view.DiscusschongwuzhaolingView;

@Service("discusschongwuzhaolingService")
public class DiscusschongwuzhaolingServiceImpl extends ServiceImpl<DiscusschongwuzhaolingDao, DiscusschongwuzhaolingEntity> implements DiscusschongwuzhaolingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuzhaolingEntity> page = this.selectPage(
                new Query<DiscusschongwuzhaolingEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuzhaolingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuzhaolingEntity> wrapper) {
		  Page<DiscusschongwuzhaolingView> page =new Query<DiscusschongwuzhaolingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwuzhaolingVO> selectListVO(Wrapper<DiscusschongwuzhaolingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuzhaolingVO selectVO(Wrapper<DiscusschongwuzhaolingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuzhaolingView> selectListView(Wrapper<DiscusschongwuzhaolingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuzhaolingView selectView(Wrapper<DiscusschongwuzhaolingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
