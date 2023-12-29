public class Quiz implements Measurable{
    int score;
    String grade;

    public Quiz(int score, String grade)
    {
        this.score = score;
        this.grade = grade;
    }

    public String getGrade()
    {
        return grade;
    }

    public int getScore()
    {
        return score;
    }

    public double getMeasure()
    {
        return score;
    }
}
