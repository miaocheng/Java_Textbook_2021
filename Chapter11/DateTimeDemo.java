
import java.util.*;
import java.text.*;

public class DateTimeDemo   {
    public static void main(String [] args) {
        Date dNow = new Date();
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dNow);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        dBefore = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
        String defaultStartDate = sdf.format(dBefore);
        String defaultEndDate = sdf.format(dNow);
        System.out.println("前一天的时间是: " + defaultStartDate);
        System.out.println("当天的时间是: " + defaultEndDate);
    }
	
}


