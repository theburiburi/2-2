import java.util.Scanner;
public class TerrainTest {
    /** Terrain 클래스를 확인하기 위한 메인문입니다.
     * 
     * @param args
     */
    public static void main(String[] args){
        Scanner In = new Scanner(System.in);

        int size = 10;

        System.out.print("Enter height values:");
        double terra[][] = new double[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                terra[i][j] = In.nextDouble();
            }
        }

        Terrain Tr = new Terrain(terra);
        System.out.printf("Lowest Height: %.1f", Tr.getMinHeight());
        System.out.print("\n");
        System.out.printf("Highest Height: %.1f", Tr.getMaxHeight());
        System.out.print("\n");

        double step = (Tr.getMaxHeight() - Tr.getMinHeight()) / ((double) size-1);
        double waterLevel = Tr.getMinHeight();

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Waterlevel: ");
            System.out.println(waterLevel + step*(i));
            Tr.printFloodMap(waterLevel + step*(i));
        }
    }
}
