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


import com.dao.ChongwuzixunDao;
import com.entity.ChongwuzixunEntity;
import com.service.ChongwuzixunService;
import com.entity.vo.ChongwuzixunVO;
import com.entity.view.ChongwuzixunView;

@Service("chongwuzixunService")
public class ChongwuzixunServiceImpl extends ServiceImpl<ChongwuzixunDao, ChongwuzixunEntity> implements ChongwuzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuzixunEntity> page = this.selectPage(
                new Query<ChongwuzixunEntity>(params).getPage(),
                new EntityWrapper<ChongwuzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuzixunEntity> wrapper) {
		  Page<ChongwuzixunView> page =new Query<ChongwuzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuzixunVO> selectListVO(Wrapper<ChongwuzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuzixunVO selectVO(Wrapper<ChongwuzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuzixunView> selectListView(Wrapper<ChongwuzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuzixunView selectView(Wrapper<ChongwuzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
