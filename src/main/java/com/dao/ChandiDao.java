package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ChandiEntity;
import com.entity.view.ChandiView;
import com.entity.vo.ChandiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 产地
 * 
 * @author 
 * @email 
 * @date
 */
public interface ChandiDao extends BaseMapper<ChandiEntity> {
	
	List<ChandiVO> selectListVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	ChandiVO selectVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	List<ChandiView> selectListView(@Param("ew") Wrapper<ChandiEntity> wrapper);

	List<ChandiView> selectListView(Pagination page,@Param("ew") Wrapper<ChandiEntity> wrapper);
	
	ChandiView selectView(@Param("ew") Wrapper<ChandiEntity> wrapper);
	
}
