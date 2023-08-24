package university.management.model;

import java.time.LocalDate;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * Persistence entity that represents a student, registered at the university
 */
public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDate dateOfBirth;

    public Student() {
    }

    public Student(String firstName,
                   String lastName,
                   String email,
                   LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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
}
