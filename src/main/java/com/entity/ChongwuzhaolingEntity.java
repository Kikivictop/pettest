package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物招领
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
@TableName("chongwuzhaoling")
public class ChongwuzhaolingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuzhaolingEntity() {
		
	}
	
	public ChongwuzhaolingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宠物昵称
	 */
					
	private String chongwunicheng;
	
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
	 * 宠物图片
	 */
					
	private String chongwutupian;
	
	/**
	 * 认领地址
	 */
					
	private String renlingdizhi;
	
	/**
	 * 领养状态
	 */
					
	private String lingyangzhuangtai;
	
	/**
	 * 发现时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date faxianshijian;
	
	/**
	 * 发现地点
	 */
					
	private String faxiandidian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 宠物特点
	 */
					
	private String chongwutedian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物昵称
	 */
	public void setChongwunicheng(String chongwunicheng) {
		this.chongwunicheng = chongwunicheng;
	}
	/**
	 * 获取：宠物昵称
	 */
	public String getChongwunicheng() {
		return chongwunicheng;
	}
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
	 * 设置：认领地址
	 */
	public void setRenlingdizhi(String renlingdizhi) {
		this.renlingdizhi = renlingdizhi;
	}
	/**
	 * 获取：认领地址
	 */
	public String getRenlingdizhi() {
		return renlingdizhi;
	}
	/**
	 * 设置：领养状态
	 */
	public void setLingyangzhuangtai(String lingyangzhuangtai) {
		this.lingyangzhuangtai = lingyangzhuangtai;
	}
	/**
	 * 获取：领养状态
	 */
	public String getLingyangzhuangtai() {
		return lingyangzhuangtai;
	}
	/**
	 * 设置：发现时间
	 */
	public void setFaxianshijian(Date faxianshijian) {
		this.faxianshijian = faxianshijian;
	}
	/**
	 * 获取：发现时间
	 */
	public Date getFaxianshijian() {
		return faxianshijian;
	}
	/**
	 * 设置：发现地点
	 */
	public void setFaxiandidian(String faxiandidian) {
		this.faxiandidian = faxiandidian;
	}
	/**
	 * 获取：发现地点
	 */
	public String getFaxiandidian() {
		return faxiandidian;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：宠物特点
	 */
	public void setChongwutedian(String chongwutedian) {
		this.chongwutedian = chongwutedian;
	}
	/**
	 * 获取：宠物特点
	 */
	public String getChongwutedian() {
		return chongwutedian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
