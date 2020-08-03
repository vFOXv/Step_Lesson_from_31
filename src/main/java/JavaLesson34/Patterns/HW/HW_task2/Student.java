package JavaLesson34.Patterns.HW.HW_task2;

public class Student {
    Integer id;
    String name;
    String group;
    Double averageRating;

    public Student() {   }

    public Student(Integer id, String name, String group, Double averageRating) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.averageRating = averageRating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", averageRating=" + averageRating +
                '}'+"\n";
    }
}
