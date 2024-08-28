import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro!");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite um segundo número inteiro!");
        int parametroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {          
           System.out.println("Selecione o primeiro numero menor que o segundo numero!");
           
           
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm >= parametroDois) {
            throw new ParametroInvalidoException();
           
        }
        int contagem = (parametroDois - parametroUm) + 1;

        System.out.println("O primeiro número escolhido foi: " + parametroUm + ". O segundo número escolhido foi: " + parametroDois + ". Serão imprimidos " + contagem + " números.");

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

class ParametroInvalidoException extends Exception {
    }
    
    




