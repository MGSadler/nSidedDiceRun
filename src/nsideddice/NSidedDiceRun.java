
package nsideddice;

public class NSidedDiceRun {

    public static void main(String[] args) 
    {
       Die d12 = new Die(12); //makes 12 sided die.
       Die normal = new Die(6); //makes regular die.
       System.out.println(normal.getValue());
       System.out.println(normal.roll());
       normal.setSides(20);
       System.out.println(normal.roll());
       System.out.println(d12.getValue());
       System.out.println(d12.roll());
    }
    
}
