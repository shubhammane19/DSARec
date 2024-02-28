import java.util.*;

class PrintNo{
    void PrintNumber(int num){

        if(num <= 10){

            System.out.println(num);
            PrintNumber(num +1);
        }
    }
    public static void main(String[] args){

        PrintNo pn = new PrintNo();
        int num = 1;
        pn.PrintNumber(num);
       // System.out.println(ret);
    }
}