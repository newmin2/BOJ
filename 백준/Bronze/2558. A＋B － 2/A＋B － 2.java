import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(bf.readLine())+Integer.parseInt(bf.readLine()));
    }
}