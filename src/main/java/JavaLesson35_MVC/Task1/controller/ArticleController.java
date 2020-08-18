package JavaLesson35_MVC.Task1.controller;

import JavaLesson35_MVC.Task1.dao.ArticleDaoIml;
import JavaLesson35_MVC.Task1.model.Article;
import JavaLesson35_MVC.Task1.model.factory.ArticleFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleController {

    public ArticleController() {
        listArticle();
        createListId();
    }

    ArticleDaoIml articleDao = new ArticleDaoIml();
    ArticleFactory articleFactory = new ArticleFactory();

    ArrayList<Article> articles = articleDao.articles;
    ArrayList<Integer> listIds = articleDao.listIds;

    //создания списка статей
    public void listArticle() {
        Article article1 = articleFactory.createEntity(1, "Article 1", "Author 1", 100, "Magazine 1", "Short Description 1");
        articles.add(article1);

        Article article2 = articleFactory.createEntity(2, "Article 2", "Author 2", 200, "Magazine 2", "Short Description 2");
        articles.add(article2);

        Article article3 = articleFactory.createEntity(3, "Article 3", "Author 3", 300, "Magazine 3", "Short Description 3");
        articles.add(article3);

        Article article4 = articleFactory.createEntity(4, "Article 4", "Author 4", 400, "Magazine 4", "Short Description 4");
        articles.add(article4);

    }

    //создание списка id
    public void createListId() {
        for (int i = 0; i < articles.size(); i++) {
            listIds.add( articles.get(i).getId());
        }
    }

    //изменение списка id после добавления и удаления статей
    public void changeListId(){
        for (int i = 0; i < articles.size(); i++) {
            listIds.set(i, articles.get(i).getId());
        }
    }

    //поиск первого свободного id
    public int findFreeId() {
        for (int i = 1; i < listIds.size() + 1; i++) {
            if (-1 == listIds.indexOf(i))
                return i;
        }
        return (listIds.size() + 1);
    }


    //добавление новой статьи
    public void add() {
        //получение списка id
        createListId();
        //получение свободного id
        int id = findFreeId();

        //получение названия статьи
        String nameArticle = null;
        while (nameArticle == null || nameArticle.isBlank()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name article:");
            nameArticle = scanner.nextLine();
            if (nameArticle.isBlank()) {
                System.err.println("You enter empty name article!!!");
            }
        }

        //получение имени автора
        String nameAuthor = null;
        while (nameAuthor == null || nameAuthor.isBlank()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name article:");
            nameAuthor = scanner.nextLine();
            if (nameAuthor.isBlank()) {
                System.err.println("You enter empty name author!!!");
            }
        }

        //получение колличества знаков
        int countSigns = 0;
        while (countSigns <= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter count sings");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box > 0) {
                    countSigns = box;
                } else {
                    System.err.println("Count sing must not < 0 !!!");
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }

        //получение название издания или сайта, где статья была впервые опубликована
        String nameMagazine = null;
        while (nameMagazine == null || nameMagazine.isBlank()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name magazine:");
            nameMagazine = scanner.nextLine();
            if (nameMagazine.isBlank()) {
                System.err.println("You enter empty name magazine!!!");
            }
        }

        //получение краткого описания
        String shortDescription = null;
        while (shortDescription == null || shortDescription.isBlank()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter short description:");
            shortDescription = scanner.nextLine();
            if (shortDescription.isBlank()) {
                System.err.println("You enter empty short description!!!");
            }
        }

        //создание нового объекта статья при помощи фабрики
        Article article = articleFactory.createEntity(id, nameArticle, nameAuthor, countSigns, nameMagazine, shortDescription);
        articles.add(article);

        //обновление списка id
        changeListId();
    }

    //получение индекса объекта в списке по id
    public int getId() {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id article");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                if (listIds.indexOf(id) != -1) {
                    flag = false;
                    for (int i = 0; i < articles.size(); i++) {
                        if (id == articles.get(i).getId()) {
                            System.out.println("This article is " + articles.get(i).getNameArticle());
                            return i;
                        }
                    }
                } else {
                    System.err.println("This id isn't in list!!!");
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
        return -1;
    }

    public void remove(Integer position) {
        if (position != -1) {
            articles.remove(articles.get(position));

            //обновление списка id
            changeListId();
        } else {
            System.err.println("This id isn't in the list!!!");
        }
    }


    //изменение объекта статья
    public void change(Integer position) {

        if (position != -1) {
            //получение нового названия статьи
            String nameArticle = null;
            while (nameArticle == null || nameArticle.isBlank()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new name article:");
                nameArticle = scanner.nextLine();
                if (nameArticle.isBlank()) {
                    System.err.println("You enter empty name article!!!");
                }
            }

            //получение нового имени автора
            String nameAuthor = null;
            while (nameAuthor == null || nameAuthor.isBlank()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new name article:");
                nameAuthor = scanner.nextLine();
                if (nameAuthor.isBlank()) {
                    System.err.println("You enter empty name author!!!");
                }
            }

            //получение нового колличества знаков
            int countSigns = 0;
            while (countSigns <= 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new count sings");
                if (scanner.hasNextInt()) {
                    int box = scanner.nextInt();
                    if (box > 0) {
                        countSigns = box;
                    } else {
                        System.err.println("Count sing must not < 0 !!!");
                    }
                } else {
                    System.err.println("You must enter integer number!!!");
                }
            }

            //получение нового название издания или сайта, где статья была впервые опубликована
            String nameMagazine = null;
            while (nameMagazine == null || nameMagazine.isBlank()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new name magazine:");
                nameMagazine = scanner.nextLine();
                if (nameMagazine.isBlank()) {
                    System.err.println("You enter empty name magazine!!!");
                }
            }

            //получение нового краткого описания
            String shortDescription = null;
            while (shortDescription == null || shortDescription.isBlank()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new short description:");
                shortDescription = scanner.nextLine();
                if (shortDescription.isBlank()) {
                    System.err.println("You enter empty short description!!!");
                }
            }

            //создание нового объекта(со всеми изменениями)
            Article article = articleFactory.createEntity(articles.get(position).getId(), nameArticle, nameAuthor, countSigns, nameMagazine, shortDescription);

            //изменение объекта статья
            articles.set(position, article);
        } else {
            System.err.println("This id isn't the list!!!");
        }
    }


    public void showAll() {
        articleDao.showAll();
        System.out.println();
    }
}
