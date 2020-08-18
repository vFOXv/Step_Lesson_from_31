package JavaLesson35_MVC.Task1.dao;

import JavaLesson35_MVC.Task1.model.Article;

public interface GenericDAO <T, ID>{
    void add(Article entity);
    void remove(ID id);
    void change(Integer id);
    void showAll();
}

