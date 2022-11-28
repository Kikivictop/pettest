package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChongwuzhaolingEntity;
import com.entity.view.ChongwuzhaolingView;

import com.service.ChongwuzhaolingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 宠物招领
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
@RestController
@RequestMapping("/chongwuzhaoling")
public class ChongwuzhaolingController {
    @Autowired
    private ChongwuzhaolingService chongwuzhaolingService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwuzhaolingEntity chongwuzhaoling,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date faxianshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date faxianshijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongwuzhaoling.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwuzhaolingEntity> ew = new EntityWrapper<ChongwuzhaolingEntity>();
                if(faxianshijianstart!=null) ew.ge("faxianshijian", faxianshijianstart);
                if(faxianshijianend!=null) ew.le("faxianshijian", faxianshijianend);
		PageUtils page = chongwuzhaolingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuzhaoling), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwuzhaolingEntity chongwuzhaoling, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date faxianshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date faxianshijianend,
		HttpServletRequest request){
        EntityWrapper<ChongwuzhaolingEntity> ew = new EntityWrapper<ChongwuzhaolingEntity>();
                if(faxianshijianstart!=null) ew.ge("faxianshijian", faxianshijianstart);
                if(faxianshijianend!=null) ew.le("faxianshijian", faxianshijianend);
		PageUtils page = chongwuzhaolingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuzhaoling), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwuzhaolingEntity chongwuzhaoling){
       	EntityWrapper<ChongwuzhaolingEntity> ew = new EntityWrapper<ChongwuzhaolingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuzhaoling, "chongwuzhaoling")); 
        return R.ok().put("data", chongwuzhaolingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwuzhaolingEntity chongwuzhaoling){
        EntityWrapper< ChongwuzhaolingEntity> ew = new EntityWrapper< ChongwuzhaolingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuzhaoling, "chongwuzhaoling")); 
		ChongwuzhaolingView chongwuzhaolingView =  chongwuzhaolingService.selectView(ew);
		return R.ok("查询宠物招领成功").put("data", chongwuzhaolingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwuzhaolingEntity chongwuzhaoling = chongwuzhaolingService.selectById(id);
        return R.ok().put("data", chongwuzhaoling);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwuzhaolingEntity chongwuzhaoling = chongwuzhaolingService.selectById(id);
        return R.ok().put("data", chongwuzhaoling);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuzhaolingEntity chongwuzhaoling, HttpServletRequest request){
    	chongwuzhaoling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuzhaoling);
        chongwuzhaolingService.insert(chongwuzhaoling);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuzhaolingEntity chongwuzhaoling, HttpServletRequest request){
    	chongwuzhaoling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuzhaoling);
        chongwuzhaolingService.insert(chongwuzhaoling);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwuzhaolingEntity chongwuzhaoling, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuzhaoling);
        chongwuzhaolingService.updateById(chongwuzhaoling);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwuzhaolingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChongwuzhaolingEntity> wrapper = new EntityWrapper<ChongwuzhaolingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = chongwuzhaolingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
