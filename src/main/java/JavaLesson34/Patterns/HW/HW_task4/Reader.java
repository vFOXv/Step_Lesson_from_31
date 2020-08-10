package JavaLesson34.Patterns.HW.HW_task4;

import java.util.ArrayList;

public class Reader {
    int idReader;
    String nameReader;
    ArrayList< Book> listReadBook;

    @Override
    public String toString() {
        return "Reader{" +
                "idReader=" + idReader +
                ", nameReader='" + nameReader + '\'' +
                ", listBook=" + listReadBook +
                '}'+ "\n";
    }

    public static class BuilderReader{
        private Reader newReader;

        public BuilderReader(){
            newReader = new Reader();
        }

        public BuilderReader withIdReader(int idReader){
            newReader.idReader = idReader;
            return this;
        }

        public BuilderReader withNameReader(String nameReader){
            newReader.nameReader = nameReader;
            return this;
        }

        public BuilderReader withListBook(ArrayList<Book> listReadBook){
            newReader.listReadBook = listReadBook;
            return this;
        }

        public Reader build(){
            return newReader;
        }
    }
}
