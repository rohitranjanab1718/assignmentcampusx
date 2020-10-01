import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=gcd(n1,n2);
        System.out.println(result);
    }
   public static int gcd(int a,int b ){
        if(a!=0){
            return gcd(b%a,a);
        }
         else{
             return b;
        }
    }
}