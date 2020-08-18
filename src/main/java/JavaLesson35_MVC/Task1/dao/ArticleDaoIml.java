package JavaLesson35_MVC.Task1.dao;

import JavaLesson35_MVC.Task1.model.Article;

import java.util.ArrayList;

public class ArticleDaoIml implements GenericDAO<Article, Integer> {

    public ArrayList<Article> articles = new ArrayList<>();

    public ArrayList<Integer> listIds = new ArrayList<>();

    @Override
    public void add(Article article) {
        articles.add(article);
    }

    @Override
    public void remove(Integer id) {
        articles.remove(id);
    }

    @Override
    public void change(Integer id) {
//set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index
    }

    @Override
    public void showAll() {
        for (Article article : articles) {
            System.out.print(article);
        }
    }
}
