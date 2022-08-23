//IFSP - Exercício - LG2A2
import java.util.Scanner;

class Fumante {
    public static void main(String[] args) {

        //Read da resposta do usuario
        Scanner entrada = new Scanner (System.in); 

        String texto, cigarro, valor, fumantesim;
        int TempoFumante, QuantidadeCigarros, QuantidadeCigarrosAno;
        float ValorCarteira, GastoTotal;
        
        //Cabecalho
        System.out.println("------------------------------------------------------");
        System.out.println("Calculadora\nQuanto gasta um fumante ao longo da vida com cigarro?");
        System.out.println("------------------------------------------------------");

        //Pergunta
        System.out.println("\nVocê é fumante? [Digite S/N]");
        fumantesim = entrada.nextLine();

        if(fumantesim.equals("S")){
            //Pergunta
            System.out.println("\nA quantos anos você é fumante?"); 

            //Definindo a variavel texto
            texto = entrada.nextLine();  

            //Definindo e Convertendo a variavel TempoFumante em inteiro, pois Java le apenas String
            TempoFumante = Integer.parseInt(texto); 

            //Print -  teste
            //System.out.printf("\nEu fumo há %d anos\n",TempoFumante);

            //Pergunta
            System.out.println("\nQuantos cigarros você fuma por dia?");

            //Definindo a variavel cigarro
            cigarro = entrada.nextLine();

            //Definindo e Convertendo a variavel QuantidadeCigarros em inteiro, pois Java le apenas String
            QuantidadeCigarros = Integer.parseInt(cigarro); 

            //Print - teste
            //System.out.printf("\nEu fumo %d cigarros por dia\n", QuantidadeCigarros);

            //Pergunta
            System.out.println("\nQuanto custa uma carteira de cigarros?");

            //Definindo a variavel valor
            valor = entrada.nextLine();        

            //Definindo e Convertendo a variavel ValorCarteira em float
            ValorCarteira = Float.parseFloat(valor);

            //Print - teste
            //System.out.printf("\nO valor da carteira de cigarros é %.2f\n", ValorCarteira);

            //Calculo de quanto um fumante gasta ao longo da vida com cigarro
            //Definindo a quantidade de cigarros fumados
            QuantidadeCigarrosAno = ((TempoFumante*365)*QuantidadeCigarros);

            //Print - teste
            //System.out.printf("%d", QuantidadeCigarrosAno);

            //Definindo o GastoTotal
            GastoTotal = ((QuantidadeCigarrosAno/20)*ValorCarteira);

            //Print do resultado
            System.out.println("\nConsiderando que uma carteira de cigarros possui 20 cigarros.\n");
            System.out.printf("Você gastou em carteiras de cigarros:\n%.2f reais\n", GastoTotal);

            //Fecha o scanner
            entrada.close();
        }
        else{
            System.out.println("Fim do Programa");
        }
    }
}