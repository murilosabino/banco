package src.Conta;

public class Conta {
    public Conta(double saldo, int agencia, String conta) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
    }

    protected double saldo;
    protected int agencia;
    protected String conta;

}
