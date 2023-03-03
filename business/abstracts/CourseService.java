package business.abstracts;

import entities.concretes.Course;

public interface CourseService {
	void save(Course course) throws Exception;
}
