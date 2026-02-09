public class count_no_of_steps {
    public static void main(String[] args) {
        int n=14;
        System.out.println(countSteps(n));
    }
    public static int countSteps(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return 1+countSteps(n/2);
        }
        else{
            return 1+countSteps(n-1);
        }
    }
}
