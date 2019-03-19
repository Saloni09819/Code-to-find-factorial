import java.util.Scanner;

public class Factorial
{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
     System.out.println("Enter the number whose factorial you want: ");
     int n = in.nextInt();
     int f =1;
     for(int i=n; i>0; i--){
     f = f*i;
}
System.out.println("Factorial of "+n+" is "+f);
}
}