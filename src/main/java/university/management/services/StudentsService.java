package university.management.services;

import org.springframework.stereotype.Service;
import university.management.model.Course;
import university.management.model.Program;
import university.management.model.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * A service that applies business logic on the students entity
 */
@Service
public class StudentsService {
    /**
     * Finds a student by email address.
     * Returns {@code Optional.empty()} if a student with this email doesn't exist
     */
    public Optional<Student> findStudentByEmail(String email) {
        return Optional.empty();
    }

    /**
     * Returns all registered students from the database
     * @return
     */
    public List<Student> getAllRegisteredStudents() {
        return List.of();
    }

    /**
     * Adds a new student to the database
     */
    public void addStudent(String firstName,
                              String lastName,
                              String email, LocalDate dateOfBirth,
                              Program program) {
    }

    /**
     * Finds a student by their id.
     * Returns {@code Optional.empty()} if a student with this email doesn't exist
     */
    public Optional<Student> findStudentById(Long id) {
        return Optional.empty();
    }

    /**
     * Returns all the courses that a given student is enrolled in
     */
    public Set<Course> getAllStudentCourses(Student student) {
        return Set.of();
    }
}
