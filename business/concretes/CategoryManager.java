package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CategoryService;
import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class CategoryManager implements CategoryService {

	private List<Category> categories = new ArrayList<>();
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		
		this.loggers = loggers;
		

	}
	
	

	@Override
	public void save(Category category) throws Exception {

		for (Category categoryList : categories) {
			if (categoryList.getName() == category.getName()) {
				throw new Exception("Bu kategori ismi mevcuttur. " + category.getName());
			} 

			}
		categories.add(category);
		this.categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());

		}
	}
}
