
public class Aluno implements Comparable<Aluno>{
    private String nome = "";
    private int idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Aluno a) {
        if(this.getIdade()<a.getIdade()){
            return -1;
        }
        if(this.getIdade()>a.getIdade()){
            return 1;
        }
        return 0;
    }  
}
