package hola;

public class h {

   

    public void comparar (int numero){

        if ((numero % 3 == 0) && (numero % 5 == 0)){

            System.out.println("fizzbazz");

        }else if (numero % 3 == 0){
            System.out.println("fizz");
        }else if (numero % 5 == 0){
            System.out.println("bazz");
        }else{
            System.out.println(numero);
        }
            

        

    }
}
