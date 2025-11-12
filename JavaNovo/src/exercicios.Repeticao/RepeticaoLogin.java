package exerciciosRepeticao;

import java.util.Scanner;

public class RepeticaoLogin {

    public static void main(String[] args) {

        String usuario = "Gege";
        String senha = "Gege123";

        System.out.println("**** FAZER LOGIN *****");

        Scanner sc = new Scanner(System.in);

        int tentativas = 0;
        boolean logado = false;

        while (tentativas < 3 && !logado) {  // máximo de 3 tentativas
            System.out.println("Digite seu usuário: ");
            String nUsuario = sc.next();

            System.out.println("Digite sua senha: ");
            String nSenha = sc.next();

            if (usuario.equals(nUsuario) && senha.equals(nSenha)) {
                System.out.println("✅ Login realizado com sucesso!");
                logado = true;
            } else {
                System.out.println("❌ Usuário ou senha incorretos. Tente novamente.");
                tentativas++;
            }
        }

        if (!logado) {
            System.out.println("\n🚫 Número máximo de tentativas atingido. Acesso bloqueado.");
        }

        sc.close();
    }
}
