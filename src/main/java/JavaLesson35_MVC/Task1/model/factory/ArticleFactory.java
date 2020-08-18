package JavaLesson35_MVC.Task1.model.factory;

import JavaLesson35_MVC.Task1.model.Article;

public class ArticleFactory implements EntityFactory<Article>{
    //Article article = new Article();

    @Override
    public Article createEntity(Integer id, String nameArticle, String nameAuthor, int countSigns, String nameMagazine, String shortDescription) {
        return new Article(id, nameArticle, nameAuthor, countSigns, nameMagazine, shortDescription);
    }
}
