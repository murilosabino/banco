package src;

import src.Cliente.Cliente;
import src.Conta.Corrente;
import src.Conta.Poupanca;

public class Banco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Murilo", "12345678900", "11/03/1997", "Dev", true);

        Corrente cc = new Corrente(1000.0,0001, "400050-1");
        Poupanca cp = new Poupanca(1000.0,0001, "400050-2");
        System.out.println(cc);
        System.out.println(cp);
        cc.deposita(1000);
        System.out.println(cc);
        cp.deposita(500);
        System.out.println(cp);

        cp.saque(100);
        System.out.println(cp);
    }
}
