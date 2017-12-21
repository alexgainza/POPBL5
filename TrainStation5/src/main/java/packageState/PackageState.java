package packageState;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "PackageState")
public class PackageState implements Serializable {

	private static final int serialVersionUID = 7;
	
	@OneToMany
	private int packageStateID;
	private String description;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPackageStateID() {
		return packageStateID;
	}
	public void setPackageStateID(int packageStateID) {
		this.packageStateID = packageStateID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
