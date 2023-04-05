package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscusstechanxinxiEntity;
import com.entity.view.DiscusstechanxinxiView;
import com.entity.vo.DiscusstechanxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 商品信息评论表
 * 
 * @author 
 * @email 
 * @date
 */
public interface DiscusstechanxinxiDao extends BaseMapper<DiscusstechanxinxiEntity> {
	
	List<DiscusstechanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
	
	DiscusstechanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
	
	List<DiscusstechanxinxiView> selectListView(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);

	List<DiscusstechanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
	
	DiscusstechanxinxiView selectView(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
	
}
