package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscusszhaoshangzixunEntity;
import com.entity.view.DiscusszhaoshangzixunView;
import com.entity.vo.DiscusszhaoshangzixunVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 招商资讯评论表
 *
 * @author 
 * @email 
 * @date
 */
public interface DiscusszhaoshangzixunService extends IService<DiscusszhaoshangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhaoshangzixunVO> selectListVO(Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	DiscusszhaoshangzixunVO selectVO(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	List<DiscusszhaoshangzixunView> selectListView(Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	DiscusszhaoshangzixunView selectView(@Param("ew") Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhaoshangzixunEntity> wrapper);
   	
}

