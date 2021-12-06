import java.util.List;

public class Student {
    private String name;
    private List<String> course;

    public Student(String name, List<String> course) {
        this.name = name;
        this.course = course;
    }

    public Student(String name, String course) {
    }

    enum Course{
        Algebra, Biology, Drawing, Chemistry, Geography, Geometry, History
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourse() {
        return course;
    }

//    public void setCourse(List<String> subjects) {
//        this.course = course;
//    }




}
