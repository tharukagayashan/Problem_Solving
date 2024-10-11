import java.io.IOException;

public class TimeConversion {

    public static String timeConversion(String s) {

        String ampm = s.substring(8,10);
        String hour = s.split(":")[0];
        String restTime = s.substring(2,8);

        System.out.println("ampm: " + ampm);
        System.out.println("hour: " + hour);
        System.out.println("restTime: " + restTime);

        if(ampm.equals("PM")) {
            if(!hour.equals("12")) {
                int newHour = Integer.parseInt(hour) + 12;
                return newHour + restTime;
            }else {
                return hour + restTime;
            }
        } else {
            if(hour.equals("12")) {
                return "00" + restTime;
            } else {
                return hour + restTime;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        String s = "07:05:45PM";
        TimeConversion.timeConversion(s);
//        System.out.println(response);
    }

}