import java.util.Scanner;
import java.util.Locale;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primeiro valor");
        int parametroUm = scanner.nextInt();

        System.out.println("Informe o segundo valor");
        int parametroDois = scanner.nextInt();

        try{

            contar(parametroUm, parametroDois);

        }catch (ParametroInvalidoException e){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar (int paramentroUm, int paramentroDois) throws ParametroInvalidoException {
        int contagem = 0;

        if(paramentroUm < paramentroDois){
            contagem = paramentroDois - paramentroUm;
        }else {
            throw new ParametroInvalidoException();
        }

        for(int x = 1; x <= contagem; x++){
            System.out.println("Imprimindo o numero " + x);
        }

    }
}