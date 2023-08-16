// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number

// ip-  aA1_67  op - 1
// ip-  a987 abC012  op - 0


import java.util.*;
public class PasswordChecker{
    public static int passCheck(String str,int n){
        if(n<4){
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        int num=0;
        int cap=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='/'){
                return 0;
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num++;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                cap++;
            }
        }
        if(num>0 && cap>0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        String str="aA1_67";
        int n=str.length();
        System.out.println(passCheck(str,n));
    }
}