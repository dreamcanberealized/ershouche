package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ChandiEntity;
import com.entity.view.ChandiView;
import com.entity.vo.ChandiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 产地
 *
 * @author 
 * @email 
 * @date
 */
public interface ChandiService extends IService<ChandiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChandiVO> selectListVO(Wrapper<ChandiEntity> wrapper);
   	
   	ChandiVO selectVO(@Param("ew") Wrapper<ChandiEntity> wrapper);
   	
   	List<ChandiView> selectListView(Wrapper<ChandiEntity> wrapper);
   	
   	ChandiView selectView(@Param("ew") Wrapper<ChandiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChandiEntity> wrapper);
   	
}

