package com.entity.model;

import com.entity.ChongwulingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宠物领养
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 22:33:27
 */
public class ChongwulingyangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 身体状况
	 */
	
	private String shentizhuangkuang;
		
	/**
	 * 宠物性别
	 */
	
	private String chongwuxingbie;
		
	/**
	 * 宠物状态
	 */
	
	private String chongwuzhuangtai;
		
	/**
	 * 宠物图片
	 */
	
	private String chongwutupian;
		
	/**
	 * 宠物年龄
	 */
	
	private String chongwunianling;
		
	/**
	 * 宠物性情
	 */
	
	private String chongwuxingqing;
		
	/**
	 * 宠物爱好
	 */
	
	private String chongwuaihao;
		
	/**
	 * 宠物详情
	 */
	
	private String chongwuxiangqing;
				
	
	/**
	 * 设置：宠物种类
	 */
	 
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
				
	
	/**
	 * 设置：身体状况
	 */
	 
	public void setShentizhuangkuang(String shentizhuangkuang) {
		this.shentizhuangkuang = shentizhuangkuang;
	}
	
	/**
	 * 获取：身体状况
	 */
	public String getShentizhuangkuang() {
		return shentizhuangkuang;
	}
				
	
	/**
	 * 设置：宠物性别
	 */
	 
	public void setChongwuxingbie(String chongwuxingbie) {
		this.chongwuxingbie = chongwuxingbie;
	}
	
	/**
	 * 获取：宠物性别
	 */
	public String getChongwuxingbie() {
		return chongwuxingbie;
	}
				
	
	/**
	 * 设置：宠物状态
	 */
	 
	public void setChongwuzhuangtai(String chongwuzhuangtai) {
		this.chongwuzhuangtai = chongwuzhuangtai;
	}
	
	/**
	 * 获取：宠物状态
	 */
	public String getChongwuzhuangtai() {
		return chongwuzhuangtai;
	}
				
	
	/**
	 * 设置：宠物图片
	 */
	 
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
	}
				
	
	/**
	 * 设置：宠物年龄
	 */
	 
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
				
	
	/**
	 * 设置：宠物性情
	 */
	 
	public void setChongwuxingqing(String chongwuxingqing) {
		this.chongwuxingqing = chongwuxingqing;
	}
	
	/**
	 * 获取：宠物性情
	 */
	public String getChongwuxingqing() {
		return chongwuxingqing;
	}
				
	
	/**
	 * 设置：宠物爱好
	 */
	 
	public void setChongwuaihao(String chongwuaihao) {
		this.chongwuaihao = chongwuaihao;
	}
	
	/**
	 * 获取：宠物爱好
	 */
	public String getChongwuaihao() {
		return chongwuaihao;
	}
				
	
	/**
	 * 设置：宠物详情
	 */
	 
	public void setChongwuxiangqing(String chongwuxiangqing) {
		this.chongwuxiangqing = chongwuxiangqing;
	}
	
	/**
	 * 获取：宠物详情
	 */
	public String getChongwuxiangqing() {
		return chongwuxiangqing;
	}
			
}
