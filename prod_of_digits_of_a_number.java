public class prod_of_digits_of_a_number {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(prod(n));
    }
    public static int prod(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*prod(n/10);
    }
}
