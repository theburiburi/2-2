import java.time.LocalTime;

public class WorldClockDemo {
    /** Clcok과 WorldClock 클래스를 확인하기 위한 메인문입니다.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(-14);

        System.out.println("Base time in Current Time-Zone");
        System.out.printf("Hours: %d \n", clock.getHours());
        System.out.printf("Minutes: %d \n", clock.getMinutes());
        System.out.println("Time: "+clock.getTime());
        System.out.println();

        System.out.printf("World CLock Offset: %d \n", worldClock.getOffset());
        System.out.printf("Hours: %d\n", worldClock.getHours());
        System.out.printf("Minutes: %d \n", worldClock.getMinutes());
        System.out.println("Time: "+worldClock.getTime());


    }
}
