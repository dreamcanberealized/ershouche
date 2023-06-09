package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.ZhaoshangzixunEntity;
import com.entity.view.ZhaoshangzixunView;
import com.service.ZhaoshangzixunService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


/**
 * 招商资讯
 * 后端接口
 * @author 
 * @email 
 * @date
 */
@RestController
@RequestMapping("/zhaoshangzixun")
public class ZhaoshangzixunController {
    @Autowired
    private ZhaoshangzixunService zhaoshangzixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaoshangzixunEntity zhaoshangzixun, 
		HttpServletRequest request){

        EntityWrapper<ZhaoshangzixunEntity> ew = new EntityWrapper<ZhaoshangzixunEntity>();
    	PageUtils page = zhaoshangzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaoshangzixun), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaoshangzixunEntity zhaoshangzixun, HttpServletRequest request){
        EntityWrapper<ZhaoshangzixunEntity> ew = new EntityWrapper<ZhaoshangzixunEntity>();
    	PageUtils page = zhaoshangzixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaoshangzixun), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaoshangzixunEntity zhaoshangzixun){
       	EntityWrapper<ZhaoshangzixunEntity> ew = new EntityWrapper<ZhaoshangzixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaoshangzixun, "zhaoshangzixun")); 
        return R.ok().put("data", zhaoshangzixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaoshangzixunEntity zhaoshangzixun){
        EntityWrapper< ZhaoshangzixunEntity> ew = new EntityWrapper< ZhaoshangzixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaoshangzixun, "zhaoshangzixun")); 
		ZhaoshangzixunView zhaoshangzixunView =  zhaoshangzixunService.selectView(ew);
		return R.ok("查询招商资讯成功").put("data", zhaoshangzixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaoshangzixunEntity zhaoshangzixun = zhaoshangzixunService.selectById(id);
        return R.ok().put("data", zhaoshangzixun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaoshangzixunEntity zhaoshangzixun = zhaoshangzixunService.selectById(id);
        return R.ok().put("data", zhaoshangzixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaoshangzixunEntity zhaoshangzixun, HttpServletRequest request){
    	zhaoshangzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
        zhaoshangzixunService.insert(zhaoshangzixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaoshangzixunEntity zhaoshangzixun, HttpServletRequest request){
    	zhaoshangzixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaoshangzixun);

        zhaoshangzixunService.insert(zhaoshangzixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaoshangzixunEntity zhaoshangzixun, HttpServletRequest request){
        zhaoshangzixunService.updateById(zhaoshangzixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaoshangzixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhaoshangzixunEntity> wrapper = new EntityWrapper<ZhaoshangzixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhaoshangzixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
