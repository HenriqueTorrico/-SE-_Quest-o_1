package excondicional1;
    import java.util.Scanner;
public class ExCondicional1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);        
        System.out.println ("Digite um número");
        int n = entrada.nextInt();       
        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }   
}
