package hbi.core.sale.service;

import java.util.List;

import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.InvInventoryItems;

public interface IInvInventoryItemsService {
	
	public List<InvInventoryItems> queryAllItems(IRequest requestContext,int page,int pagesize);

}
