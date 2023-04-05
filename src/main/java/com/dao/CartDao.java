package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.CartEntity;
import com.entity.view.CartView;
import com.entity.vo.CartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 购物车表
 * 
 * @author 
 * @email 
 * @date
 */
public interface CartDao extends BaseMapper<CartEntity> {
	
	List<CartVO> selectListVO(@Param("ew") Wrapper<CartEntity> wrapper);
	
	CartVO selectVO(@Param("ew") Wrapper<CartEntity> wrapper);
	
	List<CartView> selectListView(@Param("ew") Wrapper<CartEntity> wrapper);

	List<CartView> selectListView(Pagination page,@Param("ew") Wrapper<CartEntity> wrapper);
	
	CartView selectView(@Param("ew") Wrapper<CartEntity> wrapper);
	
}
