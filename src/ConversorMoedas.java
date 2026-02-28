
import java.util.Locale;
import java.util.Scanner;

public class ConversorMoedas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Conversor de Moeda");

        System.out.println("Digite o primiero valor em REAL: ");
        double moedaReal = scanner.nextDouble();

        System.out.println("\n 1 - Dólar \n 2 - Euro \n 3 - Libra \n 4 - Lene\n 5 - Franc ");
        int moedaEscolhida = scanner.nextInt();

        double valorConvertido = 0;

        if (moedaEscolhida == (1)){
            valorConvertido = moedaReal / 5.13;
            String valorConvertidoFormatado = String.format ("%.2f" , valorConvertido);
            System.out.println("O valor convertido de Real ("+ moedaReal +") para Dolar é: " + valorConvertidoFormatado);
        }
        else if (moedaEscolhida == (2)){
            valorConvertido = moedaReal / 6.06;
            String valorConvertidoFormatado = String.format ("%.2f" , valorConvertido);
            System.out.println("O valor convertido de Real ("+ moedaReal +") para Euro é: " + valorConvertidoFormatado);
        }
        else if (moedaEscolhida == (3)){
            valorConvertido = moedaReal/ 6.91;
            String valorConvertidoFormatado = String.format ("%.2f" , valorConvertido);
            System.out.println("O valor convertido de Real ("+ moedaReal +") para Libra é: " + valorConvertidoFormatado);
        }
        else if (moedaEscolhida == (4)){
            valorConvertido = moedaReal / 0.033;
            String valorConvertidoFormatado = String.format ("%.2f" , valorConvertido);
            System.out.println("O valor convertido de Real ("+ moedaReal +") para Lene é: " + valorConvertidoFormatado);
        }
        else if (moedaEscolhida == (5)) {
            valorConvertido = moedaReal / 6.68;
            String valorConvertidoFormatado = String.format ("%.2f" , valorConvertido);
            System.out.println("O valor convertido de Real ("+ moedaReal +") para Franc é: " + valorConvertidoFormatado);
        }
        else{
            System.out.println("Erro, Digite um valor corretamente!!!");

        scanner.close();
        }
    }
}