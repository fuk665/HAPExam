package hbi.core.sale.service;

import java.util.List;

import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.OmOrderHeaders;

public interface IOmOrderHeadersService{

//	public List<OmOrderHeaders> queryAllOrder(IRequest requestContext,int page,int pagesize);
	
	public List<OmOrderHeaders> queryItemsByClass(IRequest requestContext,int page,int pagesize,OmOrderHeaders omOrderHeaders);

	public int insertOrder(IRequest requestContext,int page,int pagesize,OmOrderHeaders omOrderHeaders);
	
	public List<OmOrderHeaders> queryDetailOrder(IRequest requestContext,int page,int pagesize,OmOrderHeaders omOrderHeaders);

	public OmOrderHeaders querysomeOrder(Long id);
}
