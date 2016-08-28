package hbi.core.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sale.dto.InvInventoryItems;

public interface InvInventoryItemsMapper extends Mapper<InvInventoryItems>{
	
	public List<InvInventoryItems> queryAllItems();

}
