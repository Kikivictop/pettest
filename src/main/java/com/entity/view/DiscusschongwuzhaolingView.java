package com.entity.view;

import com.entity.DiscusschongwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物招领评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 22:33:27
 */
@TableName("discusschongwuzhaoling")
public class DiscusschongwuzhaolingView  extends DiscusschongwuzhaolingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwuzhaolingView(){
	}
 
 	public DiscusschongwuzhaolingView(DiscusschongwuzhaolingEntity discusschongwuzhaolingEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwuzhaolingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
