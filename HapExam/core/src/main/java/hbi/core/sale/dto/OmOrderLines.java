package hbi.core.sale.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name="hap_om_order_lines")
public class OmOrderLines extends BaseDTO{


	@Column
	private Long lineId;
	
	@Column
	private Long headerId;
	
	@Column
	private Long lineNumber;
	@Column
	private Long inventoryItemId;
	@Column
	private Long orderdQuantity;
	@Column
	private String orderQuantityUom;
	@Column

	private Long unitSellingPrice;
	@Column
	private String description;
	@Column
	private Long companyId;
	@Column
	private String addition1;
	@Column
	private String addition2;
	@Column
	private String addition3;
	@Column
	private String addition4;
	@Column
	private String addition5;
	@Column
	private Long requestId;
	@Column
	private Long programId;
	
	@Transient
	private Long orderMoney;
	@Transient
	private InvInventoryItems invInventoryItems;
	
	@Transient
	private String itemDescription;
	
	
	
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Long getLineId() {
		return lineId;
	}
	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}
	public Long getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}
	public Long getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(Long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}
	public Long getOrderdQuantity() {
		return orderdQuantity;
	}
	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}
	public String getOrderQuantityUom() {
		return orderQuantityUom;
	}
	public void setOrderQuantityUom(String orderQuantityUom) {
		this.orderQuantityUom = orderQuantityUom;
	}
	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}
	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getAddition1() {
		return addition1;
	}
	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}
	public String getAddition2() {
		return addition2;
	}
	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}
	public String getAddition3() {
		return addition3;
	}
	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}
	public String getAddition4() {
		return addition4;
	}
	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}
	public String getAddition5() {
		return addition5;
	}
	public void setAddition5(String addition5) {
		this.addition5 = addition5;
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
	public InvInventoryItems getInvInventoryItems() {
		return invInventoryItems;
	}
	public void setInvInventoryItems(InvInventoryItems invInventoryItems) {
		this.invInventoryItems = invInventoryItems;
	}
	public Long getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}
	
	
}
