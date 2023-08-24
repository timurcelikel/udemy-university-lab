package university.management.model;

import javax.persistence.*;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com Persistence Entity that represents a course at the university as well as a row in the
 * 		Courses table in the database
 */

@Table(name = "Courses")
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;

	private String title;

	private String description;

	private int numberOfCredits;

	public Course() {

	}

	public Course(String title, String description, int numberOfCredits) {

		this.title = title;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
	}

	public int getNumberOfCredits() {

		return numberOfCredits;
	}

	public Long getCourseId() {

		return courseId;
	}

	public String getTitle() {

		return title;
	}

	public String getDescription() {

		return description;
	}
}
