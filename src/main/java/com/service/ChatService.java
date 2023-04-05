package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ChatEntity;
import com.entity.view.ChatView;
import com.entity.vo.ChatVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 在线客服
 *
 * @author 
 * @email 
 * @date
 */
public interface ChatService extends IService<ChatEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChatVO> selectListVO(Wrapper<ChatEntity> wrapper);
   	
   	ChatVO selectVO(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	List<ChatView> selectListView(Wrapper<ChatEntity> wrapper);
   	
   	ChatView selectView(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChatEntity> wrapper);
   	
}

