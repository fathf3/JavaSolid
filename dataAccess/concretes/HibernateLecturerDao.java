package dataAccess.concretes;

import dataAccess.abstracts.LecturerDao;
import entities.concretes.Lecturer;

public class HibernateLecturerDao  implements LecturerDao{

	@Override
	public void add(Lecturer lecturer) {
		// TODO Auto-generated method stub
		System.out.println(lecturer.getFirsName()+" "
		+lecturer.getLastName()+ " Hibernate ile sisteme eklenmistir.");
	}

}
