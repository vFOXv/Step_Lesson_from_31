package JavaLesson35_MVC.Task3.model.factory;

import JavaLesson35_MVC.Task3.model.Shoes;

public interface EntityFactory<T>{
    T createShoes(Shoes.Kind kindShoes, Shoes.Type typeShoes, Shoes.Color colorShoes, Shoes.Manufacturer manufacturer, Shoes.Size sizeShoes, Double priseShoes);
}
