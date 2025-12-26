import java.util.*;
public class Main{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
              int m=sc.nextInt();
              int s=0;
              for(int n=m; n<=100; n++)
                s=s+n;
              System.out.println(s);
    }
}

