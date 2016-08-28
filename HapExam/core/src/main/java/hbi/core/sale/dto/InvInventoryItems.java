package hbi.core.sale.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name="hap_inv_inventory_items")
public class InvInventoryItems extends BaseDTO{
	

	@Column
	private long inventoryItemId;
	
	@Column
	private String itemCode;
	
	@Column
	private String itemUom;
	
	@Column
	private String itemDescription;
	
	@Column
	private String orderFlag;
	
	@Column
	private Date startActiveDate;
	
	@Column
	private Date endActiveDate;
	
	@Column
	private String enabledFlag;
	
	@Transient
	private Long headerId;
	
	

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public Date getStartActiveDate() {
		return startActiveDate;
	}

	public void setStartActiveDate(Date startActiveDate) {
		this.startActiveDate = startActiveDate;
	}

	public Date getEndActiveDate() {
		return endActiveDate;
	}

	public void setEndActiveDate(Date endActiveDate) {
		this.endActiveDate = endActiveDate;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	
}
