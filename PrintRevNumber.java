import java.util.*;

class PrintRevNumber{

    int revNo(int num){

        while(num>=1){

            System.out.println(num);
            return revNo(num-1);
        }
        return -1;
    }
    public static void main(String[] args){

        PrintRevNumber obj = new PrintRevNumber();
         obj.revNo(10);
        //System.out.println(ret);
    }
}