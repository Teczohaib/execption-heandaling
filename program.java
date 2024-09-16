import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
         int x= sc.nextInt();
         int y= sc.nextInt();
         int z= x/y;
         System.out.println("division is "+z);   
        } catch (Exception e) {
            System.out.println("error is "+e.toString());
        }
    }
}