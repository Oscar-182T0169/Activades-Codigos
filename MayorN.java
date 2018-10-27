import java.util.*;
public class MayorN{
 public static void main(String[] args) {
 int  num1,num2;
 Scanner sc = new Scanner(System.in);
     System.out.print("intorduzca el primer numero: " );
     num1 =  sc.nextInt();
     System.out.print("intorduzca el segundo numero: " );
     num2 =  sc.nextInt();
     if (num1>num2)
     System.out.println("el numero mayor es:"+ num1);
     else if (num2 > num1)
      System.out.println("el numero mayor es:"+ num2);
     }
     }