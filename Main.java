import java.util.ArrayList;
import java.util.List;

import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.LecturerManager;
import core.abstracts.Logger;
import core.concretes.DataBaseLogger;
import core.concretes.FileLogger;
import dataAccess.concretes.HibernateCategoryDao;
import dataAccess.concretes.HibernateCourseDao;
import dataAccess.concretes.HibernateLecturerDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Lecturer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Hepsinde kullanacagiz
		Logger[] loggers = {new FileLogger(), new DataBaseLogger()};
		
		// Category
		Category category1 = new Category(1, "ders");
		Category category2 = new Category(2, "deneme");
		Category category3 = new Category(3, "deneme");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.save(category2);
		categoryManager.save(category1);
		//categoryManager.save(category3);
		
		// Course
		
		Course course1 = new Course(1, "Java", 60);
		Course course2 = new Course(1, "Java", 10);
		Course course3 = new Course(1, "Python", -10);
		Course course4 = new Course(1, "C#", 50);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.save(course4);
		//courseManager.save(course1);
		courseManager.save(course2);
		
		// Lecturer
		
		Lecturer lecturer1 = new Lecturer(1, "Fatih", "Mutlu", "1234567891011");
		Lecturer lecturer2 = new Lecturer(1, "Fatih", "Mutlu", "1234567891011");
		Lecturer lecturer3 = new Lecturer(1, "Fatih", "Mutlu", "12346");
		
		LecturerManager lecturerManager = new LecturerManager(new HibernateLecturerDao(), loggers);
		//lecturerManager.save(lecturer3);
		//lecturerManager.save(lecturer2);
		lecturerManager.save(lecturer1);
	}

}
