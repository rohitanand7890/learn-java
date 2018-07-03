package logics;

public class PrimeNo {
    public static boolean isPrime(int num){
        if ( num > 2 && num%2 == 0 ) {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }

    public static void main(String[] args) {
        int no= 23;
        boolean res = isPrime(no);
        System.out.println("Is "+no+" prime ? = "+res);

    }
}
