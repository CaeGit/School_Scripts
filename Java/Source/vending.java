import javax.swing.*;

public class vending
{
    public static void main(String[] args)
    {
       int in, cost, out, scost;
       String nin, soda;
       nin = JOptionPane.showInputDialog("Enter Money");
       in = Integer.parseInt(nin);
       soda = JOptionPane.showInputDialog("(1) Soda 2$, (2) Water 1$");
       scost = Integer.parseInt(soda);
       switch (scost)
       {
           case 1: cost=2;
           break;
           case 2: cost=1;
           break;
           default: cost=0;
           break;
       }

       out = in-cost;
       if (out >= 0){
           System.out.print("Change = "+out); 
       }
       else
       {
           System.out.print("Error, Not enough money");
       }
       System.exit(0);
    }
}

