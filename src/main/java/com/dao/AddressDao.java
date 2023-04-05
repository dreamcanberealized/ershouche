package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.AddressEntity;
import com.entity.view.AddressView;
import com.entity.vo.AddressVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 地址
 * 
 * @author 
 * @email 
 * @date
 */
public interface AddressDao extends BaseMapper<AddressEntity> {
	
	List<AddressVO> selectListVO(@Param("ew") Wrapper<AddressEntity> wrapper);
	
	AddressVO selectVO(@Param("ew") Wrapper<AddressEntity> wrapper);
	
	List<AddressView> selectListView(@Param("ew") Wrapper<AddressEntity> wrapper);

	List<AddressView> selectListView(Pagination page,@Param("ew") Wrapper<AddressEntity> wrapper);
	
	AddressView selectView(@Param("ew") Wrapper<AddressEntity> wrapper);
	
}
