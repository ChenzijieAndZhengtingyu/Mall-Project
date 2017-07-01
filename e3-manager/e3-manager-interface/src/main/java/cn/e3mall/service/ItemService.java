package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 商品管理Service 接口
 * @author Administrator
 *
 */
public interface ItemService {
	TbItem getItemById(long itemId);

}
