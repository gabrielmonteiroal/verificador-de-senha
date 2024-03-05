import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha;
        boolean acessoPermitido = false;

        while (!acessoPermitido) {
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();

            if (senha == 2002) {
                acessoPermitido = true;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        sc.close();
    }
}