package pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {

	@Override
	public String toString() {
		return "Vendor [vendId=" + vendId + ", venName=" + venName + "]";
	}

	@Id
	private int vendId;
	
	@Column(length=20)
	private String venName;

	public int getVendId() {
		return vendId;
	}

	public void setVendId(int vendId) {
		this.vendId = vendId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

}
