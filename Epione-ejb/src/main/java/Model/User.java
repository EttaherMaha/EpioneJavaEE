package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="AccessFailedCount")
	private int accessFailedCount;

	private Object address;

	private String birthDate;

	private Object confirmation;

	private Object degree;

	private Object education;

	@Column(name="Email")
	private Object email;

	@Column(name="EmailConfirmed")
	private boolean emailConfirmed;

	private Object experience;

	@Column(name="FirstName")
	private Object firstName;

	private Object gender;

	@Column(name="LastName")
	private Object lastName;

	@Column(name="LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private String lockoutEndDateUtc;

	@Column(name="Login")
	private Object login;

	@Column(name="MDP")
	private Object mdp;

	private Object officeAddress;

	private Object password;

	private Object pdf;

	@Column(name="PhoneNumber")
	private Object phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	private Object photo;

	private Object role;

	@Column(name="SecurityStamp")
	private Object securityStamp;

	@Column(name="TwoFactorEnabled")
	private boolean twoFactorEnabled;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="user1")
	private List<Appointment> appointments1;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="user2")
	private List<Appointment> appointments2;

	//bi-directional many-to-one association to Availibility
	@OneToMany(mappedBy="user")
	private List<Availibility> availibilities;

	//bi-directional many-to-one association to CustomUserClaim
	@OneToMany(mappedBy="user")
	private List<CustomUserClaim> customUserClaims;

	//bi-directional many-to-one association to CustomUserLogin
	@OneToMany(mappedBy="user")
	private List<CustomUserLogin> customUserLogins;

	//bi-directional many-to-one association to CustomUserRole
	@OneToMany(mappedBy="user")
	private List<CustomUserRole> customUserRoles;

	//bi-directional many-to-one association to Discussion
	@OneToMany(mappedBy="user1")
	private List<Discussion> discussions1;

	//bi-directional many-to-one association to Discussion
	@OneToMany(mappedBy="user2")
	private List<Discussion> discussions2;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="user")
	private List<Message> messages;

	//bi-directional many-to-one association to ReponseInfo
	@OneToMany(mappedBy="user")
	private List<ReponseInfo> reponseInfos;

	//bi-directional many-to-one association to Skill
	@OneToMany(mappedBy="user")
	private List<Skill> skills;

	//bi-directional many-to-one association to Suggestion
	@OneToMany(mappedBy="user")
	private List<Suggestion> suggestions;

	//bi-directional many-to-one association to Speciality
	@ManyToOne
	@JoinColumn(name="specialityId")
	private Speciality speciality;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public Object getAddress() {
		return this.address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	public String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Object getConfirmation() {
		return this.confirmation;
	}

	public void setConfirmation(Object confirmation) {
		this.confirmation = confirmation;
	}

	public Object getDegree() {
		return this.degree;
	}

	public void setDegree(Object degree) {
		this.degree = degree;
	}

	public Object getEducation() {
		return this.education;
	}

	public void setEducation(Object education) {
		this.education = education;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public Object getExperience() {
		return this.experience;
	}

	public void setExperience(Object experience) {
		this.experience = experience;
	}

	public Object getFirstName() {
		return this.firstName;
	}

	public void setFirstName(Object firstName) {
		this.firstName = firstName;
	}

	public Object getGender() {
		return this.gender;
	}

	public void setGender(Object gender) {
		this.gender = gender;
	}

	public Object getLastName() {
		return this.lastName;
	}

	public void setLastName(Object lastName) {
		this.lastName = lastName;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public String getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(String lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public Object getLogin() {
		return this.login;
	}

	public void setLogin(Object login) {
		this.login = login;
	}

	public Object getMdp() {
		return this.mdp;
	}

	public void setMdp(Object mdp) {
		this.mdp = mdp;
	}

	public Object getOfficeAddress() {
		return this.officeAddress;
	}

	public void setOfficeAddress(Object officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Object getPassword() {
		return this.password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

	public Object getPdf() {
		return this.pdf;
	}

	public void setPdf(Object pdf) {
		this.pdf = pdf;
	}

	public Object getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Object phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public Object getPhoto() {
		return this.photo;
	}

	public void setPhoto(Object photo) {
		this.photo = photo;
	}

	public Object getRole() {
		return this.role;
	}

	public void setRole(Object role) {
		this.role = role;
	}

	public Object getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(Object securityStamp) {
		this.securityStamp = securityStamp;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public List<Appointment> getAppointments1() {
		return this.appointments1;
	}

	public void setAppointments1(List<Appointment> appointments1) {
		this.appointments1 = appointments1;
	}

	public Appointment addAppointments1(Appointment appointments1) {
		getAppointments1().add(appointments1);
		appointments1.setUser1(this);

		return appointments1;
	}

	public Appointment removeAppointments1(Appointment appointments1) {
		getAppointments1().remove(appointments1);
		appointments1.setUser1(null);

		return appointments1;
	}

	public List<Appointment> getAppointments2() {
		return this.appointments2;
	}

	public void setAppointments2(List<Appointment> appointments2) {
		this.appointments2 = appointments2;
	}

	public Appointment addAppointments2(Appointment appointments2) {
		getAppointments2().add(appointments2);
		appointments2.setUser2(this);

		return appointments2;
	}

	public Appointment removeAppointments2(Appointment appointments2) {
		getAppointments2().remove(appointments2);
		appointments2.setUser2(null);

		return appointments2;
	}

	public List<Availibility> getAvailibilities() {
		return this.availibilities;
	}

	public void setAvailibilities(List<Availibility> availibilities) {
		this.availibilities = availibilities;
	}

	public Availibility addAvailibility(Availibility availibility) {
		getAvailibilities().add(availibility);
		availibility.setUser(this);

		return availibility;
	}

	public Availibility removeAvailibility(Availibility availibility) {
		getAvailibilities().remove(availibility);
		availibility.setUser(null);

		return availibility;
	}

	public List<CustomUserClaim> getCustomUserClaims() {
		return this.customUserClaims;
	}

	public void setCustomUserClaims(List<CustomUserClaim> customUserClaims) {
		this.customUserClaims = customUserClaims;
	}

	public CustomUserClaim addCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().add(customUserClaim);
		customUserClaim.setUser(this);

		return customUserClaim;
	}

	public CustomUserClaim removeCustomUserClaim(CustomUserClaim customUserClaim) {
		getCustomUserClaims().remove(customUserClaim);
		customUserClaim.setUser(null);

		return customUserClaim;
	}

	public List<CustomUserLogin> getCustomUserLogins() {
		return this.customUserLogins;
	}

	public void setCustomUserLogins(List<CustomUserLogin> customUserLogins) {
		this.customUserLogins = customUserLogins;
	}

	public CustomUserLogin addCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().add(customUserLogin);
		customUserLogin.setUser(this);

		return customUserLogin;
	}

	public CustomUserLogin removeCustomUserLogin(CustomUserLogin customUserLogin) {
		getCustomUserLogins().remove(customUserLogin);
		customUserLogin.setUser(null);

		return customUserLogin;
	}

	public List<CustomUserRole> getCustomUserRoles() {
		return this.customUserRoles;
	}

	public void setCustomUserRoles(List<CustomUserRole> customUserRoles) {
		this.customUserRoles = customUserRoles;
	}

	public CustomUserRole addCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().add(customUserRole);
		customUserRole.setUser(this);

		return customUserRole;
	}

	public CustomUserRole removeCustomUserRole(CustomUserRole customUserRole) {
		getCustomUserRoles().remove(customUserRole);
		customUserRole.setUser(null);

		return customUserRole;
	}

	public List<Discussion> getDiscussions1() {
		return this.discussions1;
	}

	public void setDiscussions1(List<Discussion> discussions1) {
		this.discussions1 = discussions1;
	}

	public Discussion addDiscussions1(Discussion discussions1) {
		getDiscussions1().add(discussions1);
		discussions1.setUser1(this);

		return discussions1;
	}

	public Discussion removeDiscussions1(Discussion discussions1) {
		getDiscussions1().remove(discussions1);
		discussions1.setUser1(null);

		return discussions1;
	}

	public List<Discussion> getDiscussions2() {
		return this.discussions2;
	}

	public void setDiscussions2(List<Discussion> discussions2) {
		this.discussions2 = discussions2;
	}

	public Discussion addDiscussions2(Discussion discussions2) {
		getDiscussions2().add(discussions2);
		discussions2.setUser2(this);

		return discussions2;
	}

	public Discussion removeDiscussions2(Discussion discussions2) {
		getDiscussions2().remove(discussions2);
		discussions2.setUser2(null);

		return discussions2;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setUser(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setUser(null);

		return message;
	}

	public List<ReponseInfo> getReponseInfos() {
		return this.reponseInfos;
	}

	public void setReponseInfos(List<ReponseInfo> reponseInfos) {
		this.reponseInfos = reponseInfos;
	}

	public ReponseInfo addReponseInfo(ReponseInfo reponseInfo) {
		getReponseInfos().add(reponseInfo);
		reponseInfo.setUser(this);

		return reponseInfo;
	}

	public ReponseInfo removeReponseInfo(ReponseInfo reponseInfo) {
		getReponseInfos().remove(reponseInfo);
		reponseInfo.setUser(null);

		return reponseInfo;
	}

	public List<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Skill addSkill(Skill skill) {
		getSkills().add(skill);
		skill.setUser(this);

		return skill;
	}

	public Skill removeSkill(Skill skill) {
		getSkills().remove(skill);
		skill.setUser(null);

		return skill;
	}

	public List<Suggestion> getSuggestions() {
		return this.suggestions;
	}

	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}

	public Suggestion addSuggestion(Suggestion suggestion) {
		getSuggestions().add(suggestion);
		suggestion.setUser(this);

		return suggestion;
	}

	public Suggestion removeSuggestion(Suggestion suggestion) {
		getSuggestions().remove(suggestion);
		suggestion.setUser(null);

		return suggestion;
	}

	public Speciality getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

}