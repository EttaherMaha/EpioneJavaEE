package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Notification database table.
 * 
 */
@Entity
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int notificationId;

	private int appointmentId;

	private Object message;

	private Object objectNotification;

	//bi-directional many-to-one association to Appointment
	@ManyToOne
	private Appointment appointment;

	public Notification() {
	}

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Object getMessage() {
		return this.message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Object getObjectNotification() {
		return this.objectNotification;
	}

	public void setObjectNotification(Object objectNotification) {
		this.objectNotification = objectNotification;
	}

	public Appointment getAppointment() {
		return this.appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}