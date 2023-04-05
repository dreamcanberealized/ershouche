package com.entity.view;

import com.entity.TechanfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date
 */
@TableName("techanfenlei")
public class TechanfenleiView  extends TechanfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TechanfenleiView(){
	}
 
 	public TechanfenleiView(TechanfenleiEntity techanfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, techanfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
