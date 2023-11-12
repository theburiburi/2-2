public class Terrain {
    private double [][] heights;
    private double maxHeight;
    private double minHeight;

    /** Terrain Class의 생성자입니다.
     * 
     * @param heights
     */
    public Terrain(double[][] heights)
    {
        this.heights = heights;
        maxHeight = searchMaxHeight();
        minHeight = searchMinHeight();
    }
    /** Terrain생성자의 인자중에 가장 높은 높이를 리턴 메소드입니다.
     * 
     * @return 가장 높은 높이를 리턴합니다.
     */
    public double getMaxHeight()
    {
        return  maxHeight;
    }
    /** Terrain생성자의 인자중에 가장 낮은 높이를 리턴 메소드입니다.
     * 
     * @return 가장 낮은 높이를 리턴합니다.
     */
    public double getMinHeight()
    {
        return minHeight;
    }

    /** Terrain생성자의 인자중에 가장 높은 높이를 찾는 메소드입니다.
     * 
     * @return 찾은 값을 리턴해줍니다.
     */
    private double searchMaxHeight()
    {
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = 0; j < heights[i].length; j++)
            {
                if (heights[i][j] > maxValue)
                    maxValue = heights[i][j];
            }
        }
        return maxValue;
    }
    /** Terrain생성자의 인자중에 가장 낮은 높이를 찾는 메소드입니다.
     * 
     * @return 찾은 값을 리턴해줍니다.
     */
    private double searchMinHeight()
    {
        double minValue = Double.MAX_VALUE;
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = 0; j < heights[i].length; j++)
            {
                if (heights[i][j] < minValue)
                    minValue = heights[i][j];
            }
        }
        return minValue;
    }

    /** 수위에 잠긴 지역은 "*"로 아닌 지역은 " "로 프린트합니다.
     * 
     * @param waterLevel
     */
    public void printFloodMap(double waterLevel)
    {
        for (int j = 0; j < heights.length; j++)
        {
            for (int k = 0; k < heights[j].length; k++)
            {
                if (heights[j][k] < waterLevel)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
