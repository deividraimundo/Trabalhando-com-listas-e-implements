
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lista {

    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Julia");
        aluno1.setIdade(90);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("João");
        aluno2.setIdade(30);
        
        List<Aluno> lista = new ArrayList<Aluno>();
        lista.add(aluno1);
        lista.add(aluno2);
        
        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getIdade());
        }
    } 
}
