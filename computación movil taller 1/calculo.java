
public class calculo {

	public void calculoIMC(persona per) {

		double imc = (per.getpeso()/per.getestatura()*per.getestatura());
		System.out.println("El calculo del IMC de "+per.getnombre()+"es"+imc);
		
		//clasificación del imcw   
		
        if (imc<18.5) {
            System.out.println("BAJO PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("NORMAL");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
	}
}
