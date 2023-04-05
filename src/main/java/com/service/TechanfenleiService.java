package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.TechanfenleiEntity;
import com.entity.view.TechanfenleiView;
import com.entity.vo.TechanfenleiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 商品分类
 *
 * @author 
 * @email 
 * @date
 */
public interface TechanfenleiService extends IService<TechanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TechanfenleiVO> selectListVO(Wrapper<TechanfenleiEntity> wrapper);
   	
   	TechanfenleiVO selectVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
   	
   	List<TechanfenleiView> selectListView(Wrapper<TechanfenleiEntity> wrapper);
   	
   	TechanfenleiView selectView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TechanfenleiEntity> wrapper);
   	
}

