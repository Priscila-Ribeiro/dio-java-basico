import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

   
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();


        System.out.print("Por favor, digite o número da sua conta: ");
        int conta = scanner.nextInt();


        System.out.print("Por favor, digite o seu primeiro nome: ");
        String cliente = scanner.next();
        
        // Consulta o saldo da conta

        final double saldo = 5000;
      

System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco.");
System.out.println("sua agência é " + agencia + ".");
System.out.println("Sua conta é " + conta + "."); 
System.out.println("Seu saldo de U$ " + saldo + " e já está disponível para saque."); 

    }
}
