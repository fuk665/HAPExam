package hbi.core.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.InvInventoryItems;
import hbi.core.sale.mapper.InvInventoryItemsMapper;
import hbi.core.sale.service.IInvInventoryItemsService;

@Service
public class InvInventoryItemsServiceImpl implements IInvInventoryItemsService{

	@Autowired
	InvInventoryItemsMapper invInventoryItemsMapper;
	@Override
	public List<InvInventoryItems> queryAllItems(IRequest requestContext, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		// TODO Auto-generated method stub
		return invInventoryItemsMapper.queryAllItems();
	}

}
