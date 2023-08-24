package university.management.services;

import org.springframework.stereotype.Service;
import university.management.model.LearnerProfile;

import java.util.List;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com
 * A service that applies business logic to learner profiles
 */
@Service
public class LearnerProfileService {
    /**
     * Returns all the active students' learner profiles in the database,
     * sorted by their GPA in descending order
     */
    public List<LearnerProfile> getActiveStudentProfilesOrderedByGpa() {
        return List.of();
    }
}
