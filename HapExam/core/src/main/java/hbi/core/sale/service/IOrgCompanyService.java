package hbi.core.sale.service;

import java.util.List;

import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.OrgCompany;

public interface IOrgCompanyService {
	
	public List<OrgCompany> queryAllConpany(IRequest requestContext,int page,int pagesize);

}
