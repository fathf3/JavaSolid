package business.abstracts;

import entities.concretes.Lecturer;

public interface LecturerService {
	void save(Lecturer lecturer) throws Exception;
}
