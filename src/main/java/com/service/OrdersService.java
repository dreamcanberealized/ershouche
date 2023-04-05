package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.OrdersEntity;
import com.entity.view.OrdersView;
import com.entity.vo.OrdersVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 订单
 *
 * @author 
 * @email 
 * @date
 */
public interface OrdersService extends IService<OrdersEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<OrdersVO> selectListVO(Wrapper<OrdersEntity> wrapper);
   	
   	OrdersVO selectVO(@Param("ew") Wrapper<OrdersEntity> wrapper);
   	
   	List<OrdersView> selectListView(Wrapper<OrdersEntity> wrapper);
   	
   	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);
   	
}

