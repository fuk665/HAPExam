package hbi.core.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.OmOrderHeaders;
import hbi.core.sale.mapper.OmOrderHeadersMapper;
import hbi.core.sale.service.IOmOrderHeadersService;

@Service
public class OmOrderHeadersImpl implements IOmOrderHeadersService{

	@Autowired
	private OmOrderHeadersMapper omOrderHeadersMapper;
	
	@Override
	public List<OmOrderHeaders> queryItemsByClass(IRequest requestContext, int page, int pagesize,
			OmOrderHeaders omOrderHeaders) {
		PageHelper.startPage(page, pagesize);
		// TODO Auto-generated method stub
		return omOrderHeadersMapper.queryItemsByClass(omOrderHeaders);
	}

	@Override
	public int insertOrder(IRequest requestContext, int page, int pagesize, OmOrderHeaders omOrderHeaders) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return omOrderHeadersMapper.insertOrder(omOrderHeaders);
	}

	@Override
	public List<OmOrderHeaders> queryDetailOrder(IRequest requestContext, int page, int pagesize,
			OmOrderHeaders omOrderHeaders) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return omOrderHeadersMapper.queryDetailOrder(omOrderHeaders);
	}

	@Override
	public OmOrderHeaders querysomeOrder(Long id) {
		// TODO Auto-generated method stub
		return omOrderHeadersMapper.querysomeOrder(id);
	}

}
