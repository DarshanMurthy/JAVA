public class Factorial{

    public static int Fact(int n){

        if(n ==0 || n==1){ return 1 ;}
        else {
            return n*Fact(n-1);
        }
    }

    public static int  Fib(int n){
        if(n ==0 ) return 0;
        else if( n== 1 ) return 1;
        else {

            int value = Fib(n-1) + Fib(n-2);
            return value;

        }

    }



    public static void main(String args[]){
        //int value = Fact(3);
        for(int i=78;i<100;i++){
            System.out.println(Fib(i));
        }


       
    }
}