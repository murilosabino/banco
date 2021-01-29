package src.Conta;

public class Poupanca extends Conta {

    public Poupanca(double saldo, int agencia, String conta){
        super(saldo, agencia, conta);
    }

    public double getSaldo(){
        return saldo + saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Poupança{" +
                "saldo=" + getSaldo() +
                ", agencia=" + agencia +
                ", conta='" + conta + '\'' +
                '}';
    }

}
