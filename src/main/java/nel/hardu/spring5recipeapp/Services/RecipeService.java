package nel.hardu.spring5recipeapp.Services;

import nel.hardu.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
