package university.management.services;

import org.springframework.stereotype.Service;
import university.management.model.LearnerProfile;
import university.management.repositories.LearnerProfilesRepository;

import java.util.List;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com A service that applies business logic to learner profiles
 */
@Service
public class LearnerProfileService {

	private final LearnerProfilesRepository learnerProfilesRepository;

	public LearnerProfileService(final LearnerProfilesRepository learnerProfilesRepository) {

		this.learnerProfilesRepository = learnerProfilesRepository;
	}

	/**
	 * Returns all the active students' learner profiles in the database, sorted by their GPA in descending order
	 */
	public List<LearnerProfile> getActiveStudentProfilesOrderedByGpa() {

		/*
		List<LearnerProfile> learnerProfiles = learnerProfilesRepository.findAll();
		return learnerProfiles.stream().filter(p -> !p.isGraduated()).sorted(
				Comparator.comparing(p -> p.getGpa(), Comparator.reverseOrder())).collect(
				Collectors.toList());
		 */
		return learnerProfilesRepository.findAllByIsGraduatedIsFalseOrderByGpaDesc();
	}
}
