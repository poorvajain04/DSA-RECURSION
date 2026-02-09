public class sum_of_digits_of_a_number {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(sum_of_digit(n));
    }
    public static int sum_of_digit(int n){
        if(n==0) {
            return 0;
        }
        return (n%10)+sum_of_digit(n/10);
    }
}
