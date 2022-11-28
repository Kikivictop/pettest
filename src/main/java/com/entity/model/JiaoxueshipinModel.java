package com.entity.model;

import com.entity.JiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教学视频
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
public class JiaoxueshipinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 视频简介
	 */
	
	private String shipinjianjie;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 基本介绍
	 */
	
	private String jibenjieshao;
				
	
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
	 * 设置：视频简介
	 */
	 
	public void setShipinjianjie(String shipinjianjie) {
		this.shipinjianjie = shipinjianjie;
	}
	
	/**
	 * 获取：视频简介
	 */
	public String getShipinjianjie() {
		return shipinjianjie;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：基本介绍
	 */
	 
	public void setJibenjieshao(String jibenjieshao) {
		this.jibenjieshao = jibenjieshao;
	}
	
	/**
	 * 获取：基本介绍
	 */
	public String getJibenjieshao() {
		return jibenjieshao;
	}
			
}
