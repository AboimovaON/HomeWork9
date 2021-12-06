import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public void main(String[] args) {

        Student stud1 = new Student("John", Arrays.asList("Algebra", "Biology", "Drawing"));
        Student stud2 = new Student("Olga", Arrays.asList("Chemistry", "Geography", "Geometry", "History"));
        Student stud3 = new Student("Lena", Arrays.asList("Chemistry", "Geography", "Geometry"));
        Student stud4 = new Student("Anna", Arrays.asList("History", "Geometry"));
        Student stud5 = new Student("Vlad", Arrays.asList("Geography", "Geometry", "History"));
        Student stud6 = new Student("Ivan", Arrays.asList("Chemistry", "Geometry", "History"));
        Student stud7 = new Student("Igor", Arrays.asList("Algebra", "Drawing"));
        Student stud8 = new Student("Inna", Arrays.asList("Algebra", "Drawing"));

        ArrayList<Student> students = new ArrayList<>();

        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        students.add(stud7);
        students.add(stud8);
        System.out.println(students);


    }
}
