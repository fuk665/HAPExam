package hbi.core.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.OrgCompany;
import hbi.core.sale.mapper.OrgCompanyMapper;
import hbi.core.sale.service.IOrgCompanyService;
@Service
public class OrgCompanyImpl implements IOrgCompanyService{

	@Autowired
	OrgCompanyMapper orgCompanyMapper;
	
	@Override
	public List<OrgCompany> queryAllConpany(IRequest requestContext, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		// TODO Auto-generated method stub
		return orgCompanyMapper.queryAllConpany();
	}

}
