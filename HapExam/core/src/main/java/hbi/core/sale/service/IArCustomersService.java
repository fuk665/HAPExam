package hbi.core.sale.service;

import java.util.List;

import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.ArCustomers;


public interface IArCustomersService {
	
	public List<ArCustomers> queryAllCustomer(ArCustomers arcustomers, IRequest requestContext,int page,int pagesize);

}
