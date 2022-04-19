
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pecas implements Comparable<Pecas>{

    private String nome;
    private double altura;
    private double peso;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public int compareTo(Pecas p) {
            if(this.getAltura()<p.getAltura()){
                return -1;
            }
            if(this.getAltura()>p.getAltura()){
                return 1;
            }
        return 0;
        
    }  
    
    public List<Pecas> comparar(List<Pecas> lista){
        List<Pecas> listComparar = new ArrayList<Pecas>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAltura()>30){
                listComparar.add (lista.get(i));
            }
        }
        Collections.sort(listComparar);
        return listComparar;
    }
}
