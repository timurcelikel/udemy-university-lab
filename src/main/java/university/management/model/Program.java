package university.management.model;

import javax.persistence.*;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com A Persistence entity that represents a program a student can follow to earn a degree in a
 * 		particular field of study
 */
@Table(name = "Programs")
@Entity
public class Program {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long programId;

	@Column(nullable = false)
	private int requiredYearsToGraduation = 4;

	@Column(nullable = false)
	private int requiredCreditsToGraduation = 200;

	@Column(nullable = false)
	private String fieldOfStudy;

	@Enumerated(EnumType.STRING)
	private Degree degree;

	public Program() {

	}

	public Program(String fieldOfStudy, Degree degree) {

		this.fieldOfStudy = fieldOfStudy;
		this.degree = degree;
	}

	public Long getProgramId() {

		return programId;
	}

	public int getRequiredYearsToGraduation() {

		return requiredYearsToGraduation;
	}

	public int getRequiredCreditsToGraduation() {

		return requiredCreditsToGraduation;
	}

	public String getFieldOfStudy() {

		return fieldOfStudy;
	}

	public Degree getDegree() {

		return degree;
	}

	public enum Degree {
		ASSOCIATE,
		BACHELOR,
		MASTER,
		PHD,
	}
}
