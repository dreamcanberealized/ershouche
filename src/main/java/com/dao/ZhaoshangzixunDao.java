package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZhaoshangzixunEntity;
import com.entity.view.ZhaoshangzixunView;
import com.entity.vo.ZhaoshangzixunVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 招商资讯
 * 
 * @author 
 * @email 
 * @date
 */
public interface ZhaoshangzixunDao extends BaseMapper<ZhaoshangzixunEntity> {
	
	List<ZhaoshangzixunVO> selectListVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	ZhaoshangzixunVO selectVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	List<ZhaoshangzixunView> selectListView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);

	List<ZhaoshangzixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
	ZhaoshangzixunView selectView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
	
}
