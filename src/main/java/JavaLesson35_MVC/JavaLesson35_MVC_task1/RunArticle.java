package JavaLesson35_MVC.JavaLesson35_MVC_task1;

import JavaLesson35_MVC.JavaLesson35_MVC_task1.view.ArticleView;

public class RunArticle {
    //Создайте класс Статья. Необходимо хранить следующую информацию:
    //■ название статьи;
    //■ автор статьи;
    //■ количество знаков;
    //■ название издания или сайта, где статья была впервые опубликована;
    //■ краткое описание.
    //Создайте необходимые методы для этого класса.
    //Реализуйте паттерн MVC для класса Статья и код для использования модели, контроллера и представления.

    public static void main(String[] args) {
        ArticleView articleView = new ArticleView();

        articleView.Actions();

    }
}
