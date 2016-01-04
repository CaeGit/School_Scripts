import java.util.Scanner;
public class zmath {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int currentMax=Integer.MIN_VALUE;
        int currentMin=Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        while(scanner.hasNextInt()) 
        {
            int num = scanner.nextInt();
            if(num<currentMin && num!=0) currentMin = num;
            if(num>currentMax) currentMax = num;
            sum += num;
            count +=1;
            if (num == 0)
                break;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Miniumum = "+currentMin);
        System.out.println("Max = "+currentMax);
        System.out.println("Number of Numbers = "+count);
    }
}
