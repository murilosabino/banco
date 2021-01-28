public class Banco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Murilo", "12345678900", "11/03/1997");
        cliente1.setProfissao("Estudante");
        cliente1.setSexo("Masculino");

        cliente1.imprime();
    }
}
