package nel.hardu.spring5recipeapp.repositories;

import nel.hardu.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
