import java.util.Scanner;
/** Triangle class를 확인하기 위한 파일입니다.
 * 
 */

 /**
  * 삼각형 꼭짓점의 각 좌표를 입력받습니다.
  * triangle 객체를 만들고 메소드를 이용해 변, 각도, 둘레, 넓이를 구합니다.
  */
public class TriangleTester{
    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);

        System.out.print("Vertex x1? ");
        double x1 = keyIn.nextDouble();
        System.out.print("Vertex y1? ");
        double y1 = keyIn.nextDouble();
        System.out.print("Vertex x2? ");
        double x2 = keyIn.nextDouble();
        System.out.print("Vertex y2? ");
        double y2 = keyIn.nextDouble();
        System.out.print("Vertex x3? ");
        double x3 = keyIn.nextDouble();
        System.out.print("Vertex y3? ");
        double y3 = keyIn.nextDouble();
        System.out.println("");

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        double[] side = triangle.getSideLengths();
        double[] angle = triangle.getAngles();
        double perimeter = triangle.perimeter();
        double area = triangle.area();

        triangle.printIndex(x1,y1,x2,y2,x3,y3);
        triangle.printLenAng(side, angle);
        triangle.printPeriArea(perimeter, area);
    }
}
