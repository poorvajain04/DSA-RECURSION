public class print_1_to_n {
    public static void main(String[] args) {
        int n=20;
        int current =1;
        print(current,n);
    }
    public static void print(int current, int n){
        if(current>n){
            return;
        }
        System.out.print(current+" ");
        print(current+1,n);
    }
}
