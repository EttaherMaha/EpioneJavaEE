package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ReponseInfo database table.
 * 
 */
@Entity
@NamedQuery(name="ReponseInfo.findAll", query="SELECT r FROM ReponseInfo r")
public class ReponseInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reponseId;

	private Object reponse;

	//bi-directional many-to-one association to QuestionInfo
	@ManyToOne
	@JoinColumn(name="questionId")
	private QuestionInfo questionInfo;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="patientId")
	private User user;

	public ReponseInfo() {
	}

	public int getReponseId() {
		return this.reponseId;
	}

	public void setReponseId(int reponseId) {
		this.reponseId = reponseId;
	}

	public Object getReponse() {
		return this.reponse;
	}

	public void setReponse(Object reponse) {
		this.reponse = reponse;
	}

	public QuestionInfo getQuestionInfo() {
		return this.questionInfo;
	}

	public void setQuestionInfo(QuestionInfo questionInfo) {
		this.questionInfo = questionInfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}