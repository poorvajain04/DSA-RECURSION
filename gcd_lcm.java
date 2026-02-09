public class gcd_lcm {
    public static void main (String [] args){
        int a=13;
        int b=17;
        System.out.println("GCD of two number " +a+ " "+ b+ " is : "+gcd(a,b));
        System.out.println("LCM of two number "+a+" "+b+" is : "+lcm(a,b));

    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
