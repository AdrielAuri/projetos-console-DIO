package IphoneModelado;

import java.util.Scanner;

public class ReprodutorMusical {
    private final Scanner sc; 

    // Construtor padrão inicializando o Scanner
    public ReprodutorMusical() {
        this.sc = new Scanner(System.in);
    }

    // Método para selecionar uma música e retornar o nome
    public String selecionarMusica() {
        System.out.println("\n==== Informe a música que deseja tocar ====");
        System.out.println("\n1 - Chega de Saudade (Tom Jobim)");
        System.out.println("2 - Garota de Ipanema (Tom Jobim)");
        System.out.println("3 - Só os Loucos Sabem (CBJr)");

        String opcao = sc.nextLine();
        return switch (opcao) {
            case "1" -> "Chega de Saudade (Tom Jobim)";
            case "2" -> "Garota de Ipanema (Tom Jobim)";
            case "3" -> "Só os Loucos Sabem (CBJr)";
            default -> "Música não encontrada";
        };
    }

    // Método para tocar a música selecionada
    public void tocar(String nomeMusica) {
        System.out.println("\nTocando música: " + nomeMusica);
    }

    // Método para pausar a música
    public void pausar() {
        System.out.println("\nMúsica pausada.");
    }

    // Método para fechar o Scanner quando não for mais necessário
    public void fecharScanner() {
        sc.close();
    }
}