package JavaLesson35_MVC.JavaLesson35_MVC_task1.model.factory;

public interface EntityFactory <T> {
    T createEntity(Integer id, String nameArticle, String nameAuthor, int countSigns, String nameMagazine, String shortDescription);
}
