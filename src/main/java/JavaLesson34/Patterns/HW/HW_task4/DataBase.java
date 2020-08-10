package JavaLesson34.Patterns.HW.HW_task4;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Book> books;
    ArrayList<Reader> readers;
    ArrayList<Librarian> librarians;
    ArrayList<Book> listReadBook;
    Book myBook;
    Reader myReader;
    Librarian myLibrarian;

    public DataBase() {
        //myBook = new Book();
        books = new ArrayList<>();
        readers = new ArrayList<>();
        librarians = new ArrayList<>();
        listReadBook = new ArrayList<>();
    }

    void dataBaseBook() {
        //создание объекта книга
        books.add(new Book.BuilderBook()
                .withIdBook(1)
                .withNameBook("Name 1")
                .withAuthorBook("Author 1")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(2)
                .withNameBook("Name 2")
                .withAuthorBook("Author 2")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(3)
                .withNameBook("Name 3")
                .withAuthorBook("Author 3")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(4)
                .withNameBook("Name 4")
                .withAuthorBook("Author 3")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(5)
                .withNameBook("Name 5")
                .withAuthorBook("Author 4")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(6)
                .withNameBook("Name 6")
                .withAuthorBook("Author 4")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(7)
                .withNameBook("Name 7")
                .withAuthorBook("Author 5")
                .build());

        books.add(new Book.BuilderBook()
                .withIdBook(8)
                .withNameBook("Name 8")
                .withAuthorBook("Author 6")
                .build());
    }

    void dataBaseReader() {
        //создание списка прочитанных книг определенным читателем
        ArrayList<Book> listReadBook1 = new ArrayList<>();
        listReadBook1.add(books.get(0));
        listReadBook1.add(books.get(7));
        listReadBook1.add(books.get(4));

        //создание объекта читатель
        readers.add(new Reader.BuilderReader()
                .withIdReader(1)
                .withNameReader("Name reader 1")
                .withListBook(listReadBook1)
                .build());

        //создание списка прочитанных книг определенным читателем
        ArrayList<Book> listReadBook2 = new ArrayList<>();
        listReadBook2.add(books.get(1));
        listReadBook2.add(books.get(3));
        listReadBook2.add(books.get(6));

        readers.add(new Reader.BuilderReader()
                .withIdReader(2)
                .withNameReader("Name reader 2")
                .withListBook(listReadBook2)
                .build());

        //создание списка прочитанных книг определенным читателем
        ArrayList<Book> listReadBook3 = new ArrayList<>();
        listReadBook3.add(books.get(1));
        listReadBook3.add(books.get(2));
        listReadBook3.add(books.get(5));
        listReadBook3.add(books.get(6));

        readers.add(new Reader.BuilderReader()
                .withIdReader(3)
                .withNameReader("Name reader 3")
                .withListBook(listReadBook3)
                .build());

        //создание списка прочитанных книг определенным читателем
        ArrayList<Book> listReadBook4 = new ArrayList<>();
        listReadBook4.add(books.get(3));
        listReadBook4.add(books.get(7));

        readers.add(new Reader.BuilderReader()
                .withIdReader(4)
                .withNameReader("Name reader 4")
                .withListBook(listReadBook4)
                .build());

        //создание списка прочитанных книг определенным читателем
        ArrayList<Book> listReadBook5 = new ArrayList<>();
        listReadBook5.add(books.get(1));
        listReadBook5.add(books.get(7));
        listReadBook5.add(books.get(4));
        listReadBook5.add(books.get(5));

        readers.add(new Reader.BuilderReader()
                .withIdReader(5)
                .withNameReader("Name reader 5")
                .withListBook(listReadBook5)
                .build());
    }

    void dataBaseLibrarian(){
        librarians.add(new Librarian.BuilderLibrarian()
        .withIdLibrarian(1)
        .withNameLibrarian("Name librarian 1")
        .withPositionLibrarian("Director")
        .build());

        librarians.add(new Librarian.BuilderLibrarian()
                .withIdLibrarian(2)
                .withNameLibrarian("Name librarian 2")
                .withPositionLibrarian("Manager")
                .build());
    }

}
