package hola;

public class grafica {
    public static void main(String[] args) {
		double numero = 0;
		int j= 0;
		for (double i = -3; i<=3; i++ ) {
			j++;
            //ecuacion
			numero = Math.pow(i, 3) - Math.pow(i, 2)- 4*i + 4;
			System.out.printf("%d %15f %15.3f\n",j , i, numero);
		}

	}
}
