import javax.swing.*;

public class VenMach 
{
    public static void main(String[] args)
    {
    int number1, planet;
    String n1, planetS, Lo;
    n1 = JOptionPane.showInputDialog("Enter the Money");
    number1 = Integer.parseInt(n1); 
    double total, grav; 
    planetS = JOptionPane.showInputDialog("1 Snack 1.50$ 2 Drink 1$");
    planet = Integer.parseInt(planetS);
    switch (planet) {
        case 1: grav=1.50;
        break;
        case 2: grav=1;
        break; 
        default: grav=number1;
        break;
        }


    total = number1-grav;
    System.out.print(total);
    System.exit(0);   
    }
}
