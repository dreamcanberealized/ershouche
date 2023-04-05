package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscusstechanxinxiEntity;
import com.entity.view.DiscusstechanxinxiView;
import com.entity.vo.DiscusstechanxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 商品信息评论表
 *
 * @author 
 * @email 
 * @date
 */
public interface DiscusstechanxinxiService extends IService<DiscusstechanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstechanxinxiVO> selectListVO(Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	DiscusstechanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	List<DiscusstechanxinxiView> selectListView(Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	DiscusstechanxinxiView selectView(@Param("ew") Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstechanxinxiEntity> wrapper);
   	
}

