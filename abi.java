
package javaapplication2;
import java.util.*;
public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b="";
        for(int i=0;i<a.length()-1;i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(!b.contains(a.substring(i,i+1)))
                {
                    if(a.substring(i,i+1).equals(a.substring(j,j+1)))
                    {
                        b+=a.substring(j,j+1);
                      
                    }
                }
            }
        }
        int n=b.length();
        System.out.print(n);
    }}
    
