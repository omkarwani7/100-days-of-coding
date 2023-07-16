//leetcode Q. 22

import java.util.*;
public class GenerateParentheses{
    public void getValue(List<String> res,int openB,int closeB,String str,int n){
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        if(openB<n){
            getValue(res,openB+1,closeB,str+"(",n);
        }
        if(closeB<openB){
            getValue(res,openB,closeB+1,str+")",n);
        }
    }
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        getValue(res,0,0,"",n);
        return res;
    }
    public static void main(String[] args){
        int n=3;
    }
}