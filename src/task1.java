public class task1 {
    public static void sum(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        sum(n/10);
        System.out.println(n%10);
    }

    public static void main(String[] args){
        sum(5481);
    }
}
