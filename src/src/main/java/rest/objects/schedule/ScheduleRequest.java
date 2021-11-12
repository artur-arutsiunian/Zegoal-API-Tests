package rest.objects.schedule;

public class ScheduleRequest {

    public String user = "";
    public int type = 0;
    public String start_datetime = "";
    public String end_datetime = "";
    public boolean is_night_shift = false;

    public ScheduleRequest(){

    }

    public ScheduleRequest(String user, int type, String start_datetime, String end_datetime, boolean is_night_shift){

        this.user = user;
        this.type = type;
        this.start_datetime = start_datetime;
        this.end_datetime = end_datetime;
        this.is_night_shift = is_night_shift;
    }
}
