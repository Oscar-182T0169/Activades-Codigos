import java.util.*;
public class Ejemplo12 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a, cont =0;
  System.out.print("Introduzca un numero: ");
  a = sc.nextInt();
  while (a!=0)
    {
    if (a > 0)
    System.out.println("Es positivo");
   else
    System.out.println( " Es negativo");
     System.out.print("Introduzca otro numero: "); 
     a=sc.nextInt();
     cont++;
      }
      System.out.print("Haz introducido un cero e ingreso un numero " +cont+"veces");
  }
  }
  
  