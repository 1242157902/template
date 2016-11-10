package cn.ncut.po;

import java.util.List;

import cn.ncut.po.Items;
import cn.ncut.po.ItemsCustom;

/**
 * 
*
*<p>Title:ItemsQueryVo</p>
*<p>Description:商品包装对象</p>
*<p>Company:ncut</p> 
* @author lph 
* @date 2016-10-31上午10:38:18
*
 */

public class ItemsQueryVo {
	//商品信息
		private Items items;
		
		//为了系统 可扩展性，对原始生成的po进行扩展
		private ItemsCustom itemsCustom;
		
		//批量商品信息
		private List<ItemsCustom> itemsList;
		

		public Items getItems() {
			return items;
		}

		public void setItems(Items items) {
			this.items = items;
		}

		public ItemsCustom getItemsCustom() {
			return itemsCustom;
		}

		public void setItemsCustom(ItemsCustom itemsCustom) {
			this.itemsCustom = itemsCustom;
		}

		public List<ItemsCustom> getItemsList() {
			return itemsList;
		}

		public void setItemsList(List<ItemsCustom> itemsList) {
			this.itemsList = itemsList;
		}
}