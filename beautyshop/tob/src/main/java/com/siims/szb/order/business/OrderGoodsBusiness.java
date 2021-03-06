package com.siims.szb.order.business;

import java.util.Set;

import com.siims.framework.base.BaseBusiness;
import com.siims.szb.order.facade.ListFacade;

public interface OrderGoodsBusiness extends BaseBusiness{

	public String create(String orderId, String goodsId, String goodsconfigId, String shopId, String price, String num, String paytype);

	public ListFacade queryOrderGoods(String id);
	
	public Set<String> queryByShopId(String shopId);

	public ListFacade queryOrderGoodsByOrderId(String orderId);
	
	public ListFacade queryAllInfoByShopId(String shopId);

}


