package hbi.core.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;

import hbi.core.sale.dto.ArCustomers;
import hbi.core.sale.mapper.ArCustomersMapper;
import hbi.core.sale.service.IArCustomersService;

@Service
public class ArCustomerImpl implements IArCustomersService{

	@Autowired
	ArCustomersMapper arCustomersMapper;
	
	@Override
	public List<ArCustomers> queryAllCustomer(ArCustomers arcustomers,IRequest requestContext, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		// TODO Auto-generated method stub
		return arCustomersMapper.queryAllCustomer(arcustomers);
	}



}
