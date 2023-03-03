package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println(category.getName() + " Hibernate ile sisteme eklenmiştir.");
		
	}

}
