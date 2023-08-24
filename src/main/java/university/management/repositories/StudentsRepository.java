package university.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import university.management.model.Student;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com A JPA Repository to perform operations on the Students table
 */
public interface StudentsRepository extends JpaRepository<Student, Long> {

}
