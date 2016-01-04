import javax.swing.*;

public class Joption
{
    public static void main(String[] args)
    {
    int number1, number2, number3, number4; 
    int sum, average;
    String n1, n2, n3, n4;
    n1 = JOptionPane.showInputDialog("Enter the First Number");
    n2 = JOptionPane.showInputDialog("Enter the second Number ");
    n3 = JOptionPane.showInputDialog("Enter the Third number");
    n4 = JOptionPane.showInputDialog("Enter the fourth number");
    number1 = Integer.parseInt(n1); 
    number2 = Integer.parseInt(n2);
    number3 = Integer.parseInt(n3);
    number4 = Integer.parseInt(n4);
    
    sum = number1 + number2 + number3 + number4;
    average = sum/4;
    System.out.print(sum+"\n");
    System.out.print(average+"\n");
    System.exit(0);   
    }
}
