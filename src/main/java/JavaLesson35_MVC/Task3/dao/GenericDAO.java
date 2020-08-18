package JavaLesson35_MVC.Task3.dao;

import JavaLesson35_MVC.Task3.model.Shoes;

public interface GenericDAO<T, ID> {

    Integer myAdd(Integer key, Shoes entity);
    void myRemove(Integer key);
    void myChange(Integer key, Shoes entity);
    void myShowAll();
    T getMyMap();
    T getMyKey();

}
