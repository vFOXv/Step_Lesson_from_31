package JavaLesson35_MVC.Task3.view;

import JavaLesson35_MVC.Task1.Menu;
import JavaLesson35_MVC.Task1.controller.ArticleController;
import JavaLesson35_MVC.Task3.controller.ShoesController;

public class ShoesView {
   ShoesController shoesController = new ShoesController();
    Menu menu = new Menu();

    public void Actions() {
        while (true) {
            switch (menu.menu()) {
                case 1:
                    shoesController.add();
                    break;
                case 2:
                    shoesController.remove();
                    break;
                case 3:
                    shoesController.change();
                    break;
                case 4:
                    shoesController.show();
                    break;
                case 5:
                    return;
            }
        }
    }
}
