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


import com.dao.ChongwuzhaolingDao;
import com.entity.ChongwuzhaolingEntity;
import com.service.ChongwuzhaolingService;
import com.entity.vo.ChongwuzhaolingVO;
import com.entity.view.ChongwuzhaolingView;

@Service("chongwuzhaolingService")
public class ChongwuzhaolingServiceImpl extends ServiceImpl<ChongwuzhaolingDao, ChongwuzhaolingEntity> implements ChongwuzhaolingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuzhaolingEntity> page = this.selectPage(
                new Query<ChongwuzhaolingEntity>(params).getPage(),
                new EntityWrapper<ChongwuzhaolingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuzhaolingEntity> wrapper) {
		  Page<ChongwuzhaolingView> page =new Query<ChongwuzhaolingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuzhaolingVO> selectListVO(Wrapper<ChongwuzhaolingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuzhaolingVO selectVO(Wrapper<ChongwuzhaolingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuzhaolingView> selectListView(Wrapper<ChongwuzhaolingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuzhaolingView selectView(Wrapper<ChongwuzhaolingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
