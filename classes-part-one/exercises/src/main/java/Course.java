
import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, String instructor, ArrayList enrolledStudents){

    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student>enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

}
