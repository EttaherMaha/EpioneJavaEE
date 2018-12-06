package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Suggestion database table.
 * 
 */
@Entity
@NamedQuery(name="Suggestion.findAll", query="SELECT s FROM Suggestion s")
public class Suggestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int suggId;

	private Object receiverEmail;

	private Object receiverFirstName;

	private Object receiverLastName;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	public Suggestion() {
	}

	public int getSuggId() {
		return this.suggId;
	}

	public void setSuggId(int suggId) {
		this.suggId = suggId;
	}

	public Object getReceiverEmail() {
		return this.receiverEmail;
	}

	public void setReceiverEmail(Object receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public Object getReceiverFirstName() {
		return this.receiverFirstName;
	}

	public void setReceiverFirstName(Object receiverFirstName) {
		this.receiverFirstName = receiverFirstName;
	}

	public Object getReceiverLastName() {
		return this.receiverLastName;
	}

	public void setReceiverLastName(Object receiverLastName) {
		this.receiverLastName = receiverLastName;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}