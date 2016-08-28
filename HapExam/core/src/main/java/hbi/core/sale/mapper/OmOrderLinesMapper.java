package hbi.core.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sale.dto.OmOrderLines;

public interface OmOrderLinesMapper extends Mapper<OmOrderLines>{
	
	public int insertOrderLine(OmOrderLines omOrderLines);
	
	public List<OmOrderLines> queryOrder(OmOrderLines omOrderLines);
	
	public int updateOrderLine(OmOrderLines omOrderLines);

	public int deleteOrderLine(OmOrderLines orderLine);
	
}
