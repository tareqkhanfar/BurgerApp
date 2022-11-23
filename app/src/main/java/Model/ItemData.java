package Model;

import java.util.LinkedList;
import java.util.List;

public class ItemData  implements  IItemData{

private  List<FoodItem> items ;
private List<String> itemByCat ;

    @Override
    public List<String> getCategories() {

        List<String> list = new LinkedList<>() ;
        for (FoodItem s : items) {
            list.add(s.getCat()) ;
        }
        return  list ;
    }

    @Override
    public List<FoodItem> getItemsByCat(String cat) {
        List<FoodItem> list_ = new LinkedList<>() ;
        for (FoodItem fi : items) {
            if (fi.getCat().equals(cat)){
                list_.add(fi);
            }
        }
        return list_;
    }
    public  ItemData() {
        items = new LinkedList<>();
        items.add(new FoodItem("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItem("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItem("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItem("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItem("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItem("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItem("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItem("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItem("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItem("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItem("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItem("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItem("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItem("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItem("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
    }

}
