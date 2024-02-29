import java.util.*;

class Factorial{

    int FactOfN(int fact){
        //int num = 1;

        if(fact == 0)
            return 1;
        
        return fact*FactOfN(fact-1);
        
    } 
    public static void main(String[] args){

        Factorial f = new Factorial();

        Scanner sc  = new Scanner(System.in);

        int fact = sc.nextInt();
        int ret = f.FactOfN(fact);
        System.out.println(ret);
    }
}