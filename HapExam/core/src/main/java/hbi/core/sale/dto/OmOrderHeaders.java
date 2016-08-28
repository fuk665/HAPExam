package hbi.core.sale.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name="hap_om_order_headers")
public class OmOrderHeaders extends BaseDTO{
	

	@Column
	private Long headerId;
	
	@Column
	private String orderNumber;
	
	@Column
	private Long companyId;
	
	@Column
	private Date orderDate;
	
	@Column
	private String orderStatus;
	
	@Column
	private Long customerId;
	
	@Column
	private Long objectVersionNumber;
	
	@Column
	private Long requestId;
	
	@Column
	private Long programId;
	
	@Column
	private String attributeCategory;
	
	@Transient
	private OrgCompany orgCompany;
	
	@Transient
	private ArCustomers arCustomers;
	
	@Transient
	private InvInventoryItems invInventoryItems;
	
	@Transient
	private OmOrderLines omOrderLines;
	
	@Transient
	private Long orderMoney;

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getObjectVersionNumber() {
		return objectVersionNumber;
	}

	public void setObjectVersionNumber(Long objectVersionNumber) {
		this.objectVersionNumber = objectVersionNumber;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public String getAttributeCategory() {
		return attributeCategory;
	}

	public void setAttributeCategory(String attributeCategory) {
		this.attributeCategory = attributeCategory;
	}

	public OrgCompany getOrgCompany() {
		return orgCompany;
	}

	public void setOrgCompany(OrgCompany orgCompany) {
		this.orgCompany = orgCompany;
	}

	public ArCustomers getArCustomers() {
		return arCustomers;
	}

	public void setArCustomers(ArCustomers arCustomers) {
		this.arCustomers = arCustomers;
	}

	public Long getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}

	public InvInventoryItems getInvInventoryItems() {
		return invInventoryItems;
	}

	public void setInvInventoryItems(InvInventoryItems invInventoryItems) {
		this.invInventoryItems = invInventoryItems;
	}

	public OmOrderLines getOmOrderLines() {
		return omOrderLines;
	}

	public void setOmOrderLines(OmOrderLines omOrderLines) {
		this.omOrderLines = omOrderLines;
	}
	
	
}
