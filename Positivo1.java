import java.util.*;
public class Positivo1 {
 public static void main(String[] args) {
 int  numero;
 Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca un numero: " );
     numero =  sc.nextInt();
     if (numero>0)
     System.out.println("Es positivo el numero:"+ numero);
     else if (numero<0)
      System.out.println("Este numero: \n"+ numero+" \nEs negativo");
     }
   }