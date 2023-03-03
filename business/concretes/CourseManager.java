package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CourseService;
import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {
	private List<Course> courses = new ArrayList<>();
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] logger) {
		
		
		this.courseDao = courseDao;
		this.loggers = logger;
	}
	
	
	@Override
	public void save(Course course) throws Exception {
		
		for (Course courseCheck : courses) {
			if(courseCheck.getName() == course.getName()) {
				throw new Exception("Bu kurs ismi mevcut " + course.getName());
				
			}
		}
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyati 0 TL den kucuk olamaz : " + course.getPrice());
		}
		
		for (Logger log : loggers) {
			log.log(course.getName());
		}
		courses.add(course);
		
	}




	
	
	
	
}
