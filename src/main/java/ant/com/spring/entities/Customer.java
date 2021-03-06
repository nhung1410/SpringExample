package ant.com.spring.entities;
// Generated Aug 9, 2019 10:48:01 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "shop")
public class Customer implements java.io.Serializable {

	private Integer id;
	private String email;
	private String phone;
	private String address;
	private Date createtedDate;

	public Customer() {
	}

	public Customer(String email, String phone, String address, Date createtedDate) {
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.createtedDate = createtedDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", length = 225)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createted_date", length = 19)
	public Date getCreatetedDate() {
		return this.createtedDate;
	}

	public void setCreatetedDate(Date createtedDate) {
		this.createtedDate = createtedDate;
	}

}
