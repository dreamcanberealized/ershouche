package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.TechanxinxiEntity;
import com.entity.view.TechanxinxiView;
import com.entity.vo.TechanxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 商品信息
 *
 * @author 
 * @email 
 * @date
 */
public interface TechanxinxiService extends IService<TechanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TechanxinxiVO> selectListVO(Wrapper<TechanxinxiEntity> wrapper);
   	
   	TechanxinxiVO selectVO(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
   	
   	List<TechanxinxiView> selectListView(Wrapper<TechanxinxiEntity> wrapper);
   	
   	TechanxinxiView selectView(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TechanxinxiEntity> wrapper);
   	
}

