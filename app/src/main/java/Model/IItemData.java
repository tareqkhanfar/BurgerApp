package Model;

import java.util.List;

public interface IItemData {
    List<String> getCategories () ;

    List <FoodItem> getItemsByCat(String cat) ;

}
