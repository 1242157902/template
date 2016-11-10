package cn.ncut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.ncut.mapper.ItemsMapperCustom;
import cn.ncut.po.ItemsCustom;
import cn.ncut.po.ItemsQueryVo;
import cn.ncut.service.ItemsService;

/**
 * 
*
*<p>Title:ItemsServiceImpl</p>
*<p>Description:商品管理</p>
*<p>Company:ncut</p> 
* @author lph 
* @date 2016-10-31上午10:53:41
*
 */
public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		// 通过ItemsMapperCustom查询数据库
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

}
