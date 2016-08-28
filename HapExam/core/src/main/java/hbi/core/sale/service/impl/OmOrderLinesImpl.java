package hbi.core.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.sale.dto.OmOrderLines;
import hbi.core.sale.mapper.OmOrderLinesMapper;
import hbi.core.sale.service.IOmOrderLinesService;
@Service
public class OmOrderLinesImpl extends BaseServiceImpl<OmOrderLines> implements IOmOrderLinesService{

	@Autowired
	OmOrderLinesMapper omOrderLinesMapper;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<OmOrderLines> batchUpdate(IRequest reIRequest, List<OmOrderLines> orderLines) {
		// TODO Auto-generated method stub
		for(OmOrderLines orderLine:orderLines){
			if(orderLine.get__status()!= null){
				switch (orderLine.get__status()) {
				case DTOStatus.ADD:
					omOrderLinesMapper.insertOrderLine(orderLine);
					break;
				case DTOStatus.DELETE:
					omOrderLinesMapper.deleteOrderLine(orderLine);
					break;			
				case DTOStatus.UPDATE:
					omOrderLinesMapper.updateOrderLine(orderLine);
					break;
				default:
					break;
				}
			}
		}
		
		
		return orderLines;
	}

	@Override
	public List<OmOrderLines> queryOrder(IRequest requestContext, int page, int pagesize, OmOrderLines omOrderLines) {
		PageHelper.startPage(page, pagesize);
		// TODO Auto-generated method stub
		return omOrderLinesMapper.queryOrder(omOrderLines);
	}

}
