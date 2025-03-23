package IphoneModelado;

import java.util.Scanner;

public class IphoneMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeMusica;
        String opcaoEscolha;

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegarInternet internet = new NavegarInternet();

        System.out.println("===== Tela inicial do Iphone =====");
        System.out.println("\nEscolha uma das opções a seguir");
        System.out.println("1 - Reprodutor Musical");
        System.out.println("2 - Aparelho telefônico");
        System.out.println("3 - Navegar na internet");
        opcaoEscolha = sc.nextLine();

        switch (opcaoEscolha) {
            case "1" -> {
                nomeMusica = reprodutor.selecionarMusica(); // Obtém o nome da música
                reprodutor.tocar(nomeMusica); // Toca a música selecionada

                System.out.println("Deseja pausar a música?\n1 - Sim\n2 - Não");
                opcaoEscolha = sc.nextLine();

                if (opcaoEscolha.equals("1")) {
                    reprodutor.pausar();
                } else {
                    System.out.println("A música continuará tocando.");
                }
            }

            case "2" ->{
                
                aparelho.ligar();

                System.out.println("\nO número 71 98512-6485 está ligando, deseja atender? ");
                System.out.println("1 - Sim\n2 - Não");
                opcaoEscolha = sc.nextLine();

                if(opcaoEscolha.equals("1")){
                    aparelho.atender();
                } else {
                    System.out.println("Chamada recusada.");
                }

                System.out.println("Deseja iniciar um correio de voz?");
                System.out.println("1 - Sim\n2 - Não");
                opcaoEscolha = sc.nextLine();

                if(opcaoEscolha.equals("1")){
                    aparelho.iniciarCorreioVoz();
                } else {
                    System.out.println("Chamada finalizada.");
                }
            }

            case "3" ->{

                internet.exibirPagina();

                System.out.println("\nDeseja abrir uma nova aba?");
                System.out.println("1 - Sim\n2 - Não");
                opcaoEscolha = sc.nextLine();

                if(opcaoEscolha.equals("1")){
                    internet.adicionarNovaAba();
                } else {
                    return;
                }
                
                System.out.println("\nDeseja atualizar a página?");
                System.out.println("1 - Sim\n2 - Não");
                opcaoEscolha = sc.nextLine();

                if(opcaoEscolha.equals("1")){
                    internet.atualizarPagina(); 
                }else {
                    return;
                }
                
                
            }
        }
        
        sc.close(); // Fecha o Scanner corretamente
    }
}