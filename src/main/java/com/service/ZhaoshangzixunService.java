package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZhaoshangzixunEntity;
import com.entity.view.ZhaoshangzixunView;
import com.entity.vo.ZhaoshangzixunVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 招商资讯
 *
 * @author 
 * @email 
 * @date
 */
public interface ZhaoshangzixunService extends IService<ZhaoshangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaoshangzixunVO> selectListVO(Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	ZhaoshangzixunVO selectVO(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	List<ZhaoshangzixunView> selectListView(Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	ZhaoshangzixunView selectView(@Param("ew") Wrapper<ZhaoshangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaoshangzixunEntity> wrapper);
   	
}

