package exception;

public class Mainclass {
    public static void main(String[] args) {
        int a1= 8;
        int num=0;
        try{
                System.out.println(" Result = "+a1/num);
        }
          catch (ArithmeticException e1){
                System.out.println("Invalid no for division");
        }
    }
}
