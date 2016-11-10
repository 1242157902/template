package cn.ncut.service;

import java.util.List;

import cn.ncut.po.ItemsCustom;
import cn.ncut.po.ItemsQueryVo;

/**
 * 
*
*<p>Title:ItemsService</p>
*<p>Description:商品管理service</p>
*<p>Company:ncut</p> 
* @author lph 
* @date 2016-10-31上午10:49:25
*
 */
public interface ItemsService {

	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
}
