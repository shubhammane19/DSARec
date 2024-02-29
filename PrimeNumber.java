import java.util.*;

class PrimeNumber{

    int PrimeNo(int num, int i){
        
        //int i = num;
        if(num <= 1)
            return 0;

        else if(i == 1){

            return 1;
        }else{

            if(num%i == 0){
                return 1+ PrimeNo(num, i-1);
            }else{
                return PrimeNo(num,i-1);
            
            }
       }
    }
    public static void main(String[] args){
       
        PrimeNumber obj = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ret = obj.PrimeNo(num,num);

        if(ret>2){
            System.out.println("Number is not prime");
        }else
            System.out.println("Number is prime");
    }
}