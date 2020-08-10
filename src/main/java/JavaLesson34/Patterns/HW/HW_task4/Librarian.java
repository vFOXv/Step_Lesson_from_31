package JavaLesson34.Patterns.HW.HW_task4;

public class Librarian {
    int idLibrarian;
    String nameLibrarian;
    String positionLibrarian; //должность

    @Override
    public String toString() {
        return "Librarian{" +
                "idLibrarian=" + idLibrarian +
                ", nameLibrarian='" + nameLibrarian + '\'' +
                ", positionLibrarian='" + positionLibrarian + '\'' +
                '}'+"\n";
    }

    public static class BuilderLibrarian{
        private Librarian newLibrarian;

        public BuilderLibrarian(){
            newLibrarian = new Librarian();
        }

        public BuilderLibrarian withIdLibrarian(int idLibrarian){
            newLibrarian.idLibrarian = idLibrarian;
            return this;
        }

        public BuilderLibrarian withNameLibrarian(String nameLibrarian){
            newLibrarian.nameLibrarian = nameLibrarian;
            return this;
        }

        public BuilderLibrarian withPositionLibrarian(String positionLibrarian){
            newLibrarian.positionLibrarian = positionLibrarian;
            return this;
        }

        public Librarian build(){return newLibrarian;}
    }
}
