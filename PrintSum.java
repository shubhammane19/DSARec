import java.util.*;
class PrintSum{

    int SumOfN(int num){

        if(num == 0){

            return 0;
        }else{

               return num+SumOfN(num-1);
            }
        }
    public static void main(String[] args){

        PrintSum obj = new PrintSum();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ret = obj.SumOfN(num);
        System.out.println(ret);
    }
}