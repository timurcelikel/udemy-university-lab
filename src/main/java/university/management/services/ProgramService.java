package university.management.services;

import org.springframework.stereotype.Service;
import university.management.model.Program;
import university.management.repositories.ProgramsRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Michael Pogrebinsky - www.topdeveloperacademy.com A service that applies business logic to university programs
 */
@Service
public class ProgramService {

	private final ProgramsRepository programsRepository;

	public ProgramService(final ProgramsRepository programsRepository) {

		this.programsRepository = programsRepository;
	}

	/**
	 * Returns the Program object by field of study and degree from the database if it exists or creates a new object
	 */
	public Program getOrCreateProgram(String fieldOfStudy, Program.Degree degree) {

		Optional<Program> program = programsRepository.findByFieldOfStudyAndDegree(fieldOfStudy, degree); // Placeholder

		if (program.isPresent()) {
			return program.get();
		}
		return new Program(fieldOfStudy, degree);
	}

	/**
	 * Returns all the programs from the database
	 */
	public List<Program> getAllProgramsWithStudents() {

		return List.of();
	}
}
