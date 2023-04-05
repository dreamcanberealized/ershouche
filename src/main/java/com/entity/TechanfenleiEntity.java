package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 商品分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date
 */
@TableName("techanfenlei")
public class TechanfenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TechanfenleiEntity() {
		
	}
	
	public TechanfenleiEntity(T t) {
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
	 * 商品分类
	 */
					
	private String techanfenlei;
	
	
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
	 * 设置：商品分类
	 */
	public void setTechanfenlei(String techanfenlei) {
		this.techanfenlei = techanfenlei;
	}
	/**
	 * 获取：商品分类
	 */
	public String getTechanfenlei() {
		return techanfenlei;
	}

}
