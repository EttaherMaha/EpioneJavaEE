package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the QuestionInfo database table.
 * 
 */
@Entity
@NamedQuery(name="QuestionInfo.findAll", query="SELECT q FROM QuestionInfo q")
public class QuestionInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int questionId;

	private Object choix1;

	private Object choix2;

	private Object choix3;

	private Object question;

	//bi-directional many-to-one association to ReponseInfo
	@OneToMany(mappedBy="questionInfo")
	private List<ReponseInfo> reponseInfos;

	public QuestionInfo() {
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public Object getChoix1() {
		return this.choix1;
	}

	public void setChoix1(Object choix1) {
		this.choix1 = choix1;
	}

	public Object getChoix2() {
		return this.choix2;
	}

	public void setChoix2(Object choix2) {
		this.choix2 = choix2;
	}

	public Object getChoix3() {
		return this.choix3;
	}

	public void setChoix3(Object choix3) {
		this.choix3 = choix3;
	}

	public Object getQuestion() {
		return this.question;
	}

	public void setQuestion(Object question) {
		this.question = question;
	}

	public List<ReponseInfo> getReponseInfos() {
		return this.reponseInfos;
	}

	public void setReponseInfos(List<ReponseInfo> reponseInfos) {
		this.reponseInfos = reponseInfos;
	}

	public ReponseInfo addReponseInfo(ReponseInfo reponseInfo) {
		getReponseInfos().add(reponseInfo);
		reponseInfo.setQuestionInfo(this);

		return reponseInfo;
	}

	public ReponseInfo removeReponseInfo(ReponseInfo reponseInfo) {
		getReponseInfos().remove(reponseInfo);
		reponseInfo.setQuestionInfo(null);

		return reponseInfo;
	}

}