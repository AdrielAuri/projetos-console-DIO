package ContaBanco;
public class ContaTerminal {

    private String nomeCliente;
    private int numeroConta;
    private String agencia;
    private double saldoCliente;

    void exibirInformacao(){
        System.out.println("\n\n===== BANCO BRADESCO =====");
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!!!", nomeCliente);
        System.out.printf("\nSua agência é: %s", agencia ); 
        System.out.printf("\nO número da conta é: %d", numeroConta);
        System.out.printf("\nSaldo disponível para saque: R$ %.2f", saldoCliente);
        System.out.println("\n\n");
    }

    public ContaTerminal() {
    }

    public ContaTerminal(String nomeCliente, int numeroConta, String agencia, double saldoCliente) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldoCliente = saldoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    } 
}
