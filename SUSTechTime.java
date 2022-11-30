public class SUSTechTime {
    private String StartTime;
    private String EndTime;
    private Weekday weekday;
    private WeekType weekType;

    public SUSTechTime(String StartTime,String EndTime,Weekday weekday,WeekType weekType){
        this.StartTime=StartTime;
        this.EndTime=EndTime;
        this.weekday=weekday;
        this.weekType=weekType;
    }

    public String getStartTime() {
        return StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public Weekday getWeekday(){
        return weekday;
    }

    public WeekType getWeekType() {
        return weekType;
    }

    public String toString(){
       return "Course{" + this.getStartTime() + " ~ " + this.getEndTime() + " | " + this.getWeekday()+ " | " + this.getWeekType() + "}";
    }
}
