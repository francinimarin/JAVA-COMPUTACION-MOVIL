import java.util.Scanner;

public class Principal { 
	
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("ingrese los datos de la persona:");
	persona per=new persona();
	System.out.println("Ingrese el nombre de la persona:");
	per.Setnombre(teclado.next());
	System.out.println("Ingrese la estatura de la persona:");
	per.setestatura(teclado.nextDouble());
    System.out.println("Ingrese el peso de la persona:");
    per.Setpeso(teclado.nextDouble());
    
    calculo cal=new calculo();
    cal.calculoIMC(per);
}
	
	
}
