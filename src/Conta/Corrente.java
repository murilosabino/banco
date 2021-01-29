package src.Conta;

public class Corrente extends Conta {

    public Corrente(double saldo, int agencia, String conta) {
        super(saldo, agencia, conta);
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "Corrente{" +
                "saldo=" + getSaldo() +
                ", agencia=" + agencia +
                ", conta='" + conta + '\'' +
                '}';
    }
}
