package nel.hardu.spring5recipeapp.repositories;

import nel.hardu.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
