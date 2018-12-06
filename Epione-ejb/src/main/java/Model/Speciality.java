package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Speciality database table.
 * 
 */
@Entity
@NamedQuery(name="Speciality.findAll", query="SELECT s FROM Speciality s")
public class Speciality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specialityId;

	private Object name;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="speciality")
	private List<User> users;

	public Speciality() {
	}

	public int getSpecialityId() {
		return this.specialityId;
	}

	public void setSpecialityId(int specialityId) {
		this.specialityId = specialityId;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSpeciality(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSpeciality(null);

		return user;
	}

}