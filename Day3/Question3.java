import  java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number for which you want to print the table ");
        int n = sc.nextInt();

        int count =1;
        while (count <= 10) {
            System.out.println(n+ " * "+( count) +" = " + (n*count));count++;
        }
    }
}
