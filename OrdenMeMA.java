import java.util.*;
public class OrdenMeMA {
 public static void main(String[] args) {
 int  num1,num2,;
 Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca el primer  numero: " );
     num1 =  sc.nextInt();
     System.out.print("Introduzca el segundo  numero: " );
     num2 =  sc.nextInt();
     if (num1>num2)
      System.out.println("El orden es\n"+num2+ " menor\n"+num1+ " mayor");
      else if (num2>num1)
       System.out.println("El orden es\n"+num1+ " menor\n"+num2+ " mayor");
   }
 }  