public class Person {
    protected String name;
    protected int birthYear;
    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String toString()
    {
        return "Person=[name=" + name +",birthYear=" + birthYear + "]";
    }
}
