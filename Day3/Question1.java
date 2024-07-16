import  java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("greatest number is "+ Math.max(a,Math.max(b,c)));

    //approch 2
      meth1(a,b,c);

    }

    public static void meth1(int a, int b, int c) {
        if(a>b && a>c) System.out.println(a+" is greatest");
       else if(b>a && b>c) System.out.println(b+" is greatest");
      else  if(c>a && c>b) System.out.println(c+" is greatest");
      else System.out.println("number are equal");


    }
}
