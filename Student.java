import java.util.ArrayList;

public class Student {
    private int studentID;
    private ArrayList<Course> curriculum;
    private int remainingCredit;

    public Student(int studentID) {
        this.studentID = studentID;
        remainingCredit=100;
        ArrayList<Course> courses=new ArrayList<>();
        curriculum=courses;
    }

    public void selectCourse(Course course, int credit){
        remainingCredit=remainingCredit-credit;
        boolean flag=true;
        boolean flag1=false;
        if (curriculum==null){
            flag1=true;
        }
        if (!flag1){
            for (Course c:curriculum){
                if (c.getTimeList().get(0)==course.getTimeList().get(0)||c.getTimeList().get(0)==course.getTimeList().get(1)||c.getTimeList().get(1)==course.getTimeList().get(0)||c.getTimeList().get(1)==course.getTimeList().get(1)){
                    flag=false;
                    break;
                }
            }
        }
        if (remainingCredit>=0&&flag){
            Course c =new Course();
            c.setCredit(credit);
            course.setNowcapacity(course.getNowcapacity()+1);
            c.setTeacherName(course.getTeacherName());
            c.setCourseName(course.getCourseName());
            c.setCourseID(course.getCourseID());
            c.setClassID(course.getClassID());
            c.setCapacity(course.getCapacity());
            c.setTimeList(course.getTimeList());
            curriculum.add(c);
        }
    }


    public void dropCourse(Course course){
        if (curriculum!=null){
            for (int i=0;i<curriculum.size();i++){
                if (curriculum.get(i).getCourseID().equals(course.getCourseID())){
                    curriculum.remove(curriculum.get(i));
                }
            }
        }

    }

    public void changeCredit(Course course, int credit){
        for (Course c:curriculum){
            if (c.getCourseID().equals(course.getCourseID())){
                curriculum.remove(c);
                c.setCredit(credit);
                curriculum.add(c);
            }
        }
    }

    public ArrayList<Course> getCurriculum() {
        return curriculum;
    }
}
