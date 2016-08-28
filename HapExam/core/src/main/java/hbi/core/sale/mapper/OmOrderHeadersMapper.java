package hbi.core.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sale.dto.OmOrderHeaders;

public interface OmOrderHeadersMapper extends Mapper<OmOrderHeaders>{
	
	public List<OmOrderHeaders> queryAllOrder();
	
	public List<OmOrderHeaders> queryItemsByClass(OmOrderHeaders omOrderHeaders);
	
	public int insertOrder(OmOrderHeaders omOrderHeaders);
	
	public List<OmOrderHeaders> queryDetailOrder(OmOrderHeaders omOrderHeaders);
	
	public OmOrderHeaders querysomeOrder(Long id);

}
