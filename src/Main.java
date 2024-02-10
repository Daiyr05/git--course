import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println( work(20));
        System.out.println("First project in git hub");
    }
    public static char findKthBit(int n, int k) {
        return work(n).charAt(k-1);
    }


    public static String work(int n){
        String res = "";
        if(n==1){
            return "0";
        }
        String temp = reverse(invert(work(n-1)));
        return work(n-1)+"1"+temp;
    }


    public static String invert(String str){
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i]=='0'){
                arr[i] = '1';
            }else{
                arr[i] = '0';
            }
        }
        String res = "";

        for(char c :arr){
            res+=c;
        }
        return res;
    }

    public static String reverse(String str){
        String res = "";
        for(int i = str.length()-1; i >=0; i--){
            res+=str.charAt(i);
        }
        return res;
    }
}



