package nel.hardu.spring5recipeapp.Services;

//import guru.springframework.commands.UnitOfMeasureCommand;

import nel.hardu.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}