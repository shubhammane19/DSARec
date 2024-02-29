class CountDigits{

    int CountD(int num){
        int rem = 0;
        int count = 0;

        if(num == 0)
            return 0;

        else if(num>0){
                 rem = rem%10;
                 count++;
            }
            return count+CountD(num/10);
        }
    public static void main(String[] args){

        CountDigits obj = new CountDigits();

        int num = 2222;

        int ret = obj.CountD(num);
        System.out.println(ret);
    }
}