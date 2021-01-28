//dados básicos para abertura de conta
public class Cliente{
        private String nome;
        private String cpf;
        private String dataNascimento;
        private boolean sexo; // True == Masculino  | False == Feminino
        private String profissao;

    public Cliente(String nome, String cpf, String dataNascimento, String profissao, boolean sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.sexo = sexo;
        }

    //encapsulamento
    public String getProfissao(){
        return profissao;
    }
    
    public boolean hasSexo(){
        return sexo;
    }
    
    public void imprime(){
        System.out.print(this.nome + " -- " + this.cpf + " -- " + this.dataNascimento + " -- " + this.profissao + " -- " + this.sexo);
    }

}

