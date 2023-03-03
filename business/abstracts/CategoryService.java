package business.abstracts;

import entities.concretes.Category;

public interface CategoryService {
	void save(Category category) throws Exception;
}
