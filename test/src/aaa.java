public class aaa {
    private final int eps = 3;
    private int a = 0;

    public aaa(int b)
    {
        a = b;
    }

    public int add()
    {
        a = a + eps;
        return a;
    }
}