package JavaLesson35_MVC.Task3.model.factory;

import JavaLesson35_MVC.Task3.model.Shoes;

public class ShoesFactory implements EntityFactory<Shoes>{
    @Override
    public Shoes createShoes(Shoes.Kind kindShoes, Shoes.Type typeShoes, Shoes.Color colorShoes, Shoes.Manufacturer manufacturer, Shoes.Size sizeShoes, Double priseShoes) {
        return new Shoes(kindShoes, typeShoes, colorShoes, manufacturer, sizeShoes, priseShoes);
    }
}
