public class HybridCar 
{
    private double carCost;
    private double milesPerYear;
    private double gasCost;
    private double efficiency;
    private double resaleValue5Years;
    /** hybridcar의 생성자입니다. hybridcar내의 변수를 초기화해줍니다.
     * 
     * @param c 자동차 가격을 받는 인자입니다.
     * @param m 매년 몇 마일을 타는 지 받는 인자입니다.
     * @param g 가스 1갤런마다 가격을 받는 인자입니다.
     * @param e 가스 1갤런마다 평균 몇 마일 가는 지 받는 인자입니다.
     * @param r 5년뒤에 리세일가가 얼마인지 받는 인자입니다.
     */
    public HybridCar(double c, double m, double g, double e, double r)
    {
        carCost = c;
        milesPerYear = m;
        gasCost = g;
        efficiency = e;
        resaleValue5Years = r;
    }
    /** 5년 탔을 때 얼마나 돈이 드는 지 계산하는 메소드 입니다.
     * 
     * @return 5년 탔을 때 든 돈을 리턴해줍니다.
     */
    public double TotalCost()
    {
        double total = carCost;
        total += (milesPerYear * 5) * gasCost / efficiency;
        total -= resaleValue5Years;

        return total;
    }

    /** 자동차 가격 정보를 받기 위한 메소드 입니다.
     * 
     * @return 입력받은 자동차 가격을 리턴해줍니다.
     */
    public double getCarCost()
    {
        return carCost;
    }
    /** 매년 자동차를 얼마나 타는 지 정보를 받기위한 메소드입니다.
     * 
     * @return 입력받은 평균 마일을 리턴해줍니다.
     */
    public double getMilesDrivenPerYear()
    {
        return milesPerYear;
    }
    /** 1갤런마다 가스 가격을 입력받는 정보를 받기위한 메소드입니다.
     * 
     * @return 입력받은 가스 비용을 리턴해줍니다.
     */
    public double getGasCost()
    {
        return gasCost;
    }
    /** 자동차 1갤런마다 몇 마일 가는 지 효율 정보를 받기위한 메소드입니다.
     * 
     * @return 입력받은 효율을 리턴해줍니다.
     */
    public double getEfficiency()
    {
        return efficiency;
    }
    /** 5년뒤에 자동차를 되팔았을 때 받을 수 있는 가격 정보를 받기위한 메소드입니다.
     * 
     * @return 자동차 되팔램 가격을 리턴해줍니다.
     */
    public double resaleValue5Years()
    {
        return resaleValue5Years;
    }
}
