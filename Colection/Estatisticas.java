package colection;

import java.util.Scanner;

public class Estatisticas {

    private int PontosDeVida = 0;
    private int DefesaEspecial = 0;
    private int Defesa = 0;
    private int Ataque = 0;
    private int Velocidade = 0;

    public void AtribuirEstatistica() {

        int i = 0;
        int Valor = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Todos as estatísticas dos pokemons devem ser maiores que zero e menores que 200.");

        i = 0;
        while ( i != 1 ){

            System.out.println("Atribua a vida do pokemon.");

            Valor = scan.nextInt();

            if (Valor > 0 && Valor <= 200) {

                PontosDeVida = Valor;
                i = 1;

            } else {
                System.out.println("Valor invalido.");
            }
        }
        
        i = 0;
        while ( i != 1 ){

            System.out.println("Atribua a Defesa Especial do pokemon.");

            Valor = scan.nextInt();

            if (Valor > 0 && Valor <= 200) {

                DefesaEspecial = Valor;
                i = 1;

            } else {
                System.out.println("Valor invalido.");
            }

        }

        i = 0;
        while ( i != 1 ){

            System.out.println("Atribua a Defesa do pokemon.");

            Valor = scan.nextInt();

            if (Valor > 0 && Valor <= 200) {

                Defesa = Valor;
                i = 1;

            } else {
                System.out.println("Valor invalido.");
            }

        }

        i = 0;
        while ( i != 1 ){

            System.out.println("Atribua o Ataque do pokemon.");

            Valor = scan.nextInt();

            if (Valor > 0 && Valor <= 200) {

                Ataque = Valor;
                i = 1;

            } else {
                System.out.println("Valor invalido.");
            }

        }
        i = 0;
        while ( i != 1 ){

            System.out.println("Atribua a Velocidade do pokemon.");

            Valor = scan.nextInt();

            if (Valor > 0 && Valor <= 200) {

                Velocidade = Valor;
                i = 1;

            } else {
                System.out.println("Valor invalido.");
            }

        }
    }
    @Override
    public String toString() {
        return "\nEstatisticas : Pontos de Vida = " + PontosDeVida + "\nDefesa especial = " + DefesaEspecial + "\nDefesa = "
                + Defesa + "\nAtaque = " + Ataque + "\nVelocidade = " + Velocidade;
    }

    
}
