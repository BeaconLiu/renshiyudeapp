package com.entity.view;

import com.entity.ShiwufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食物分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
@TableName("shiwufenlei")
public class ShiwufenleiView  extends ShiwufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwufenleiView(){
	}
 
 	public ShiwufenleiView(ShiwufenleiEntity shiwufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shiwufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
