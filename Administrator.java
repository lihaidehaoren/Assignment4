import java.util.ArrayList;

public class Administrator {
    private ArrayList<Student> studentList;
    private CourseDatabase database;

    public CourseDatabase getDatabase(){
        return database;
    }

    public Administrator(){
        CourseDatabase courseDatabase=new CourseDatabase();
        ArrayList<Student> students=new ArrayList<>();
        studentList=students;
        database=courseDatabase;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addStudent(int studentID){
        Student student =new Student(studentID);
        studentList.add(student);
    }

    public void generateCurriculum(){
        for (Course c: database.getCourseList()){
            if (c.getNowcapacity()>c.getCapacity()) {
                int member=c.getNowcapacity()-c.getCapacity();
                int credit=100;
                for (Student s:studentList){
                    for (int i=0;i<s.getCurriculum().size();i++){
                        if (s.getCurriculum().get(i).getCourseID().equals(c.getCourseID())&&s.getCurriculum().get(i).getCredit()<credit){
                            credit=s.getCurriculum().get(i).getCredit();
                        }
                    }
                }
                for (int j=0;j<member;j++){
                    for (Student s:studentList){
                        for (int i=0;i<s.getCurriculum().size();i++){
                            if (s.getCurriculum().get(i).getCourseID().equals(c.getCourseID())&&s.getCurriculum().get(i).getCredit()==credit){
                                s.getCurriculum().remove(s.getCurriculum().get(i));
                            }
                        }
                    }
                    member=member-1;
                }
            }
        }
    }
}
