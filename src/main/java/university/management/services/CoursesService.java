package university.management.services;

import org.springframework.stereotype.Service;
import university.management.model.Course;
import university.management.model.Student;
import university.management.repositories.CoursesRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * A service that applies business logic to university courses
 */
@Service
public class CoursesService {
    private final CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    /**
     * Returns all available courses from the database
     */
    public List<Course> getAllCourses() {
        return coursesRepository.findAll();
    }

    /**
     * Returns a course by its Id if it exists, or {@code Optional.empty()}
     */
    public Optional<Course> findCourse(Long courseId) {
        return Optional.empty();
    }

    /**
     * Enrolls a student in a course
     */
    public void enrollStudent(Course course, Student student) {

    }

    /**
     * Removes a student from a course
     */
    public void unEnrollStudent(Course course, Student student) {

    }
}
