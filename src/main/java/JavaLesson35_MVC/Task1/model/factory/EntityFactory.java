package JavaLesson35_MVC.Task1.model.factory;

public interface EntityFactory <T> {
    T createEntity(Integer id, String nameArticle, String nameAuthor, int countSigns, String nameMagazine, String shortDescription);
}
