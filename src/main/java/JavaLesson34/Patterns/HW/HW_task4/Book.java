package JavaLesson34.Patterns.HW.HW_task4;

public class Book {
    int idBook;
    String nameBook;
    String authorBook; //автор

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                '}'+"\n";
    }

    public static class BuilderBook{
        private Book newBook;

        public BuilderBook(){
            newBook = new Book();
        }

        public BuilderBook withIdBook(int idBook){
            newBook.idBook = idBook;
            return this;
        }

        public BuilderBook withNameBook(String nameBook){
            newBook.nameBook = nameBook;
            return this;
        }

        public BuilderBook withAuthorBook(String authorBook){
            newBook.authorBook = authorBook;
            return this;
        }

        public Book build(){
            return newBook;
        }
    }
}
