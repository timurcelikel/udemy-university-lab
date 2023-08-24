package university.management.model;

import javax.persistence.*;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com Persistence entity that represents a profile of an active student as well as a row in the
 * 		LearnerProfiles table in the database
 */
@Table(name = "LearnerProfiles")
@Entity
public class LearnerProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long profileId;

	private int numberOfCredits;

	private float gpa;// grade point average

	private boolean isGraduated;

	private short startYear;

	public LearnerProfile() {

	}

	public LearnerProfile(short startYear) {

		this.startYear = startYear;
	}

	public Long getProfileId() {

		return profileId;
	}

	public int getNumberOfCredits() {

		return numberOfCredits;
	}

	public float getGpa() {

		return gpa;
	}

	public boolean isGraduated() {

		return isGraduated;
	}

	public short getStartYear() {

		return startYear;
	}
}
