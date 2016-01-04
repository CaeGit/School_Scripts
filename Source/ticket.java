public class ticket{
        public static void main(String[] args){

                int BaseFine=100;
                int Additional=5;
                int SpeedLimit=45;
                int GracePeriod=5;
                int SpeederSpeed=55;
                int Speeding=SpeederSpeed-SpeedLimit-GracePeriod;
                int Extra=Speeding*Additional;
                int Fine=BaseFine+Additional;
                System.out.print("Speeder went "+ Speeding+" Miles over speed limit");
                System.out.print(" He owes "+Fine);

        }
    }
