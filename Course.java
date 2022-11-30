import java.util.ArrayList;
public class Course {
    private String teacherName;
    private String courseName;
    private String courseID;
    private int classID;
    private ArrayList<SUSTechTime> timeList;
    private int capacity;
    private int Credit;

    private int nowcapacity;



    public Course(String teacherName, String courseName, String courseID, int classID, ArrayList<SUSTechTime> timeList, int capacity){
        this.teacherName=teacherName;
        this.courseName=courseName;
        this.courseID=courseID;
        this.classID=classID;
        this.capacity=capacity;
        this.timeList=timeList;
        Credit=0;
        nowcapacity=0;
    }

    public  Course(){

    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getClassID() {
        return classID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public ArrayList<SUSTechTime> getTimeList(){
        return timeList;
    }

    public String toString() {
        return "Course{" + this.getCourseID() + " " + this.getCourseName() + "-class " + this.getClassID() + " | " + this.getCapacity() + "}";
    }

    public void setCredit(int credit) {
        Credit = credit;
    }

    public void setNowcapacity(int nowcapacity) {
        this.nowcapacity = nowcapacity;
    }

    public int getNowcapacity(){
        return nowcapacity;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTimeList(ArrayList<SUSTechTime> timeList) {
        this.timeList = timeList;
    }
}
