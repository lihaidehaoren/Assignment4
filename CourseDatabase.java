import java.util.ArrayList;

public class CourseDatabase {
    private ArrayList<Course> courseList;

    //Default Constructor and Constructor that you think it's necessary.
    public CourseDatabase(){}

    public void addCourse(Course newCourse);
    public void removeCourse(String courseID, int classID);
}
