

/**
 * Write a description of class ChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
  private int numberOfChoices;
  
  public ChoiceQuestion()
  {
      super();
      numberOfChoice =0;
    }
    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        this.addText("\n" + numberOfChoice +")" + choice);
        if(correct)
        {
            String choiceString = " " + numberOfChoice;
            this.setAnswer(choiceString);
        }
    }
}
