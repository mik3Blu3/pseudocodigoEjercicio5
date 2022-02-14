import java.util.Scanner;
public class A2E5
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int cantMujerMayorEdad = 0;
        int cantHombreMenorEdad = 0;
        int inicioDatos = 1;
        System.out.println("Ingresemos cuantos datos de edad y sexo desea ingresas: ");
        int numeroDatos = entrada.nextInt();
        while(inicioDatos <= numeroDatos)
        {
            System.out.println("Ingrese la edad de la persona #"+inicioDatos);
            int edadt = entrada.nextInt();
            System.out.println("Ingrese el sexo de la persona #"+inicioDatos+ " Masculino = 0 : Femenino = 1");
            int sexot = entrada.nextInt();
            if(sexot == 0)
            {
                if(edadt < 18)
                {
                    cantHombreMenorEdad = cantHombreMenorEdad +1;
                }
            }else if(sexot == 1)
            {
                if(edadt >= 18)
                {
                    cantMujerMayorEdad = cantMujerMayorEdad+1;
                }
            }
            inicioDatos++;
        }
        System.out.println("La cantidad de Mujeres mayores de edad fue de: "+cantMujerMayorEdad);
        System.out.println("La cantidad de Hombres menores de edad fue de: "+cantHombreMenorEdad);
    }
}