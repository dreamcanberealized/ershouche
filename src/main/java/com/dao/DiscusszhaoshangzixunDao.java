package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscusszhaoshangzixunEntity;
import com.entity.view.DiscusszhaoshangzixunView;
import com.entity.vo.DiscusszhaoshangzixunVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 招商资讯评论表
 * 
 * @author 
 * @email 
 * @date
 */
public interface DiscusszhaoshangzixunDao extends BaseMapper<DiscusszhaoshangzixunEntity> {
	
	List<DiscusszhaoshangzixunVO> selectListVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	DiscusszhaoshangzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	List<DiscusszhaoshangzixunView> selectListView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);

	List<DiscusszhaoshangzixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
	DiscusszhaoshangzixunView selectView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
	
}
