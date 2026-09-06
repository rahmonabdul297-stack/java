package conditions;
import java.time.LocalTime;

public class Time {
    // Record 
     public record TimeComponents(int hour, int minute, int second) {}
    public static TimeComponents getTime() {
        LocalTime now = LocalTime.now();
        
        int hour = now.getHour();
        int mins = now.getMinute();
        int sec = now.getSecond();
        
        return new TimeComponents(hour, mins, sec);
    }
}