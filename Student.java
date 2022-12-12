import java.util.Arrays;

public class Student {
    String name;
    String id;
    int[] grades;
    int course;

    public Student(String name, String id, int[] grades, int course) {
        this.name = name;
        this.id = id;
        this.grades = grades;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student" + " " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + Arrays.toString(grades) +
                ", course=" + course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String printStudentData(){
        if(course > 2){
            return toString();
        }
        return " ";
    }
}
