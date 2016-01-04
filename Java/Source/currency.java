import javax.swing.*;

public class currency
{
    public static void main(String[] args)
    {
    int number1, planet;
    String n1, planetS, Lo;
    n1 = JOptionPane.showInputDialog("Enter the Money");
    number1 = Integer.parseInt(n1); 
    double weight, grav; 
    planetS = JOptionPane.showInputDialog("1 Canadian Dollar, 2 Pound, 3 Euro, 4 Australian Dollar.");
    planet = Integer.parseInt(planetS);
    switch (planet) {
        case 1: grav=1.33;
        break;
        case 2: grav=0.66;
        break; 
        case 3: grav=0.92;
        break;
        case 4: grav=1.42;
        break;
        default: grav=0;
        break;
        }


    weight = number1*grav;
    System.out.print(weight);
    System.exit(0);   
    }
}
