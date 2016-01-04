public class xloop {
    public static void main(String[] args)
    {
        int i = 0;
        char level = 'A';
        if (level=='A')
        {
            while(i!=5)
            {
                i++;
                System.out.print('A'+i);
            }
            level='B';
            }
            else if (level=='B')
            {
                while(i!=1)
                {
                    i = i-1;
                    System.out.print('B'+i);
                }
                level='C';
            }
            else if  (level=='C')
            {
                i=10;
                while(i!=20)
                {
                    System.out.print('C'+i);
                    i = i+5;
                }
            }
            System.out.println(i);
    }
}
