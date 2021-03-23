
package util;

public class FindLcm {
    static int temp=1;
      public static int findLcm(int a,int b){
     
       if(temp%a==0 && temp%b==0){
           return temp;
       }
       else{
           temp++;
           findLcm(a, b);
           return temp;
       }
    }
}
