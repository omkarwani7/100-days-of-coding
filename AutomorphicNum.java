import java.util.*;
class AutomorphicNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int square;
            square = num * num;
            int last_num = num % 10;
            int last_square = square % 10;

            if(last_num == last_square){
                System.out.println(num + "is an automorphic number.");
            }else{
                System.out.println(num + "is not an automorphic number.");
            }
        }
}