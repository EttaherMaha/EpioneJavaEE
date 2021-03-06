package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CustomUserLogin database table.
 * 
 */
@Entity
@NamedQuery(name="CustomUserLogin.findAll", query="SELECT c FROM CustomUserLogin c")
public class CustomUserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="LoginProvider")
	private Object loginProvider;

	@Column(name="ProviderKey")
	private Object providerKey;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="UserId")
	private User user;

	public CustomUserLogin() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getLoginProvider() {
		return this.loginProvider;
	}

	public void setLoginProvider(Object loginProvider) {
		this.loginProvider = loginProvider;
	}

	public Object getProviderKey() {
		return this.providerKey;
	}

	public void setProviderKey(Object providerKey) {
		this.providerKey = providerKey;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}