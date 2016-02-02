

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    // this is overloading
    public void setAnswer( double correctResponse )
    {
        this.answer = correctResponse;
    }
    //this is overriding
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <=0.01;
    }
}
