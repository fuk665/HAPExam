package hbi.core.sale.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



@Table(name="hap_org_companys")
public class OrgCompany{
	


	@Column
	private Long companyId;
	
	@Column
	private String companyNumber;
	
	@Column
	private String companyName;
	
	@Column
	private String enabledFlag;
	@Column
	private Long createdBy;
	@Column
	private Date creationDate;
	@Column
	private Long lastUpdatedBy;
	@Column
	private Date lastUpdateDate;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	
}
