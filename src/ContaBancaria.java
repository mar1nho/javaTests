public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numero;
    private String tipo;

    public ContaBancaria(String titular, double saldo, String numero, String tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
}
