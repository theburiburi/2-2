import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;

/** 
 * CSVReader 클래스는 .csv 파일을 가져와서 2차원 ArrayList로 변형시키는 클래스입니다.
 */
public class CSVReader {
    private ArrayList<ArrayList<String>> dataMatrix;
    /**
     * CSVReader 생성자입니다. 2차원 ArrayList를 만들어서 넣어줍니다.
     */
    public CSVReader()
    {
        dataMatrix = new ArrayList<ArrayList<String>> ();
    }
    /**
     * .csv파일형의 파일 이름을 넣어서 2차원 ArrayList로 변형하는 함수입니다.
     * @param fileName 변형시키고자 하는 .csv파일형의 파일 이름을 넣습니다.
     * @throws FileNotFoundException 파일이 없을 시 FileNotFound 예외를 throws 합니다.
     */
    public void readFile(String fileName) throws FileNotFoundException{
        File data = new File(fileName);
        Scanner in = new Scanner(data);

        

        while(in.hasNextLine())
        {
            ArrayList<String> dataArr = new ArrayList<String>();
            String dataStr = in.nextLine();
            String [] dataStrArr = dataStr.split(",");
            
            for (String words : dataStrArr)
            {
                if (words.charAt(0) == '\"')
                {
                    words = words.substring(1, words.length() - 1);
                }
                dataArr.add(words);
            }
            dataMatrix.add(dataArr);
        }
        in.close();
    }
    /**
     * .csv의 행의 갯수를 리턴해줍니다.
     * @return 행의 갯수를 리턴해줍니다.
     */
    public int numberOfRows()
    {
        return dataMatrix.size();
    }

    /**
     * .csv의 열의 갯수를 리턴해줍니다.
     * @param row
     * @return 열의 갯수를 리턴해줍니다.
     */
    public int numberOfFields(int row)
    {
        return dataMatrix.get(row).size();
    }

    /**
     * 원하는 행과 열의 값을 입력받아 데이터의 값을 리턴해주는 method입니다.
     * @param row 원하는 값의 행의 값입니다.
     * @param column 원하는 값의 열의 값입니다.
     * @return 입력받은 행과 열의 값과 ArrayList 안에 들어있는 값을 리턴해줍니다.
     */
    public String field(int row, int column)
    {
        String a = dataMatrix.get(row - 1).get(column - 1);
        String b = "Row " + row + ", Col " + column + ": " + a;
        return b;
    }
    
}
