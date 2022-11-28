package com.entity.view;

import com.entity.ChongwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物招领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 22:33:26
 */
@TableName("chongwuzhaoling")
public class ChongwuzhaolingView  extends ChongwuzhaolingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuzhaolingView(){
	}
 
 	public ChongwuzhaolingView(ChongwuzhaolingEntity chongwuzhaolingEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuzhaolingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
