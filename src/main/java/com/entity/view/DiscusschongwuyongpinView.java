package com.entity.view;

import com.entity.DiscusschongwuyongpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物用品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-07 12:53:36
 */
@TableName("discusschongwuyongpin")
public class DiscusschongwuyongpinView  extends DiscusschongwuyongpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwuyongpinView(){
	}
 
 	public DiscusschongwuyongpinView(DiscusschongwuyongpinEntity discusschongwuyongpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwuyongpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
