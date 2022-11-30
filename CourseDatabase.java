import java.util.ArrayList;

public class CourseDatabase {

    private ArrayList<Course> courseList;

    public CourseDatabase(){
        ArrayList<Course> courses=new ArrayList<>();
        courseList=courses;
    }



    public void addCourse(Course newCourse){
        courseList.add(newCourse);
    }
    public void removeCourse(String courseID, int classID){
        for (Course c:courseList){
            if (c.getCourseID().equals(courseID)&&c.getClassID()==classID){
                courseList.remove(c);
            }
        }
    }

    public ArrayList<Course> searchCourseByID(String courseID){
        ArrayList<Course> result=new ArrayList<>();
        for (Course c:courseList){
            if (c.getCourseID().equals(courseID)){
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Course> searchCourseByTeacherName(String teacherName){
        ArrayList<Course> result=new ArrayList<>();
        for (Course c:courseList){
            if (c.getTeacherName().equals(teacherName)){
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Course> searchCourseByCourseName(String courseName){
        ArrayList<Course> result=new ArrayList<>();
        for (Course c:courseList){
            if (c.getCourseName().equals(courseName)){
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Course> searchCourseByCourseTime(String startTime, String endTime){
        ArrayList<Course> result=new ArrayList<>();
        for (Course c:courseList){
            if (c.getTimeList().get(0).getEndTime().equals(endTime)&&c.getTimeList().get(0).getStartTime().equals(startTime)||c.getTimeList().get(1).getEndTime().equals(endTime)&&c.getTimeList().get(1).getStartTime().equals(startTime)){
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }
}
