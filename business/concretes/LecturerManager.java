package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.LecturerService;
import core.abstracts.Logger;
import dataAccess.abstracts.LecturerDao;
import entities.concretes.Lecturer;



public class LecturerManager implements LecturerService{
	private List<Lecturer> lecturers = new ArrayList<>();
	private LecturerDao lecturerDao;
	private Logger[] loggers;
	
	public LecturerManager(LecturerDao lecturerDao, Logger[] loggers) {
		
		
		this.lecturerDao = lecturerDao;
		this.loggers = loggers;
	}
	
	@Override
	public void save(Lecturer lecturer) throws Exception {
		
		if(lecturer.getNationalityId().length() != 11) {
			throw new Exception("Kimlik numarasi 11 haneli olmali");
		}
		
		for (Lecturer lecturerCheck : lecturers) {
			 if(lecturerCheck.getNationalityId() == lecturerCheck.getNationalityId()) {
				 throw new Exception("Bu kimlik ile daha once kayit yapilmistir.");
			 }
		}
		
		lecturers.add(lecturer);
		lecturerDao.add(lecturer);
		
		for (Logger log : loggers) {
			log.log(lecturer.getFirsName()+" "+lecturer.getLastName());
		}
		
		
		
	}



	
	
}
