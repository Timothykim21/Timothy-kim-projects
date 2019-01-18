public class Main {
    public static int fibo(int a){
        if(a<=1){
            return a;
        }
        else{
            return fibo(a-1)+ fibo(a-2);
        }
    }

    public static void main(String[] args) {
        System.out.print(fibo(4));
    }
}
