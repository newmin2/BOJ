import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int idx=0;
        for(int i=1;i<=9;i++){
            int num = Integer.parseInt(bf.readLine());
            if(max<num){
                max=num;
                idx=i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}