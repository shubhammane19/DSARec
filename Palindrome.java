import java.util.*;

class Palindrome{
	   int PalNo(int num){

        int temp = 0;
        int rem = 0;

        while(num>0){

            rem = num%10;
            temp = temp*10+rem;
            num = num/10;
        }

        return temp;
    }
    public static void main(String[] args){

        Palindrome objP = new Palindrome();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ret = objP.PalNo(num);

        if(ret == num){
            System.out.println(num + " is a PalinDrome Number");
        }else{

            System.out.println(num + " is not a palindrome number");
        }
    }
}