package JavaLesson34.Patterns.HW.HW_task2;

import java.util.ArrayList;
import java.util.List;


public class DataBaseStudentsContainer implements Container{
List<Student> baseStudents= new ArrayList<Student>();
Student student;

    public DataBaseStudentsContainer() {
        student = new Student();
        createBaseStudents();
    }

    public void createBaseStudents(){
    baseStudents.add(new Student(1,"Mark","Group 1", 4.7));
    baseStudents.add(new Student(2,"Ivan","Group 1", 3.2));
    baseStudents.add(new Student(3,"Natalia","Group 2", 3.8));
    baseStudents.add(new Student(4,"Alex","Group 2", 4.9));
    baseStudents.add(new Student(5,"Tatiana","Group 3", 4.0));
    baseStudents.add(new Student(6,"Petr","Group 3", 2.9));
    baseStudents.add(new Student(7,"Mark","Group 4", 4.8));
    baseStudents.add(new Student(8,"Nikita","Group 4", 3.5));
}

    @Override
    public Iterator getIterator() {
        return new BaseStudentsIterator();
    }

    class BaseStudentsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return (index < baseStudents.size());
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return baseStudents.get(index++);
            }
            return null;
        }
    }
}
