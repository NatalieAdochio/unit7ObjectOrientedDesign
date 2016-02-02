import java.util.Scanner;
/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    // this class supports fill in a blank questions where the answer is specified in the question
    //we will override the settext method of the question class to extract the answer
    public void setText(String questionText)
    {Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "________" +parser.next();

     super.setText(question);
     this.setAnswer(answer);
    }
}
