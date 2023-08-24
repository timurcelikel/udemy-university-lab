package university.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import university.management.model.LearnerProfile;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com A JPA Repository to perform operations on the LearnerProfiles table
 */
public interface LearnerProfilesRepository extends JpaRepository<LearnerProfile, Long> {

}
