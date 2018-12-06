package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Appointment database table.
 * 
 */
@Entity
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AppointementId")
	private int appointementId;

	@Column(name="Analysis")
	private Object analysis;

	@Column(name="AttachementFile")
	private Object attachementFile;

	private Object comment;

	private boolean confirmation;

	@Column(name="ConfirmProgress")
	private boolean confirmProgress;

	private String dateAppointement;

	@Column(name="Diagnosis")
	private Object diagnosis;

	private int doctorIdReferant;

	@Column(name="Medication")
	private Object medication;

	private Object message;

	private Object reason;

	private Object report;

	private Object state;

	@Column(name="TypeOfVisit")
	private Object typeOfVisit;

	//bi-directional many-to-one association to MedicalRecord
	@ManyToOne
	@JoinColumn(name="medicalRecordid")
	private MedicalRecord medicalRecord;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="doctorId")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="patientId")
	private User user2;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="appointment")
	private List<Notification> notifications;

	public Appointment() {
	}

	public int getAppointementId() {
		return this.appointementId;
	}

	public void setAppointementId(int appointementId) {
		this.appointementId = appointementId;
	}

	public Object getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(Object analysis) {
		this.analysis = analysis;
	}

	public Object getAttachementFile() {
		return this.attachementFile;
	}

	public void setAttachementFile(Object attachementFile) {
		this.attachementFile = attachementFile;
	}

	public Object getComment() {
		return this.comment;
	}

	public void setComment(Object comment) {
		this.comment = comment;
	}

	public boolean getConfirmation() {
		return this.confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public boolean getConfirmProgress() {
		return this.confirmProgress;
	}

	public void setConfirmProgress(boolean confirmProgress) {
		this.confirmProgress = confirmProgress;
	}

	public String getDateAppointement() {
		return this.dateAppointement;
	}

	public void setDateAppointement(String dateAppointement) {
		this.dateAppointement = dateAppointement;
	}

	public Object getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(Object diagnosis) {
		this.diagnosis = diagnosis;
	}

	public int getDoctorIdReferant() {
		return this.doctorIdReferant;
	}

	public void setDoctorIdReferant(int doctorIdReferant) {
		this.doctorIdReferant = doctorIdReferant;
	}

	public Object getMedication() {
		return this.medication;
	}

	public void setMedication(Object medication) {
		this.medication = medication;
	}

	public Object getMessage() {
		return this.message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Object getReason() {
		return this.reason;
	}

	public void setReason(Object reason) {
		this.reason = reason;
	}

	public Object getReport() {
		return this.report;
	}

	public void setReport(Object report) {
		this.report = report;
	}

	public Object getState() {
		return this.state;
	}

	public void setState(Object state) {
		this.state = state;
	}

	public Object getTypeOfVisit() {
		return this.typeOfVisit;
	}

	public void setTypeOfVisit(Object typeOfVisit) {
		this.typeOfVisit = typeOfVisit;
	}

	public MedicalRecord getMedicalRecord() {
		return this.medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setAppointment(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setAppointment(null);

		return notification;
	}

}