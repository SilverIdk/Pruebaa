package hola;

public class Secante {
    
	public static void main(String[] args) {
		
		double x1 =80;
		double x2 = 90;
		double f1 = 0;
		double f2 = 0;
		
		double x3 = 0;
		double f3 = 0;
		
		double error= 0.00001;
		int NC = 100;

				
		Imprimir();
		System.out.println("****************************************************************************************************");
		System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s %-15s\n", "NC", "x1", "f1", "x2", "f2", "x3", "f3");
		System.out.println("****************************************************************************************************");
		for (int i = 0; i<NC; i++ ) {
			
			f1=calcular(x1);
			f2=calcular(x2);
			x3=tres(x1,x2,f1,f2);
			f3=calcular(x3);
			
			System.out.printf("%d %15.6f %15.6f %15.6f %15.6f %15.6f  %15.6f\n",i+1,x1,f1,x2,f2,x3,f3);
			
			if( Math.abs(f3) > 0.00001 ) {
				x1=x2;
				x2=x3;
				f1=f2;
				f2=f3;
			}else {
				if(f3 < error) {
					System.out.println("****************************************************************************************************");
					System.out.println("La raiz de la ecuacion es =" + x3);
					System.out.println();
					break;
				}else {
					System.out.println("no se encontro la raiz");
					break;
				}
			}
		}
		
    }
	
	
	public static void Imprimir () {
		String texto1 = "Instituto Tecnologico de Culiacan";
		String texto2 = "Ingeniero en sistemas computacionales";
		

        System.out.printf("%" + ((80 - texto1.length()) / 2) + "s%s\n", "", texto1);
        System.out.printf("%" + ((80 - texto2.length()) / 2) + "s%s\n", "", texto2);
        System.out.println();
        
        System.out.println("Jose Enrique Espindola Leyva");
        System.out.println("Raices de una Ecuacion. Metodo de la Secante");
        System.out.println("De 8:00 a 9:00");
        System.out.println();
        System.out.println("Este programa ejectuta el proceso del calculo de Raices de una ecuacion utilizando el metodo de la secante.");
        System.out.println();
        System.out.println("La funcion es: f(x)=-0.000234(x-80)2+1.");
        System.out.println();
    
	}
	
	public static double calcular (double x ) {
		
		double a = -0.000234*(Math.pow((x-80), 2))+1.5;
		
		return a;
	}
	
	public static double tres (double x1, double x2, double f1, double f2) {
		
		double x3=x1 - ((x1-x2)*(f1))/(f1-f2);
		
		return x3;
	}
}
