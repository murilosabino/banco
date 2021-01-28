//dados básicos para abertura de conta
    public class Cliente{
        private String nome;
        private String cpf;
        private String dataNascimento;
        private String sexo;
        private String profissao;
    

    public Cliente(String nome, String cpf, String dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        setProfissao(profissao);
        setSexo(sexo);

        }
    

    //encapsulamento
    public String getProfissao(){
        return profissao;}
    
    public String getSexo(){
        return sexo;}

    
    public void setProfissao(String profissao){
        this.profissao = profissao;}

    public void setSexo(String sexo){
        this.sexo = sexo;}
    
        public void imprime(){
            System.out.println(this.nome + "\n" + this.cpf + "\n" + this.dataNascimento + "\n" 
            + this.profissao + "\n" + this.sexo);
        }

}

