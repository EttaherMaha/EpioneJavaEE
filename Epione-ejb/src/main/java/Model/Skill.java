package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Skills database table.
 * 
 */
@Entity
@Table(name="Skills")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int experienceId;

	private Object description;

	private Object type;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="doctorId")
	private User user;

	public Skill() {
	}

	public int getExperienceId() {
		return this.experienceId;
	}

	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public Object getType() {
		return this.type;
	}

	public void setType(Object type) {
		this.type = type;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}