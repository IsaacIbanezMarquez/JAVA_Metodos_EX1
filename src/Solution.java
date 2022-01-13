import java.util.Scanner;

public class Solution
{

    // 1.- Crear un método que muestre los datos  (nombre, apellido y la edad) de un usuario, ingresado por teclado.
    

    Scanner informe = new Scanner(System.in);
    public void datos(String nombre,String apellido,int edad)
    {
        System.out.println("Ingrese el nombre");
        nombre = informe.next();
        System.out.println("Ingrese el apellido");
        apellido = informe.next();
        System.out.println("Ingrese su edad");
        edad = informe.nextInt();
        System.out.println("Los datos del usuario son "+nombre+" "+apellido+" y su edad es "+edad);
    }
    public static void main(String[]args)
    {
        Solution robi = new Solution();
        robi.datos(" ","",0);
    }
}