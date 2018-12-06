package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Events database table.
 * 
 */
@Entity
@Table(name="Events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eventId;

	private int doctorId;

	private String end;

	private int isFullDay;

	private String start;

	private Object subject;

	private Object themeColor;

	public Event() {
	}

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getIsFullDay() {
		return this.isFullDay;
	}

	public void setIsFullDay(int isFullDay) {
		this.isFullDay = isFullDay;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public Object getSubject() {
		return this.subject;
	}

	public void setSubject(Object subject) {
		this.subject = subject;
	}

	public Object getThemeColor() {
		return this.themeColor;
	}

	public void setThemeColor(Object themeColor) {
		this.themeColor = themeColor;
	}

}