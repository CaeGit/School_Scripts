import java.util.Scanner;
public class lmath {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double counter = 1;
        double totalSoFar = input.nextDouble(); 
        while(input.hasNextDouble()) {
            totalSoFar=totalSoFar+input.nextDouble();
            counter=counter+1;
            if (totalSoFar == 0)
                break;
        }
        double mean = totalSoFar/counter;
        System.out.print(totalSoFar);
        System.out.print(mean);
    }
}
