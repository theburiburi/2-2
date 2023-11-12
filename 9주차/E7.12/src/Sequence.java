public class Sequence {
    private int[] values;

    public Sequence(int size) 
    {
        values = new int[size];
    }

    public void set(int i, int n)
    {
        values[i] = n;
    }

    public int get(int i)
    {
        return values[i];
    }

    public int size()
    {
        return values.length;
    }

    public boolean equals(Sequence other)
    {
        int i = 0;
        for (i = 0; i < 5; i++)
        {
            if(values[i] != other.get(i))
                return false;
        }
        return true;
    }
}