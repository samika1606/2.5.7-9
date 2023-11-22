import java.util.Calendar;
public class Calendar {

    public static String Date(){
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }
}