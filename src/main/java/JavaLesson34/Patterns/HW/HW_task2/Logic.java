package JavaLesson34.Patterns.HW.HW_task2;

import java.util.Scanner;

public class Logic {
    DataBaseStudentsContainer baseStudentsContainer;

    public Logic() {
        baseStudentsContainer = new DataBaseStudentsContainer();
    }

    //метод отрабатывающий патерн итератор
    public void iterator() {
        Iterator iterator = baseStudentsContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

    //добавление нового студента
    public void addStudent() {
        //создание нового объекта "студент"
        Student student = new Student();
        addId(student);
        addName(student);
        addGroup(student);
        addAverageRating(student);
        baseStudentsContainer.baseStudents.add(student);
    }


    //добавление нового ID студента
    public void addId(Student student) {
        boolean flag = true;
        //получени id студента
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's id:");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                //проверка на уникальность id
                for (int i = 0; i < baseStudentsContainer.baseStudents.size(); i++) {
                    if (box == baseStudentsContainer.baseStudents.get(i).getId()) {
                        System.err.println("This ID exist in the DataBase!!!");
                        break;
                    } else if (box != baseStudentsContainer.baseStudents.get(i).getId() && i == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.out.println("This ID is unique = " + box);
                        student.setId(box);
                        flag = false;
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //добавление имени нового студента
    public void addName(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name:");
        String name = scanner.nextLine();
        student.setName(name);
        //baseStudentsContainer.baseStudents.add(student);
    }

    //добавление группы нового студента
    public void addGroup(Student student) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's group (1, 2, 3, 4):");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                String boxString = "Group " + box;
                //проверка на совпадение введеной группы с существующими
                for (int i = 0; i < baseStudentsContainer.baseStudents.size(); i++) {
                    if (boxString.equalsIgnoreCase(baseStudentsContainer.baseStudents.get(i).getGroup())) {
                        System.out.println("This group exist.");
                        student.setGroup(boxString);
                        flag = false;
                        break;
                    } else if (i == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.err.println("This group not exist!!!");
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //добавление средней оценки студента
    public void addAverageRating(Student student) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's averageRating:");
            if (scanner.hasNextDouble()) {
                double rating = scanner.nextDouble();
                System.out.println("Average rating is: "+rating);
                student.setAverageRating(rating);
                flag = false;
            } else {
                System.err.println("You must enter double number!!!");
            }
        }
    }

    //удаление студента
    public void deleteStudent() {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's ID:");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                //проверка на совпадение со существующим студентом
                for (int i = 0; i < baseStudentsContainer.baseStudents.size(); i++) {
                    if (box == baseStudentsContainer.baseStudents.get(i).getId()) {
                        baseStudentsContainer.baseStudents.remove(i);
                        flag = false;
                        break;
                    } else if (i == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.err.println("This ID not exist!!!");
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //изменение данных студента
    public void changeStudent() {
        int position = 0;
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's ID:");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                //проверка на совпадение со существующим студентом
                for (position = 0; position < baseStudentsContainer.baseStudents.size(); position++) {
                    if (box == baseStudentsContainer.baseStudents.get(position).getId()) {
                        //методы изменяющие значение полей объекта студент
                        changeId(position);
                        changeName(position);
                        changeGroup(position);
                        changeAverageRating(position);
                        flag = false;
                        break;
                    } else if (position == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.err.println("This ID not exist!!!");
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //изменение ID студента
    public void changeId(int position) {
        boolean flag = true;
        int iter = 0;
        //получени id студента
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new student's id:");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                //проверка на уникальность id
                for (iter = 0; iter < baseStudentsContainer.baseStudents.size(); iter++) {
                    if (box == baseStudentsContainer.baseStudents.get(iter).getId()) {
                        System.err.println("This ID exist in the DataBase!!!");
                        break;
                    } else if (box != baseStudentsContainer.baseStudents.get(iter).getId() && iter == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.out.println("This new ID is unique = " + box);
                        baseStudentsContainer.baseStudents.get(position).setId(box);
                        flag = false;
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //изменение имени студента
    //добавление имени нового студента
    public void changeName(int position) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new student's name:");
        String newName = scanner.nextLine();
        baseStudentsContainer.baseStudents.get(position).setName(newName);
    }

    //изменение группы студента
    public void changeGroup(int position) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new student's group (1, 2, 3, 4):");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                String boxString = "Group " + box;
                //проверка на совпадение введеной группы с существующими
                for (int i = 0; i < baseStudentsContainer.baseStudents.size(); i++) {
                    if (boxString.equalsIgnoreCase(baseStudentsContainer.baseStudents.get(i).getGroup())) {
                        System.out.println("This group exist.");
                        baseStudentsContainer.baseStudents.get(position).setGroup(boxString);
                        flag = false;
                        break;
                    } else if (i == (baseStudentsContainer.baseStudents.size() - 1)) {
                        System.err.println("This group not exist!!!");
                    }
                }
            } else {
                System.err.println("You must enter integer number!!!");
            }
        }
    }

    //изменение средней оценки студента
    public void changeAverageRating(int position) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's averageRating:");
            if (scanner.hasNextDouble()) {
                double rating = scanner.nextDouble();
                System.out.println("New average rating is: "+ rating);
                baseStudentsContainer.baseStudents.get(position).setAverageRating(rating);
                flag = false;
            } else {
                System.err.println("You must enter double number!!!");
            }
        }
    }
}

