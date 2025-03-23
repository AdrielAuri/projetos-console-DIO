package IphoneModelado;
import java.util.Scanner;

public class AparelhoTelefonico {
    Scanner sc = new Scanner(System.in);

    private int numeroCelular;

    void ligar(){
        System.out.printf("\nInforme o número telefone que deseja ligar:");
        numeroCelular = sc.nextInt();
        System.out.println("Ligando para o número " + numeroCelular);
    }

    void atender(){
        System.out.println("Chamada atendida");
    }

    void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    public AparelhoTelefonico() {
    }

    public AparelhoTelefonico(Scanner sc, int numeroCelular) {
        this.sc = sc;
        this.numeroCelular = numeroCelular;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    
}
