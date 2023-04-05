package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.TechanxinxiEntity;
import com.entity.view.TechanxinxiView;
import com.entity.vo.TechanxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 商品信息
 * 
 * @author 
 * @email 
 * @date
 */
public interface TechanxinxiDao extends BaseMapper<TechanxinxiEntity> {
	
	List<TechanxinxiVO> selectListVO(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	TechanxinxiVO selectVO(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	List<TechanxinxiView> selectListView(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);

	List<TechanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	TechanxinxiView selectView(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
}
