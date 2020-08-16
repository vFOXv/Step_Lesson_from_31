package JavaLesson35_MVC.JavaLesson35_MVC_task1.model.factory;

import JavaLesson35_MVC.JavaLesson35_MVC_task1.model.Article;

public class ArticleFactory implements EntityFactory<Article>{
    //Article article = new Article();

    @Override
    public Article createEntity(Integer id, String nameArticle, String nameAuthor, int countSigns, String nameMagazine, String shortDescription) {
//        return  new this;
        return new Article(id, nameArticle, nameAuthor, countSigns, nameMagazine, shortDescription);
    }
}
