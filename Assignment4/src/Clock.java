import java.time.LocalTime;

public class Clock {
    /** LocalTime.now()를 이용하여 현재 local hours를 가져오는 메소드입니다.
     * 
     * @return 현재 hours를 리턴합니다.
     */
    public int getHours()
    {
        String timeString = LocalTime.now().toString();

        return Integer.parseInt(timeString.substring(0,2));
    }
    /** LocalTime.now()를 이용하여 현재 local minutes를 가져오는 메소드입니다.
     * 
     * @return 현재 minutes를 리턴합니다.
     */
    public int getMinutes()
    {
        String timeString = LocalTime.now().toString();

        return Integer.parseInt(timeString.substring(3,5));
    }

    /** 현시 시각을 나타내는 메소드입니다.
     * 
     * @return 현재 시와 분을 리턴합니다.
     */
    public String getTime()
    {
        return String.format("%d:%d", getHours(), getMinutes());
    }
}
