import java.util.*;
public class Handshakes{
    public static int maxHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxHandshakes(n));
    }
}