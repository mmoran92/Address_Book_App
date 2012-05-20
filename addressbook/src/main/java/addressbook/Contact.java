package addressbook;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	Long id;
	private String name;
	private String address;
	private String phonenumber;
	private Date signingDate;

	public Contact() {
	}

	public Contact(String name, String address, String phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.signingDate = new Date(System.currentTimeMillis());
	}

	@Override
	public String toString() {
		return "Name: " + name + "Phone Number: " + phonenumber + " Address:"
				+ address + " (Contact added on " + signingDate + ")";
	}
}