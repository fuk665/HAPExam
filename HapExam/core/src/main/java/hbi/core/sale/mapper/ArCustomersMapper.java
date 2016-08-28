package hbi.core.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sale.dto.ArCustomers;

public interface ArCustomersMapper extends Mapper<ArCustomers>{
	
	public List<ArCustomers> queryAllCustomer(ArCustomers arcustomers);

}
