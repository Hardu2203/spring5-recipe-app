package nel.hardu.spring5recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import nel.hardu.spring5recipeapp.Services.RecipeService;
import nel.hardu.spring5recipeapp.domain.Category;
import nel.hardu.spring5recipeapp.domain.UnitOfMeasure;
import nel.hardu.spring5recipeapp.repositories.CategoryRepository;
import nel.hardu.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private  final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Get index page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
