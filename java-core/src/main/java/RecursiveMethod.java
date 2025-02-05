import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveMethod {
    public static Long[] fibos;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1-enter a num to calculate fibonatchi:");
        int in=Integer.parseInt(scanner.nextLine());
        fibos=new Long[in+1];
        System.out.println(fibonatchi(in));
    }

    public static Long fibonatchi(int n)
    {
        if(n==0 || n==1){
            fibos[n]=Long.parseLong(String.valueOf(n));
            return Long.parseLong(String.valueOf(n));
        }
        if(fibos[n]==null)
            fibos[n]=fibonatchi(n-1)+fibonatchi(n-2);

        fibos[n]=fibos[n-1]+fibos[n-2];
        return fibos[n];
    }
}
