package hbi.core.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sale.dto.OrgCompany;

public interface OrgCompanyMapper extends Mapper<OrgCompany>{
	
	public List<OrgCompany> queryAllConpany();


}
