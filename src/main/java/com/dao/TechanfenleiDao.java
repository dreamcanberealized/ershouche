package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.TechanfenleiEntity;
import com.entity.view.TechanfenleiView;
import com.entity.vo.TechanfenleiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 商品分类
 * 
 * @author 
 * @email 
 * @date
 */
public interface TechanfenleiDao extends BaseMapper<TechanfenleiEntity> {
	
	List<TechanfenleiVO> selectListVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	TechanfenleiVO selectVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	List<TechanfenleiView> selectListView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);

	List<TechanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	TechanfenleiView selectView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
}
