import java.util.*;
public class twosum{
    public static int fib(int value){
    System.out.println(value);
    fib(value--);

    return value;
    }


    public static void main(String args[]){
        int value =100;
        int va= fib(value);      

    }

}