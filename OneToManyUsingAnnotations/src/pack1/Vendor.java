package pack1;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
					generator = "test_generator")
	@SequenceGenerator(name="test_generator", 
						sequenceName = "empven_seq",
						allocationSize=1)
	private int venId;
	
	@Column(length=20)
	private String venName;
	
	@JoinColumn(name="vendorId")
	@OneToMany(targetEntity=Customer.class,cascade=CascadeType.ALL)
	private Set<Customer> customerList;

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public Set<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Set<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
	
	
	

}
