package university.management.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com Persistence entity that represents a student, registered at the university
 */
@Table(name = "Students")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 60, nullable = false)
	private String firstName;

	@Column(length = 60, nullable = false)
	private String lastName;

	@Column(length = 60, nullable = false, unique = true)
	private String email;

	private LocalDate dateOfBirth;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "program_id")
	private Program program;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_id")
	private LearnerProfile learnerProfile;

	public Student() {

	}

	public Student(String firstName,
			String lastName,
			String email,
			LocalDate dateOfBirth,
			Program program) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.program = program;
		this.learnerProfile =
				new LearnerProfile((short) LocalDate.now().getYear());
	}

	public Long getId() {

		return id;
	}

	public String getFirstName() {

		return firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public String getEmail() {

		return email;
	}

	public LocalDate getDateOfBirth() {

		return dateOfBirth;
	}

	public Program getProgram() {

		return program;
	}

	public LearnerProfile getLearnerProfile() {

		return learnerProfile;
	}
}
