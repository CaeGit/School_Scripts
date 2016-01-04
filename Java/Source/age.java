import javax.swing.*;

public class age 
{
    public static void main(String[] args)
    {
    int age;
    String fn;
    String name; 
    fn = JOptionPane.showInputDialog("Insert Age");
    age = Integer.parseInt(fn);
    if (age <=  1) {name = "baby";}
    else if (age <= 3 && age >= 1) {name = "toddler";} 
    else if (age <= 12 && age >= 3) {name = "child";}
    else if (age <= 19 && age >= 12){name = "Teenager";}
    else if (age <= 61 && age >= 19){name = "adult";}
    else {name = "Senior Citizen";}
    System.out.println(name);
    System.exit(0);
    }

}
