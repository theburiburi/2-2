public class DataSet {
    double averageValue, range;
    private int n;
    private double sum;
    private double smallestValue, largestValue;
    public DataSet()
    {
        largestValue = Double.MIN_VALUE;
        smallestValue = Double.MAX_VALUE;
        averageValue = range = sum = n = 0;
    }

    public void add(double x)
    {
        sum += x;
        n += 1;
        if (largestValue < x)
            largestValue = x;
        if (smallestValue > x)
            smallestValue = x;
    }

    public double getAverage()
    {
        return sum / n;
    }

    public double getSmallest()
    {
        return smallestValue;
    }

    public double getLargest()
    {
        return largestValue;
    }

    public double getRange()
    {
        return largestValue - smallestValue;
    }

    public int getCount()
    {
        return n;
    }
}
