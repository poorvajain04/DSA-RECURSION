public class count_zeros {
    public static void main(String[] args) {
        int n=1230000000;
        System.out.println(countZero(n));
    }
    static int countZero(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        int count=(rem==0)?1:0;
        return count+countZero(n/10);
    }
}
