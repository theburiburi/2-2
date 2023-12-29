import java.io.FileNotFoundException;


/**
 * CSVReader 클래스를 확인하기 위한 Tester 클래스입니다.
 */
public class CSVReaderTester{
    /**
     * 파일이 있다면 .csv파일을 ArrayList로 변형합니다.
     * 파일이 없다면 예외처리를 출력합니다.
     * @param args
     */
    public static void main(String[] args) {

        CSVReader csvRead = new CSVReader();
        try 
        {
            csvRead.readFile("Object_Oriented_Language/Assignment5/att2020.csv");
        } catch (FileNotFoundException e) 
        {
            System.out.print(e.getMessage());
            return;
        }

        System.out.println("Number of rows: " + csvRead.numberOfRows());
        System.out.println("Expected: 214\n");

        System.out.println("Number of fields in one row: " + csvRead.numberOfFields(10));
        System.out.println("Expected: 7\n");

        System.out.println(csvRead.field(10, 1));
        System.out.println("Expected: 3/12/2020\n");

        System.out.println(csvRead.field(10, 2));
        System.out.println("Expected: 24.87\n");

        System.out.println(csvRead.field(10, 3));
        System.out.println("Expected: 24.95\n");

        System.out.println(csvRead.field(10, 4));
        System.out.println("Expected: 24.87\n");

        System.out.println(csvRead.field(10, 5));
        System.out.println("Expected: 24.95\n");

        System.out.println(csvRead.field(10, 6));
        System.out.println("Expected: 217500\n");

        System.out.println(csvRead.field(10, 7));
        System.out.println("Expected: average: \"22.64\"\n");
    }    
}
