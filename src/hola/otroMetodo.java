package hola;
import java.math.BigDecimal;

import java.util.Scanner;

public class otroMetodo {
    
	public static void main(String[] args) {
		
		double fd1 = 0;
		double x1 = -4;
		double x2 = 0;
		double fx2 = 0;
        double error = 0.000001;
		int puntos = 6;
        int Tc = 50;
		
		int Nc= 1;

				
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
        System.out.println("La funcion es: x^3 + 3.5x^2 -40");
        System.out.println();
        
		System.out.println("****************************************************************************************");
		System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", "NC", "x1", "F(X1) ", "F'(X1)", "X2", "F(X2)");
		System.out.println("****************************************************************************************");
		
        //Funcion x1
		double fx1= Math.pow(x1, 3) - Math.pow(x1, 2)- 4*x1 + 4;
		BigDecimal bd = new BigDecimal(fx1);
        bd = bd.setScale(puntos, BigDecimal.ROUND_DOWN);
        fx1 = bd.doubleValue();
		
		do {
			//derivada x1
			fd1 =   3 * Math.pow(x1, 2) - 2 * x1 - 4;
			bd = new BigDecimal(fd1);
        	bd = bd.setScale(puntos, BigDecimal.ROUND_DOWN);
        	fd1 = bd.doubleValue();

			x2 = x1 - (fx1/fd1);

			bd = new BigDecimal(x2);
        	bd = bd.setScale(puntos, BigDecimal.ROUND_DOWN);
        	x2 = bd.doubleValue();

            //Funcion de x2
			fx2 = Math.pow(x2, 3) - Math.pow(x2, 2)- 4*x2 + 4;
			 bd = new BigDecimal(fx2);
        	bd = bd.setScale(puntos, BigDecimal.ROUND_DOWN);
        	fx2 = bd.doubleValue();
			
			System.out.printf("%d %15.6f %15.6f %15.6f %15.6f %15.6f\n",Nc,x1,fx1,fd1,x2,fx2);
			
			if ( Math.abs (fx2) > error  && Nc<Tc ) {
				Nc ++;
				x1 = x2;
				fx1 = fx2;
			}else if (Math.abs (fx2)<= error) {
				System.out.println("");
				System.out.println("“La Raíz de la Ecuación= " + x2);			
			}else {
				System.out.println("");
				System.out.println("No se encontró la Raíz");
			}
			
		}while (Math.abs (fx2) > error  && Nc<Tc);
	
	}
}
