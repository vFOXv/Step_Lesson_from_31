package JavaLesson35_MVC.Task1.view;

import JavaLesson35_MVC.Task1.Menu;
import JavaLesson35_MVC.Task1.controller.ArticleController;

public class ArticleView {
    ArticleController articleController = new ArticleController();
    Menu menu = new Menu();

    public void Actions() {
        while (true) {
            switch (menu.menu()) {
                case 1:
                    articleController.add();
                    break;
                case 2:
                    articleController.remove(articleController.getId());
                    break;
                case 3:
                    articleController.change(articleController.getId());
                    break;
                case 4:
                    articleController.showAll();
                    break;
                case 5:
                    return;
            }
        }
    }
}
