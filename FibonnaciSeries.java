import java.util.Scanner;
public class FibonnaciSeries{
  public static int fibo(int n){
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else{
      return fibo(n-1)+fibo(n-2);
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of terms you want in the series");
    int n=sc.nextInt();
    System.out.println("The series is:");
    for(int i=0;i<n;i++){
      System.out.print(fibo(i)+" ");
    }
  }
}