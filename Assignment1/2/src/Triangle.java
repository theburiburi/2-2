import java.util.Scanner;

public class Triangle {
    private double x1, y1, x2, y2, x3, y3;
    /** Triangle Class 기본 생성자입니다.
     *  각 좌표를 입력받아 초기화를 합니다.
     * @param a1 x1의 좌표입니다.
     * @param a2 y1의 좌표입니다.
     * @param b1 x2의 좌표입니다.
     * @param b2 y2의 좌표입니다.
     * @param c1 x3의 좌표입니다.
     * @param c2 y3의 좌표입니다.
     */
    public Triangle(double a1, double a2, double b1, double b2, double c1, double c2)
    {
        x1 = a1;
        y1 = a2;
        x2 = b1;
        y2 = b2;
        x3 = c1;
        y3 = c2;
    }
/** 삼각형의 각 변을 구하는 메소드입니다.
 * 
 * @return 삼각형의 각 변을 구해서 side 배열로 return 합니다.
 */
    public double[] getSideLengths()
    {
        double[] side = new double[3];
        side[0] = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        side[1] = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        side[2] = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        return side;
    }

    /** atan2의 함수를 이용하여 점 a에서의 각도를 구하는 메소드입니다.
     * private으로 지정해서 getAngles 메소드에서 이용합니다.
     * @param x1 vertex1의 x 좌표입니다.
     * @param y1 vertex1의 y 좌표입니다.
     * @param x2 vertex2의 x 좌표입니다.
     * @param y2 vertex2의 y 좌표입니다.
     * @param x3 vertex3의 x 좌표입니다.
     * @param y3 vertex3의 y 좌표입니다.
     * @return
     */
    private double angle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        double a = Math.atan2((y2 - y1),(x2 - x1));
		double b = Math.atan2((y3 - y1),(x3 - x1));

		return Math.abs(a - b);
    }

    /** angle 메소드를 이용하여 각 꼭짓점에서의 각도를 구하는 메소드입니다.
     * 
     * @return angle 이름의 배열을 이용하여 return해줍니다.
     */
    public double[] getAngles()
    {
        double[] angle = new double[3];
		angle[0] = angle(x1,y1,x2,y2,x3,y3);
		angle[1] = angle(x2,y2,x1,y1,x3,y3);
		angle[2] = angle(x3,y3,x2,y2,x1,y1);
        return angle;
    }

    /** 삼각형의 지름을 구하는 메소드입니다.
     * 
     * @return 각 변을 더해서 return 해줍니다.
     */
    public double perimeter()
    {
        double[] side = getSideLengths();
        return side[0] + side[1] + side[2];
    }

    /** 삼각형의 넓이를 구하는 메소드입니다.
     * 삼각형 꼭짓점의 각 x, y 좌표를 이용하여 넓이를 구합니다.
     * @return 삼각형 넓이를 return 합니다.
     */
    public double area()
    {
        return Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1) / 2.0;
    }

    /** void 형태로 각 vertex의 x와 y 좌표를 프린트합니다.
     * 
     * @param x1 vertex1의 x 좌표입니다.
     * @param y1 vertex1의 y 좌표입니다.
     * @param x2 vertex2의 x 좌표입니다.
     * @param y2 vertex2의 y 좌표입니다.
     * @param x3 vertex3의 x 좌표입니다.
     * @param y3 vertex3의 y 좌표입니다.
     */
    public void printIndex(double x1,double y1,double x2,double y2,double x3,double y3)
    {
        System.out.println("---------------------");
        System.out.println("| index |  x  |  y  |");
        System.out.println("---------------------");
        System.out.printf("|   1   |%5.2f|%5.2f|\n", x1, y1);
        System.out.println("---------------------");
        System.out.printf("|   2   |%5.2f|%5.2f|\n", x2, y2);
        System.out.println("---------------------");
        System.out.printf("|   3   |%5.2f|%5.2f|\n", x3, y3);
        System.out.println("---------------------");
        System.out.println("");
    }

    /** 삼각형의 각 변의 길이와 꼭짓점에서의 각도를 출력합니다.
     * 
     * @param s 삼각형의 각 변이 담긴 side 배열입니다.
     * @param a 삼각형의 각 각도가 담긴 angle 배열입니다.
     */
    public void printLenAng(double[] s, double[] a)
    {
        double[] side = s;
        double[] angle = a;
    
        System.out.println("---------------------------");
        System.out.println("| index | length | angle  |");
        System.out.println("---------------------");
        System.out.printf("|   1   |%8.2f|%8.2f|\n", side[0], angle[0]);
        System.out.println("---------------------");
        System.out.printf("|   2   |%8.2f|%8.2f|\n", side[1], angle[1]);
        System.out.println("---------------------");
        System.out.printf("|   3   |%8.2f|%8.2f|\n", side[2], angle[2]);
        System.out.println("---------------------");
        System.out.println("");
    }

    /** 삼각형의 둘레와 넓이를 출력하는 메소드입니다.
     * 
     * @param p 삼각형의 둘레입니다.
     * @param a 삼각형의 넓이입니다.
     */
    public void printPeriArea(double p, double a)
    {
        double perimeter = p;
        double area = a;
        System.out.println("---------------------");
        System.out.println("| perimeter |  area  |");
        System.out.println("---------------------");
        System.out.printf("|%11.2f|%8.2f|\n", perimeter, area);
        System.out.println("---------------------");
    }
}
