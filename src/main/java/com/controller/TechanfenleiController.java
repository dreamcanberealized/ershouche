package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.TechanfenleiEntity;
import com.entity.view.TechanfenleiView;
import com.service.TechanfenleiService;
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
 * 商品分类
 * 后端接口
 * @author 
 * @email 
 * @date
 */
@RestController
@RequestMapping("/techanfenlei")
public class TechanfenleiController {
    @Autowired
    private TechanfenleiService techanfenleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TechanfenleiEntity techanfenlei, 
		HttpServletRequest request){

        EntityWrapper<TechanfenleiEntity> ew = new EntityWrapper<TechanfenleiEntity>();
    	PageUtils page = techanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, techanfenlei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TechanfenleiEntity techanfenlei, HttpServletRequest request){
        EntityWrapper<TechanfenleiEntity> ew = new EntityWrapper<TechanfenleiEntity>();
    	PageUtils page = techanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, techanfenlei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TechanfenleiEntity techanfenlei){
       	EntityWrapper<TechanfenleiEntity> ew = new EntityWrapper<TechanfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( techanfenlei, "techanfenlei")); 
        return R.ok().put("data", techanfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TechanfenleiEntity techanfenlei){
        EntityWrapper< TechanfenleiEntity> ew = new EntityWrapper< TechanfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( techanfenlei, "techanfenlei")); 
		TechanfenleiView techanfenleiView =  techanfenleiService.selectView(ew);
		return R.ok("查询商品分类成功").put("data", techanfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TechanfenleiEntity techanfenlei = techanfenleiService.selectById(id);
        return R.ok().put("data", techanfenlei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TechanfenleiEntity techanfenlei = techanfenleiService.selectById(id);
        return R.ok().put("data", techanfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TechanfenleiEntity techanfenlei, HttpServletRequest request){
    	techanfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());

        techanfenleiService.insert(techanfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TechanfenleiEntity techanfenlei, HttpServletRequest request){
    	techanfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(techanfenlei);

        techanfenleiService.insert(techanfenlei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TechanfenleiEntity techanfenlei, HttpServletRequest request){
        techanfenleiService.updateById(techanfenlei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        techanfenleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TechanfenleiEntity> wrapper = new EntityWrapper<TechanfenleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = techanfenleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
