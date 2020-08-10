package JavaLesson34.Patterns.HW.HW_task4;

import java.util.ArrayList;

public class RunLibrary {
    //Создайте приложение для работы в библиотеке. Оно
    //должно оперировать следующими сущностями: Книга,
    //Библиотекарь, Читатель. Приложение должно позволять
    //вводить, удалять, изменять, сохранять в файл, загружать из файла, логгировать действия,
    // искать информацию (результаты поиска выводятся на экран или файл)
    //о сущностях. При реализации используйте максимально
    //возможное количество паттернов проектирования.
    public static void main(String[] args) {
        //создание объектов при помощи паттерна Builder

        DataBase dataBase = new DataBase();

        dataBase.dataBaseBook();
        System.out.println("List books:");
        for (Book book : dataBase.books) {
            System.out.print(book);
        };
        System.out.println();

        dataBase.dataBaseReader();
        System.out.println("List readers:");
        for (Reader reader : dataBase.readers) {
            System.out.print(reader);
        }
        System.out.println();

        dataBase.dataBaseLibrarian();
        System.out.println("List librarians:");
        for (Librarian librarian: dataBase.librarians) {
            System.out.print(librarian);
        }
        System.out.println();
    }
}
